package com.bookLibrary.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookLibrary.dto.PostDto;
import com.restfb.Connection;
import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.FacebookClient.AccessToken;
import com.restfb.Parameter;
import com.restfb.json.JsonArray;
import com.restfb.json.JsonObject;
import com.restfb.types.Group;
import com.restfb.types.Message.Attachment;
import com.restfb.types.Post;
import com.restfb.types.StoryAttachment;
import com.restfb.types.User;
import com.restfb.types.Post.Attachments;

@Controller
@RequestMapping("/user")
public class BookListAction {

	public static final String MY_ACCESS_TOKEN = "";
	public static final String MY_APP_ID = "345021102514345";
	public static final String MY_APP_SECRET = "a49eee83956f884225208f54ab745338";

	@RequestMapping(value = "hello", method = RequestMethod.GET,produces="application/json")
	@ResponseBody
	public List<PostDto> hello(HttpServletRequest req) {
		String fromName= req.getParameter("fromName");
		System.out.println("From"+fromName);
		Properties prop = new Properties();
		try {
			prop.load(BookListAction.class.getClassLoader().getResourceAsStream("setting.properties"));
		} catch (IOException e) {
			
		}
		List<PostDto> descList = new ArrayList<PostDto>();
		String mode = "";
		mode  = prop.getProperty("mode");
		String token = "";
		if(mode.equals("debug")){
			token = prop.getProperty("debug_token");
		}else{
			AccessToken accessToken = new DefaultFacebookClient().obtainAppAccessToken(MY_APP_ID,MY_APP_SECRET);
			token =accessToken.getAccessToken();
		}
		
		FacebookClient facebookClient = new DefaultFacebookClient(token
				);
		Group group = facebookClient.fetchObject("1150599874957098",
				Group.class);
		Connection<Post> groupFeed = facebookClient.fetchConnection(
				"885671434865651/feed", Post.class,Parameter.with("fields", "from,message,picture"),Parameter.with("limit", 200));
		
		int index = 1;
		for (List<Post> groupPosts : groupFeed) {
			int innerIndex = 1;
			for(Post groupPost:groupPosts){
				 JsonObject obj = facebookClient.fetchObject(groupPost.getId()+"/attachments", JsonObject.class,Parameter.with("fields", "description"));
				 JSONObject obj2 = new JSONObject(obj.toString());
				 JSONArray  arr = obj2.getJSONArray("data");
				 for (int i = 0; i < arr.length(); i++)
				 {
				     String desc = arr.getJSONObject(i).getString("description");
				     System.out.println(desc);
				     PostDto dto = new PostDto();
				     dto.message = desc;
				     try{dto.from = groupPost.getFrom().getName();}catch(NullPointerException e){} 
				     descList.add(dto);
				 }
				 if(innerIndex>=200){break;}
			}
			break;
		}
		return descList;
	}
	
	@RequestMapping(value = "friend_list", method = RequestMethod.GET)
	@ResponseBody
	public String  getHi() {
		FacebookClient facebookClient = new DefaultFacebookClient(MY_ACCESS_TOKEN);
		Connection<User> myFriends = facebookClient.fetchConnection("me/friends",User.class,Parameter.with("Fields", "name,id,picture"));
	    for (List<User> myFriendConnectionPage : myFriends){
	    	  for (User user : myFriendConnectionPage){
	    		  	System.out.println("User Name:"+user.getName()+" User Picture URL:"+user.getPicture().getUrl());
	    	  }
	    }
	    return "done";
	  }
}