package com.bookLibrary.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bookLibrary.dao.BookDao;
import com.bookLibrary.vo.Book;

@Controller
@RequestMapping("/user")
public class BookListAction {
	@Autowired
	BookDao bookDao;
	
	@RequestMapping(value = "hello", method = RequestMethod.GET)
	@ResponseBody
	public List hello(){
		List<Book> bookList = bookDao.getAllBooks();
		return bookList;
	}
}
