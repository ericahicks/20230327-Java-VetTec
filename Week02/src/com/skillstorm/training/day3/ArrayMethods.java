package com.skillstorm.training.day3;

public class ArrayMethods {
	
	public static void main(String[] args) {
		// TODO put a screenshot in the chat of the below test of printFirst
		// Testing my printFirst method
		int[] numbers = {1, 2, 3};
		printFirst(numbers);
		
		numbers = new int[10];
		printFirst(numbers);
		
		numbers = new int[0];
		printFirst(numbers);
		
		numbers = null;
		printFirst(numbers);
		System.out.println("-------------------------------");
		// What is an example of an array that will not work when I try to run printLast as is?
		numbers = new int[]{1, 2, 100};
		printLast(numbers);
		
		numbers = new int[0];
//		numbers = new int[-1]; // Negative array size exception
		printLast(numbers);
		
		numbers = null;
		printLast(numbers);
	}
	
	//------------------------------------------------------
	// -------Example 3: Using arrays in methods------------
	//------------------------------------------------------
	public static void printFirst(int[] numbers) {
//		if (numbers.length > 0 && numbers != null) // always do the null  check first
//		if (numbers != null & numbers.length > 0) // need short circuit evaluation says stop evaluation early i
		if (numbers != null && numbers.length > 0) // short circuit evaluation says stop evaluation early i
			System.out.println(numbers[0]);
		else
			System.out.println("No element found.");
	}
	
	public static void printLast(int[] numbers) {
		if (numbers == null || numbers.length <= 0) {// preferred way to do null check
			System.out.println("No element found.");
		    return;
		}
		System.out.println(numbers[numbers.length - 1]);
	}
	

}
