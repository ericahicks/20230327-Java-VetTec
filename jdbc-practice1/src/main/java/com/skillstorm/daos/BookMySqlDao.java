package com.skillstorm.daos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
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
		return DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
	}
	
	@Override
	public List<Book> findAll() {
		DbConfig config;

		List<Book> books = new ArrayList<>();
		try {
			config = DbConfig.getInstance();
		
			try (Connection conn = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword())) {
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM books");
				
				// STEP 5
				while (rs.next()) {
					String title = rs.getString("title");
					String authorFirstName = rs.getString("author_first_name"); // string is the column name not the Book class's name
					String authorLastName = rs.getString("author_last_name");
					String isbn = rs.getString("isbn");
					String genre = rs.getString("genre");
					int releaseYear = rs.getInt("year");
					Book book = new Book(null,authorFirstName, authorLastName, title, null, releaseYear);
					books.add(book);
					System.out.println(title + " (" + releaseYear + ")");
				}
			} catch (SQLException e) {
				// do something
			}
			
		} catch (IOException e) {
			// unable to get instance so do something
		}
		return books;
		
	}

	@Override
	public Book findByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
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
