package com.skillstorm.training.day2;

public class ParameterExamples {
	
	public static void main(String[] args) {
		// Example 1: Need to match parameter number and type
//		greet(); // If I don't match the number and type of parameters, this won't compile
//		greet(null); // for objets I can use null to match type and number of object parameters when I don't have an object
		
		// Exampe 2: I can pass an empty string
		greet("");
		
		// Example 3: 
		greet("Daun");
		greet("Tenzin");
		greet("Blake");
		greet("Senia");
		greet("Josh");
		
		greet("Erica", "Sean");
	}
	
	public static void greet(String name, String name2) {
//		greet(name);
//		greet(name2);
		greet(name, name2); // I accidentally called the same method which calls the same method
		                    // this gives me StackOverflowError
	}
	
	public static void greet(String name) {
		System.out.printf("Good morning %s%n", name); //%s is replaced by the string name, and %n is replace by a newline character
		System.out.println("How are you?");
	}

}
