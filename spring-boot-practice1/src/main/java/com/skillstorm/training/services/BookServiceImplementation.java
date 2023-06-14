package com.skillstorm.training.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.training.models.Book;
import com.skillstorm.training.repositories.BookRepository;

@Service
public class BookServiceImplementation implements BookService {
	
	
	private final BookRepository repo;
	
	@Autowired
	public BookServiceImplementation(BookRepository repo) {
		this.repo = repo;
	}
	
	@Override
	public Book findById(String isbn) {
		return repo.findById(isbn).orElse(null);
	}

	@Override
	public Iterable<Book> findAll() {
		return repo.findAll();
	}

	@Override
	public Book save(Book book) {
		return repo.save(book);
	}

	@Override
	public void delete(Book book) {
		repo.delete(book);
	}

}
