package com.skillstorm.training.controllers;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.models.Book;
import com.skillstorm.training.services.BookService;

//@Component
//@Controller -- versatile if I want some of my methods to return html pages instead of json data

@RestController // This is a type of Component that is a controller that only returns json data
@RequestMapping("/books")
public class BookController {
	
	
	private final BookService service;
	
	@Autowired
	public BookController(BookService service) {
		this.service = service;
	}
	
//	@RequestMapping(value = "/books", method = RequestMethod.GET)
//	@ResponseBody
//	@GetMapping("/books")
	@GetMapping
	public Iterable<Book> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{isbn}")
	public Book findByIsbn(@PathVariable String isbn) {
		return service.findById(isbn);
	}
	
	@PostMapping
	public Book save(@RequestBody Book book) {
		return service.save(book);
	}
	
	@PutMapping
	public Book update(@RequestBody Book book) {
		return service.save(book);
	}
	
	@DeleteMapping
	public void delete(@RequestBody Book book) {
		service.save(book);
	}

}
