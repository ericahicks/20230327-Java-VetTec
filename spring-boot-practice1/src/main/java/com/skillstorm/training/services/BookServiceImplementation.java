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
		// Why should I filter the results in the query in the repository layer
		//  instead of here in the service layer?
		// 1. For reusability
		// 2. For network performance - only send the data you need
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

	@Override
	public Iterable<Book> findByAuthorFirstNameAndAuthorLastName(
			String firstName, String lastName) {
		return repo.findByAuthorFirstNameAndAuthorLastName(firstName, lastName);
	}

}
