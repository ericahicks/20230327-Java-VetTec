package com.skillstorm.training.services;

import com.skillstorm.training.models.Book;

public interface BookService {
	
	Book findById(String isbn);
	
	Iterable<Book> findAll();
	
	Book save(Book book);
	
	void delete(Book book);

}
