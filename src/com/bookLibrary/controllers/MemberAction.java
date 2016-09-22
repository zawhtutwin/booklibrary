package com.bookLibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookLibrary.dto.MemberDto;

@Controller
@RequestMapping("/register")
public class MemberAction {
	
	@RequestMapping(value = "show", method = RequestMethod.GET)
	public String show(){
		return "/member_registration.jsp";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public @ResponseBody void addMember(MemberDto memberDto) {
		System.out.println("member email:"+memberDto.email);
		System.out.println("member password:"+memberDto.password);
    }
}
