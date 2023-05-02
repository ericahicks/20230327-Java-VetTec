package com.skillstorm.day2.quiz;

import java.util.Random;

public class CardGame {

	public static void main(String[] args) {
		int ace = new Random().nextInt();
		int king = new Random().nextInt(); // not a good use of Random() instead
											// use the same instance and call
											// .nextInt
		if (Math.random() > king) { // Math.random() returns 0.0 to 1.0 exc while nextInt() returns -2billion to 2billion
			System.out.println("ace"); // This should run about half the time (when king is negative or <1)
		} else if (Math.floor(Math.random()) > Math.abs(ace)) { // Math.floor(Math.random()) is 0 always
			                                                    // Math.floor(Math.random()) is btwn 0 and 2 billion
			System.out.println("king"); // this line never runs because 0 to 2 billion is never less than 0
		} else {
			System.out.println("queen");
		}
	}
}
