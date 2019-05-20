package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import com.uca.capas.domain.Book;
import com.uca.capas.service.BookService;



@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	
	@RequestMapping("/bookfind")
	public ModelAndView findDetalied(@RequestParam("selector") String selector, @RequestParam("search") String input){
		ModelAndView mav = new ModelAndView();
		List<Book> books = bookService.findDetailed(selector, input);
		mav.addObject("numero", bookService.countDetailed(selector, input));
		mav.addObject("search", input);
		mav.addObject("selector", bookService.capital(selector));
		mav.addObject("books", books);
		mav.setViewName("book/find");
		return mav;
	}
	
	@RequestMapping("/bookfindAll")
	public ModelAndView findAll(){
		ModelAndView mav = new ModelAndView();
		List<Book> books = bookService.findAll();
		mav.addObject("numLibros", bookService.countBooks());
		mav.addObject("numAutores", bookService.countAuthors());
		mav.addObject("books", books);
		mav.setViewName("book/findAll");
		return mav;
	}

}
