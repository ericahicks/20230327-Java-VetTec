package com.skillstorm.training.day1;

// NOTE: sysout CTRL + Space is a shortcut for System.out.println()
public class EscapeSequences {
	
	/*
	 * Escape Characters 
	 * - These are special characters not treated as normal characters
	 * - They always start with a backslash \
	 * - To use \ as a character double up \\
	 * - Same with trying to use a quotation in my string, use \" 
	 */
	
	public static void main(String[] args) {
		// Strings must be in "
		System.out.println("Hello");
		// System.out.println('Hello'); // Error invalid character constant
		System.out.println('H'); // '' are for single characters
		System.out.println(202); // For a number, I do not need ""
		
		// Example 1: Backslash
		System.out.println("\""); // prints "
		System.out.println("\'"); // prints '
		System.out.println("'Hello', said Tony."); 
		System.out.println('\''); // prints '
		System.out.println("\\'"); // prints \' 
		System.out.println("\\"); // prints \
		System.out.println("\\\\"); // prints \\
		
		
		// Example 2: Whitespace characters
		System.out.println("this is a tab\t.");
		System.out.println("this is a newline\n.");
		
	}

}
