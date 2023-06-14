package com.skillstorm.daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.skillstorm.DbConfig;
import com.skillstorm.models.Book;

public class BookMySqlDao implements BookDao {
	
	DbConfig config;

	public BookMySqlDao() throws IOException, SQLException {
		config = DbConfig.getInstance();
	}

	@Override
	public List<Book> findAll() {

		List<Book> books = new ArrayList<>();
		try (Connection conn = config.getConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet results = stmt.executeQuery("SELECT * FROM books");
			books = readAll(results);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return books;

	}

	@Override
	public Book findByIsbn(String isbn) {
		Book book = null;
		try (Connection conn = config.getConnection()) {
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM books WHERE isbn = ?");
			stmt.setString(1, isbn);
			ResultSet results = stmt.executeQuery();
			book = read(results);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return book;
	}
	
	@Override
	public List<Book> findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Book> findByAuthorName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Book> findByGenre(String genre) {
		List<Book> books = null;
		try (Connection conn = config.getConnection()){
			PreparedStatement stmt = conn
					.prepareStatement("SELECT * FROM books WHERE genre = ?");
// BAD DO NOT USE statement and String concatenation instead use PreparedStatement
//			ResultSet results = stmt.executeQuery("SELECT * FROM books WHERE genre LIKE \"%" + genre + "%\";")){

			// Hand the user input to the prepared statement
			stmt.setString(1, genre); // NOT zero indexed

			// Now you can run the query once you've replaced the question marks
			ResultSet results = stmt.executeQuery();
			books = readAll(results);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}
	
	private Book read(ResultSet rs) throws SQLException {
		Book book = null;
		if (rs.next()) {
			String genre = rs.getString("genre");
			String title = rs.getString("title");
			String authorFirstName = rs.getString("author_first_name");
			String authorLastName = rs.getString("author_last_name");
			String isbn = rs.getString("isbn");
			int releaseYear = rs.getInt("year");
			book = new Book(isbn, authorFirstName, authorLastName, title,
					genre, releaseYear);
//			System.out.println(title + " (" + releaseYear + ")");
		}
		return book; // null if none found
	}

	private List<Book> readAll(ResultSet rs) throws SQLException {
		List<Book> books = new ArrayList<>();
		while (rs.next()) {
			String genre = rs.getString("genre");
			String title = rs.getString("title");
			String authorFirstName = rs.getString("author_first_name");
			String authorLastName = rs.getString("author_last_name");
			String isbn = rs.getString("isbn");
			int releaseYear = rs.getInt("year");
			Book book = new Book(isbn, authorFirstName, authorLastName, title,
					genre, releaseYear);
			books.add(book);
//			System.out.println(title + " (" + releaseYear + ")");
		}
		return books;
	}

	@Override
	public Book save(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
