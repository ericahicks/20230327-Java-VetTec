package com.skillstorm.training.day2;

public class OrderOfMethods {
	
	// YOUR CODE HERE
	public static void greet() {
		System.out.println("Hi! Good morning!");
//		return; // returns nothing aka void -- optional this happens automatically
	}


	public static void main(String[] args) {
		
		// TODO write a public static void method named greet that takes no parameters that prints out a greeting
		// Put a screenshot in the chat
		// Example 1: I can call a method from another class
		UserDefinedMethods.greet(); // I can call any public methods from classes within my package
		
		// Example 2: I can call a method from anywhere in this class without specifying class name
		greet();
		
		// Example 3: I cannot call private methods from other classes
//		UserDefinedMethods.celebrate();
//		celebrate(); // this method is not defined in this class so I need the class name specified
		
	}
	

}
