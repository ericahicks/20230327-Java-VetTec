package com.skillstorm.training.day4;

public class MoreStringPractice {
	
	public static void main(String[] args) {
		
		// String format examples
		// takes in multiple arguments
		//    the first argument is a String containing special format specifiers
		//    the rest of the arguments can be any type, but MUST MATCH the order of our format specifiers
		
		// %d for whole numbers
		// %f for floating point
		// %s for String
		// %n for newline
		// %% for a % character
		
		// flags - to put between % and the format specifier character
		//  %.2f for floating point numbers always prints 2 decimal places
		//  %+ for numbers always prints + or - before it
		
		// Example: money
		double price = 1;
		String priceStr = String.format("$%.2f", price);
		System.out.println(priceStr);
		
		// Print out the following values and put in chat-----------------
		// $100.00
		// $1.25
		// $5.01
		//----------------------------------------------------------------
		String example = String.format("$%.2f, $%.2f, $%.2f", 100f, 1.25f, 5.01f);
		System.out.println(example);
		
		// Example: + and -
		example = String.format("%+d", 10);
		System.out.println(example);
		example = String.format("%+d", -10);
		System.out.println(example);
		example = String.format("% d", 10); // pads it with one space on the left
		System.out.println(example);
		
		
		// Example: add commas for large numbers
		
		// Example: zero padding
		example = String.format("%05d", 10); // NOT the number of spaces but the width of the string (right justifies)
		System.out.println(example);
		
		
		// String padding 
		example = String.format("%5d", 10); // NOT the number of spaces but the width of the string (right justifies)
		System.out.println(example);
		
		// String trim method
		example = example.trim();
		System.out.println(example);
	}

}
