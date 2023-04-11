package com.skillstorm.training.day2.quiz;

public class QuizReview {

	public static void main(String[] args) {
		///////////////////////////////////////////////
		// Which of the following is the correct way of 
		// instantiating an array that can hold 5 ints?
		int[] numsA = new int[5];
		System.out.println(numsA.length);
		int[] numsB = new int[4]; // length is 4
		System.out.println(numsB.length);
//		int[4] numsC = new int[]; // doesn't compile
//		int[5] numsD = new int[]; // doesn't compile
		
		///////////////////////////////////////////////
		// Which of the following is the correct way 
		// to get the first character in the String 
		// variable, myWord?
		String myWord = "hello";
		System.out.println(myWord.charAt(0)); // correct
		System.out.println(myWord.charAt(1)); // prints e
//		System.out.println(myWord[0]); // incorrect can't use array notation with Strings
//		System.out.println(myWord[1]); // incorrect
		
		///////////////////////////////////////////////
		// Which of the following is used to access the 
		// length of an array named myArray?
		int[] myArray = new int[5];
		System.out.println(myArray.length); // correct
//		System.out.println(myArray.length()); // incorrect this is for String only
//		System.out.println(myArray.size); // incorrect
//		System.out.println(myArray.size()); // incorrect

		////////////////////////////////////////////////
		// The following code will not produce an error.
		// TRUE
		int[] nums = {1, 2, 3};
//		System.out.println(nums[3]); // ArrayIndexOutOfBoundsException
		
		/////////////////////////////////////////////////
		// Which code snippet goes in each spot of 
		// the following for loop?
		String[] bands = {"The Beatles", "Pink Floyd", "Queen", "The Kinks"};
		for (int i = 0; i < bands.length; i++) {
		   System.out.println(bands[i]);
		}
		
		////////////////////////////////////////////////
		// A variable defined inside of a function is a(n) __________.
		// Answer: local variable
		
		/////////////////////////////////////////////////
		// A(n) ________ is used to store multiple values 
		// of a given type in a single variable.
		// Answer: Array
		
		/////////////////////////////////////////////////
		// Does the following code produce an infinite loop?
		// TRUE
		int count = 0;
//		while(count < 5) {
//		   System.out.println(count); // count never changes
//		}
		
		////////////////////////////////////////////////
		// Which of the following can be stored in an int array?
		int[] testArray = new int[9];
		
		
	}

}
