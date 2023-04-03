package com.skillstorm.trainging.day1;

import java.util.Scanner; 
// java.lang is imported for me

public class QuizExamples {

	
	public static void main(String[] args) {
		// Question 1
		// Note: int -> double is wide casting it goes 32 to 64 bits
		//       int -> float it is still wide casting 32 to 32 bits but float has a larger range
		//                                                                 becasue it is stored in terms of exponents
		
		
		// Question 2
//		System.out.println(5 / 2); // return type is int
		
		// Question 6
//		int x = 10;
//		int y = x;
//		y++;
//		System.out.println(x);
		
		// Question 8
//		int num; // declaration
//		num = 10; // initialization
//		// instantiation is when you create an object
//		Scanner in = new Scanner(System.in); // instantiation
//		in.close();
		
		// Question 9
		// MyClass is a valid class name
		// invalid names are any of the Java keywords like class, if, public, static, etc.
		
		// Question 10
		// || either or both operands true will evaluate to TRUE
		// && both operands must be true to evaluate to TRUE
		// ! NOT changes true to false and false to true
		
		// Question 11
		// String concatenation
//		System.out.println("5" + 5); // 55
//		System.out.println("5" + 5 * 5); // 525
//		System.out.println("5" + 5 - 5); // will not compile bc can't subtract a number from a string
		
		// Question 12
		// narrow casting
		// int casting chops off the decimal it doesn't round
//		double e = 2.71828;
//		System.out.println((int) e);
		
//		String.format("%s%.2f", "$", 1.11111); // %.2f is accepting a double 
//		System.out.println(String.format("%s%.2f", "$", 1.11111));
//		
//		System.out.printf("%s%.2f", "$", 1.11111);
		

//		String dessert = "apple pie";
//		System.out.println("'" + dessert.substring(0, 4) + "'"); // 'appl'
//		System.out.println("'" + dessert.substring(0, 5) + "'"); // 'apple'
//		System.out.println("'" + dessert.substring(1, 5) + "'"); // 'pple'
//		System.out.println("'" + dessert.substring(1, 6) + "'"); // 'pple '
		
//		System.out.println(200 % 500); // 200
//		System.out.println(500 % 500); // 0
//		System.out.println(600 % 500); // 100 because 600 / 500 = 1 Remainder 100
		
		boolean windy = true;
		boolean rainy = false;
		
		System.out.println("!rainy = " + (!rainy));
		System.out.println("!windy = " + (!windy));
		System.out.println("!rany && !windy = " + (!rainy && !windy));
		if (!rainy && !windy)
		   System.out.println("Go for a bike ride!");
		else
		   System.out.println("Go bowling.");
		// NOTE: We don't need the curly braces if there is only one line of code
	}
}
