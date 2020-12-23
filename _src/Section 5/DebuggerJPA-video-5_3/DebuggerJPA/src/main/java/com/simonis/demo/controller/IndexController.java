//video-5_3_start
package com.simonis.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simonis.demo.repositories.AuthorRepository;
import com.simonis.demo.repositories.BookRepository;

@Controller
public class IndexController {

	@Autowired
	private BookRepository books;
	@Autowired
	private AuthorRepository authors;
	
	public IndexController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/")
	public String getIndex(Model model)
	{
		model.addAttribute("authorlist", authors.findAll());
		
		return "index";
	}
	@GetMapping("/books")
	public String getIndexWithList(Model model, @RequestParam("authorid") Long authorid)
	{
		model.addAttribute("authorlist", authors.findAll());
		
		model.addAttribute("booklist", books.getBooksByAuthor(authorid));
		return "index";
		
	}

}
//video-5_3_end