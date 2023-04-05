package com.skillstorm.training.day3;

import java.util.Scanner;

public class StringExamples {
	
	public static void main(String[] args) {
//		String response = "Yes";
		Scanner in = new Scanner(System.in);
		String response = in.nextLine().trim().toLowerCase(); // pretend this is user input from a scanner
		// Method chaining
		//-------------------------Example 1---------------------
		if (response.toLowerCase().equals("Yes"))
			System.out.println("Awesome!");
		if (response.equals("Yes") || response.equals("yes") || response.equals("y")) // better
			System.out.println("Yep, cool");
		if (response.toLowerCase().contains("y")) // matches " yes " or "Yes" or "YES" or "yes" or "ye"
			System.out.println("Even more awesome!");
		
		//-------------------------Example 2---------------------
		String word = "banana";
		System.out.println(word.replace("n", "l").replace("b", "l")); // lalala
		System.out.println(word.replace("n", "b").replace("b", "l")); // lalala
		System.out.println(word.replace("b", "n").replace("n", "l")); // lalala
		System.out.println(word.replace("b", "n").replace("n", "nan")); // nananananana
		
		
		// Common pitfall
		//-------------------------Example 3--------------------
		// String class variables
		
		// String parameter of null
		printFirst(null); // NullPointerException
//		printFirst(""); // StringIndexOutOfBoundsException
		printLast(null);
		printLast("");
		printLast("a");
		printLast("abc");
		in.close();
		
	} // main ends here
	
	//------------------Example 4------------------------
	// String parameters
	public static void printFirst(String str) {
		if (str == null || str.isEmpty()) {
			System.out.println("No character found.");
		} else {
			System.out.println(str.charAt(0));
		}
	}
	
	public static void printLast(String str) {
		if (str == null) {
			System.out.println("String cannot be null.");
		} else if (str.isEmpty()) {
			System.out.println("No character found.");
		} else {
			System.out.println(str.charAt(str.length() - 1));
		}
	}
}
