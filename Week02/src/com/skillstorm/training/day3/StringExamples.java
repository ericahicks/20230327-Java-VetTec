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
		
		in.close();
	}

}
