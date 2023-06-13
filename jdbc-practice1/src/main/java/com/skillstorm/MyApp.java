package com.skillstorm;
import java.util.Scanner;

import com.skillstorm.daos.BookDao;
import com.skillstorm.daos.BookMySqlDao;
public class MyApp {

	public static void main(String[] args) {
		// This is an app that takes requests from a user
		// and displays data from a database
		Scanner in = new Scanner(System.in);
		System.out.println("Romance\r\n"
				+ "Fiction\r\n"
				+ "Comedy");
		System.out.println("What type of book are you looking for? ");
		String genre = in.nextLine();
		BookDao dao = new BookMySqlDao();
		dao.findAll();
		System.out.println("Here is the list of books in the " + genre + " genre:");
		in.close();

	}

}
