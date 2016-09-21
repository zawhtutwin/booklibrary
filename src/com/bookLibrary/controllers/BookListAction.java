package com.bookLibrary.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class BookListAction {
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	@ResponseBody
	public String hello(){
		return "Hello World";
	}
}
