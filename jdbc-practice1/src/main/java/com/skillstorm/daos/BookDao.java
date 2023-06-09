package com.skillstorm.daos;

import java.util.List;

import com.skillstorm.models.Book;

/*
 * This class contains the CRUD methods
 * 
 * The Data Access Object is a class where we put all the logic for interacting with the database
 * Have a separate DAO for each table/entity
 */
public interface BookDao {
	
	// findAll() returns List<Book>
	List<Book> findAll();
	
	// findById(int isbn) returns Optional<Book> -- this is our primary key
	Book findByIsbn(String isbn);
	
	// save(Book book) returns Book (this is useful if we have an auto incremented id)
	Book save(Book book);
	
	// update(Book book) returns int (number of rows updated)
	int update(Book book);
	
	// delete(int id) or delete(T entity) returns int (number of rows deleted)
	boolean delete(int id);

	List<Book> findByGenre(String genre);

	List<Book> findByTitle(String title);

	List<Book> findByAuthorName(String firstName, String lastName);
}
