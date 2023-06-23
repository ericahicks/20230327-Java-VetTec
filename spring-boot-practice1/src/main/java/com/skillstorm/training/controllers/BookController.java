package com.skillstorm.training.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.training.models.Book;
import com.skillstorm.training.services.BookService;

//@Component
//@Controller -- versatile if I want some of my methods to return html pages instead of json data
@CrossOrigin(origins = "*")
@RestController // This is a type of Component that is a controller that only
				// returns json data
@RequestMapping("/books")
public class BookController {

	private final Logger logger = LoggerFactory.getLogger(getClass());
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
	public ResponseEntity<Object> findByIsbn(@PathVariable String isbn) {
		Book book = service.findById(isbn);
		return book == null
				? new ResponseEntity<Object>("No book found with isbn " + isbn,
						HttpStatus.NOT_FOUND)
				: new ResponseEntity<Object>(book, HttpStatus.OK);
	}
	
	@GetMapping("/search") // localhost:8080/books/search?first-name=Joe&last-name=Schmoe
	public Iterable<Book> findByAuthorFirstNameAndAuthorLastName(
			@RequestParam(name = "first-name", required = false) String firstName,
			@RequestParam(name = "last-name", required = false) String lastName) {
		return service.findByAuthorFirstNameAndAuthorLastName(firstName, lastName);
	}
	

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Book save(@Valid @RequestBody Book book) {
		logger.debug("book handed in was: " + book);
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
