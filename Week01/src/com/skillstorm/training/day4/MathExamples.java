package com.skillstorm.training.day4;
import java.lang.Math; // happens automatically (still happens even if I do static imports below)

import static java.lang.Math.abs; // static imports allow me to use abs without specifying the class
import static java.lang.Math.pow; // static imports allow me to use pow without specifying the class

import static java.lang.Math.*; // * means give me everything (creates aliases for everything so Math.PI becomes PI)

import java.util.Scanner; // import Scanner from java.util
import java.util.*; // inefficient imports everything including what I don't need

public class MathExamples {
	
	// DANGER OF STATIC IMPORTS: 
	// if you have a method of the same name, it becomes ambiguous to people reading your code
	
//	public static double pow(double x, double y) {
//		return 0;
//	}

	public static void main(String[] args) {
		// CHALLENGE: Print out the following values (and put a screenshot in the chat)
		// -2^3
		// -(2^3)
		// |-10|
		// |-2|^3
		pow(1, 2);
		System.out.println("----------Math Examples----------");
		// Option 1: Nesting our methods
		System.out.println( Math.pow(-2, 3) );
		System.out.println( -Math.pow(2, 3) );
//		System.out.println( -Math.pow(2, 2) );
//		System.out.println( Math.pow(-2, 2) );
		System.out.println( Math.abs(-10) );
		System.out.println( Math.pow( Math.abs(2), 3) );
		
		// Option 2: double variables
		double x = Math.pow(-2, 3);
		 System.out.println(x);
		 x = -Math.pow(2, 3);
		 System.out.println(x);
		 x = Math.abs(-10) ;
		 System.out.println(x);
		 x = Math.pow( Math.abs(2), 3); 
		 System.out.println(x);
		
		// Option 3: int variables
//		int n = (int) Math.pow(-2, 3);
//		 System.out.println(n);
//		 n = (int)-Math.pow(2, 3);
//		 System.out.println(n);
//		 n = (int)Math.pow(-2, 3);
//		 System.out.println(n);
//		 n = (int)Math.pow(-2, 3);
//		 System.out.println(n);
		 
		 // Math.random
		 System.out.println("-----------Math.random Examples----------");
//		 System.out.println(Math.random()); // gives me 0.0 to 0.999999
		 
//		 System.out.println(Math.random() * 100); // gives me 0.0 to 99.999999
		 
//		 System.out.println( Math.ceil(Math.random()) ); // I will always get 1
//		 System.out.println( Math.floor(Math.random()) ); // I will always get 0
//		 System.out.println( (int) Math.random() ); // I will always get 0
//		 System.out.println( ((int) Math.random()) * 2); // I will always get 0
//		 System.out.println( Math.random() * 2); // range of 0.0 to 1.99999
		 System.out.println( (int) (Math.random() * 2)); // I will get either 0 or 1
//		 System.out.println( (int) (Math.random() * 2) + 1); // I will get either 1 or 2
		 
		 // How would I get a random number between 3 inclusive and 5 inclusive (must be whole numbers)
		 int range = 3;
		 int offset = 3;
//		 System.out.println((int) (Math.random() * range) + offset );
		 
		 //-----------------------------------------------------------------------------------------------------------
		 // CHALLENGE: 
		 // How can I use this to get a random whole number between 1 inclusive and 10 inclusive
		 // Put your code in the chat
		 
		 // Option 1: (int) 
		 
		 
		 // Option 2: Math.?
		 
		 
		 // Option 3: 
		 
		 
		 
		 
	}//end main
	
} //end class


