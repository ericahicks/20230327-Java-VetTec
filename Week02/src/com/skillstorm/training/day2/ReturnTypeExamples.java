package com.skillstorm.training.day2;

public class ReturnTypeExamples {
	
	public static void main(String[] args) {
		add(1, 2); // I have not done anything with the return value
		
		// Option 1: store the return value to use later
		int sum = add(3, 2);
		
		// Option 2: hand the return value directly to another method
		System.out.println(add(100, 200));
		
		System.out.println(subtract(10, 20));

		// TODO write the methods multiply and divide and call them here. Put your a screenshot in the chat.
		System.out.println(multiply(2, 3));
		
		System.out.println();
		
		System.out.println(divide(1, 2)); // java tries to find an exact match for the parameters
		System.out.println(divide(1f, 2)); // java will wide cast to match the float, float parameters for us
		System.out.println(divide(1, 2f));
		System.out.println(divide(1f, 2f));
		
//		System.out.println(divide(1, 0)); // causes error cannot have an int of infinity
		System.out.println(divide(1f, 0f)); // prints out infinity
		
		// Can I use printf? Yes, but match the number type returned
//		System.out.printf("%d", divide(5, 2)); // returns 2 when int division used
////		System.out.printf("%d", divide(5.0f, 2.0f)); // returns 2 when int division used
//		
//		System.out.printf("%.1f", divide(5.0f, 2)); // returns 2 when int division used
//		System.out.println(divide(5, 2f)); // returns 2 when int division used
		
		//-----------------------------------------------------------------------
		// boolean examples
		//-----------------------------------------------------------------------
		// Test both true and false cases
		boolean positiveTest = isEven(2);
		boolean negativeTest = isEven(7);
		System.out.println("positive test: " + positiveTest);
		System.out.println("negative test: " + negativeTest);
	}
	
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int subtract(int x, int y) {
		return x - y;
	}
	
	public static int multiply(int x, int y) {
		return x * y;
	}
	
	public static float divide(float x, float y) {
		return x / y;
	}
	
	public static int divide(int x, int y) {
		return x / y;
	}
	// Example 1: boolean utility method--------------------------------
	// TODO write a method that returns a true if the number is even
	public static boolean isEven(int num) {
		return num % 2 == 0; 
	}
	
	// PET PEEVE! Unnecessary
	public static boolean isEvenV2(int num) {
		if ((num % 2 == 0) == true) { // PET PEEVE! Unnessary
			return true;
		} else {
			return false;
		}
	}
	// Example 2: boolean utility method----------------------------------
	// TODO refactor the code in the below method to not use if-else
	// put a screenshot in the chat
	public static boolean goodTopping(String topping) {
		if (topping.equals("mushrooms")) {
			return true;
		} else if (topping.equals("chicken")) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	// TODO write a method that returns a true if the age is greater than or equal to 21
	// TODO write a method that returns a true if the age is a teenager

}
