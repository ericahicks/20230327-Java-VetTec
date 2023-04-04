package com.skillstorm.training.day2;

public class UserDefinedMethods {
	public static void main(String[] args) {
		
		// TODO write a public static void method named greet that takes no parameters that prints out a greeting
		// Put a screenshot in the chat
		UserDefinedMethods.greet();
		greet();
		
		
	}
	
	// YOUR CODE HERE
	public static void greet() {
		System.out.println("Hi! What's up?");
		System.out.println("How are you doing?");
//		return; // returns nothing aka void -- optional this happens automatically
	}
	
	private static void celebrate() { // WARNS me this can't be used anywhere else and isn't used here so it is useless
		System.out.println("YAY!");
	}
	
	

}
