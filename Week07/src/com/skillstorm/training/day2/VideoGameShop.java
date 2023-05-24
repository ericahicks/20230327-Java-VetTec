package com.skillstorm.training.day2;

import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class VideoGameShop {
	
	Queue<String> customers;
	
	Deque<String> videoGames;
	
	public VideoGameShop() {
		customers = new LinkedList<>();
		videoGames = new LinkedList<>();
	}
	

	
	// Add a customer to the line
	public void addCustomer(String name) {
		customers.add(name);
//		customers.offer(name); // either way works for Queue methods
	}
	
	// Help a customer
	public void helpNext() {
		// Get the next customer in line
		String customer = customers.poll();
		// Give the customer a video game
		if (customer == null) {
			System.out.println("No more customers need help.");
		} else {
			System.out.println("Hello, " + customer);
			try {
				String game = getNextVideoGame();
				System.out.println("Here is your game: " + game);
				
			} catch (NoSuchElementException e) {
				System.out.println("Sorry, we are out of stock.");
			} finally {
			    System.out.println("Have a nice day");
			}
		}
		
	}
	
	private String getNextVideoGame() {
		return videoGames.pop();
	}
	
	public void restockVideoGames(Collection<String> games) {
		// add all
		videoGames.addAll(games);
	}
	
	public void restockVideoGames(String game) {
		// add the video game to the stack of games
		videoGames.push(game);
	}
	
	@Override
	public String toString() {
		String str = "Customers: " + customers + "\n";
		str += "Video games available: \n";
		Iterator<String> itr = videoGames.iterator();
		// loop through the iterator
		while (itr.hasNext()) {
			str += "   " + itr.next() + "\n";
		}
		return str;
	}
}
