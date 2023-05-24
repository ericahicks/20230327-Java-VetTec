package com.skillstorm.training.day2.designpatterns;

public class ImmutableExample {
	
	public static void main(String[] args) {
		Card c = new Card();
		System.out.println(c.getSuit() + " ");
	}

}

// Create an immutable class of type 
// to make it immutable:
//  1. private final instance properties
//  2.  constructor sets all values
//  3.  no setters
//  4. don't pass around references to mutable properties
//  5. prevent method overloading
final class Card {
	private final String suit; // should use enum 
	private final int value; // note could use enum Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King
	           //                                    1   2  3  4  5  6  7  8  9  10   11    12     13      14     15
	
	// probably shouldn't have a default constructur, 
	// but just to show we can as long as it sets everything
	public Card() {
		this.suit = "Hearts";
		this.value = 15;
	}
	
	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	// instead of returning the value number, return the equivalent name of the cards
	
	// getters but no setters
	
	
}