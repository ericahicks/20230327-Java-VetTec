package com.skillstorm.training.day2;

import java.util.Scanner;

public class ScannerPractice {
	
	public static void main(String[] args) {
		
//		
		// Math.pow
//		int x = 2;
//		int n = 8;
////		float result = x ^ n; // Java does not have an exponent operator
//		double result = Math.pow(x, n); // gives us x^n
//		System.out.println(result);
//		
//		// Order of operations: A = P(1 + r/n)nt
//		// result = principle * (1 + rate / numTermsPerYear)^(n*t)
//		float principle = 1000;
//		float rate = 5 / 100.0f; // be careful of integer division
//		int numTermsPerYear = 12;
//		float timeInDecimalYears = 2;
//		System.out.println(rate / numTermsPerYear);
//		System.out.println(Math.pow(  (1 + rate / numTermsPerYear),   numTermsPerYear * timeInDecimalYears   ));
//		result = (double) principle * Math.pow((1 + rate / numTermsPerYear), numTermsPerYear * timeInDecimalYears);
//		System.out.println(result);
		
		// Scanners are a resource that need to be closed
		
		Scanner in = new Scanner(System.in);
		//in.nextLine();
		// Example 1: Double
//		System.out.println("Enter a price: ");
//		double price = in.nextDouble();
//		System.out.println("price=" + price);
//		
//		// Example 2: int
//		System.out.println("Enter a whole number: ");
//		int number = in.nextInt();
//		System.out.println("number=" + number);
		
		
		
		
		
		
		
		
		
		
		
		
		//-------------------------------------------------
		// Challenge: Read a int and then a line
		/*
		 * Ask for a quantity and then a grocery item
		 */
//		System.out.println("Enter a quantity: ");
//		int qty = in.nextInt();
//		in.nextLine(); // clear the buffer
//		
//		
//		System.out.println("Enter a grocery item: ");
//		String item = in.nextLine(); // wait for the next user input
//		
//		
//		
//		System.out.println("Here is your " + qty + " " + item + "(s)."); // TODO fix the print to display what they entered here
		//--------------------------------------------------
		
		
		//-------------------------------------------------
		// Challenge Solution 2: Use .next() instead
//		System.out.println("Enter a quantity: ");
//		int quantity = in.nextInt();
//		// TODO your code here
//		
//		System.out.println("Enter a grocery item: ");
//		String groceryItem = in.next(); // wait for the next user input
//		
//		// TODO your code here
//		
//		System.out.println("Here is your " + quantity + " " + groceryItem + "(s).");
		//--------------------------------------------------

		
		
		//-------------------------------------------------
		// Example: Using .next() with a different delimiter to read in items
		
		// step 1:
		in.useDelimiter(",");
		
		// step 2: prompt user
		System.out.print("Enter a list of 3 items (separated by commas): ");
		String token1 = in.next();
		String token2 = in.next();
		String token3 = in.next();
		
		System.out.println("Item 1: " + token1);
		System.out.println("Item 2: " + token2);
		System.out.println("Item 3: " + token3);
		
		
		in.close();
	}

}
