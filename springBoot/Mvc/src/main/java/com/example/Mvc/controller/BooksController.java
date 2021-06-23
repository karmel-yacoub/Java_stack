package com.example.Mvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Mvc.models.Book;
import com.example.Mvc.services.BookService;

public class BooksController {
	// ... imports removed for brevity
	
	    private final BookService bookService;
	    
	    public BooksController(BookService bookService) {
	        this.bookService = bookService;
	    }
	    
	    @RequestMapping("/books")
	    public String index(Model model) {
	        List<Book> books = bookService.allBooks();
	        model.addAttribute("books", books);
	        return "/books/index.jsp";
	    }
	    @RequestMapping("/books/new")
	    public String newBook(@ModelAttribute("book") Book book) {
	        return "/books/new.jsp";
	    }
	    @RequestMapping(value="/books", method=RequestMethod.POST)
	    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
	        if (result.hasErrors()) {
	            return "/books/new.jsp";
	        } else {
	            bookService.createBook(book);
	            return "redirect:/books";
	        }
	    }
	    
	    @RequestMapping("/books/{id}")
	    public String show (@PathVariable("id")Long id,Model model) {
	    	 Book book = bookService.findBook(id);
	    	 model.addAttribute("book", book);
	    	return "/books/show.jsp";
	    }
       @RequestMapping("/edit/{id}")
       public String edit(@PathVariable("id")Long id,@RequestParam(value ="title") String title,@RequestParam(value ="description") String desc,@RequestParam(value ="language") String lang,@RequestParam(value ="numberOfPages") Integer numOfPages ) {
    	  bookService.updateBook(id, title , desc ,lang, numOfPages);
    	  return "redirect:books/show.jsp";
       }
       @RequestMapping("/books/{id}/edit")
       public String showedit(@PathVariable("id")Long id,Model model) {
    	   Book book = bookService.findBook(id);
    	   model.addAttribute("book", book);
    	   return"/books/Edit.jsp";
       }
       
}

