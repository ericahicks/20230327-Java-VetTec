package com.skillstorm.daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.skillstorm.DbConfig;
import com.skillstorm.models.Book;

public class BookMySqlDao implements BookDao, AutoCloseable {

	// I need a connection to run the queries I want to run
	private Connection conn;

	public BookMySqlDao() throws IOException, SQLException {
		conn = getConnection();
	}

	private Connection getConnection() throws IOException, SQLException {
		if (conn != null)
			return conn;
		// else
		DbConfig config = DbConfig.getInstance();
		return DriverManager.getConnection(config.getUrl(), config.getUser(),
				config.getPassword());
	}

	@Override
	public List<Book> findAll() {

		List<Book> books = new ArrayList<>();
		try (Statement stmt = conn.createStatement();
				ResultSet results = stmt.executeQuery("SELECT * FROM books");) {
			books = readAll(results);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return books;

	}

	@Override
	public Book findByIsbn(String isbn) {
		// NOTE: use
		ResultSet rs = null;
		try {
			if (rs.next()) { // returns false if the result set is empty
				/// make a Book object and return it
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return null;
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
		try {
			PreparedStatement stmt = conn
					.prepareStatement("SELECT * FROM books WHERE genre = ?");
//			 BAD DO NOT USE statement and String concatenation instead use
			// PreparedStatement
//				ResultSet results = stmt.executeQuery("SELECT * FROM books WHERE genre LIKE \"%" + genre + "%\";")){

			// Hand the user input to the prepared statement
			stmt.setString(1, genre); // NOT zero indexed

			// Now you can run the query once you've replaced the question marks
			ResultSet results = stmt.executeQuery();
			// STEP 5
			books = readAll(results);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return books;
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

	@Override
	public void close() throws Exception {
		if (conn != null)
			conn.close();
	}

}
