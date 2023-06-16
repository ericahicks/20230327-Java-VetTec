package com.skillstorm.training.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.skillstorm.training.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
	
	@Query("select b FROM Book b WHERE b.year > 2000")
	Iterable<Book> findAll();
	
	@Query(value = "SELECT * FROM books\r\n"
//			+ "WHERE author_first_name = ?1 AND author_last_name = ?2", nativeQuery = true)
			+ "WHERE :firstName IS NULL OR author_first_name = :firstName "
			+ " AND :lastName IS NULL OR author_last_name = :lastName", 
			nativeQuery = true)
	Iterable<Book> findByAuthorFirstNameAndAuthorLastName(@Param("firstName") String firstName, 
														@Param("lastName") String lastName);

}
