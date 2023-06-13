package com.skillstorm;

import java.util.List;
import java.util.Scanner;

import com.skillstorm.daos.BookDao;
import com.skillstorm.daos.BookMySqlDao;
import com.skillstorm.models.Book;

public class MyApp {

	// SQL Injections - when user input is run as sql code it is risky
	// Example: Enter in the String: " OR 1 = 1; --
	// when calling the findByGenre to get all instead
	// (don't forget space after -- )
	public static void main(String[] args) throws Exception {
		// This is an app that takes requests from a user
		// and displays data from a database
		Scanner in = new Scanner(System.in);

		System.out.println("Romance\r\n" + "Fiction\r\n" + "Comedy");
		System.out.println("What type of book are you looking for? ");
		String genre = in.nextLine();
		
		try (BookDao dao = new BookMySqlDao()) {
			
			List<Book> books = dao.findByGenre(genre);
			System.out.println("Here is the list of books in the " + genre + " genre:");
			System.out.println(books);
		}
		in.close();

	}

}
