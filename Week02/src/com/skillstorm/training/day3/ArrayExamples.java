package com.skillstorm.training.day3;

public class ArrayExamples {

	public static void main(String[] args) {
		// ----------------Example 1:-----------------------
		// How to print out an array
		// --------------------------------------------------
		int[] numbers = { 1, 2, 3 };
		System.out.println(numbers);
		System.out.println(args);

		System.out.println(numbers[0] + numbers[1] + numbers[2]);
		System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
		System.out.printf("%d, %d, %d%n", numbers[0], numbers[1], numbers[2]);
		System.out.printf("%s, %s, %s%n", numbers[0], numbers[1], numbers[2]);

		// TODO put a screenshot in the chat of printing out a double array'scontents
		double[] decimals = { 1.2, 1.2, 3.4 };
		System.out.println(decimals[0] + " " + decimals[1] + " " + decimals[2]);
		System.out.printf("%f, %f, %f%n", decimals[0], decimals[1], decimals[2]);
		System.out.printf("%s, %s, %s%n", decimals[0], decimals[1], decimals[2]);
		System.out.println(decimals[0]);
		System.out.println(decimals[1]);
		System.out.println(decimals[2]);
//		System.out.println(decimals[3]); // ArrayIndexOutOfBoundsException
		
		// ------------------------Example 2-------------------
		// Trying to change an array
		//-----------------------------------------------------
		System.out.println();
		System.out.println();
		System.out.println("--------------------------------------");
		String[] friends = {"Natalie"};
//		friends[1] = "Sara";
		
		System.out.println(friends.length);
//		friends.length = 2; // length is declared as final so it is a constant that cannot change
		
		// Review of final
		final int x = 10;
//		x = 20; // x is final and cannot be reassigned
		// I can joing a new friend group! by making friends point to a different array
		friends = new String[2];
		friends[0] = "Natalie";
		friends[1] = "Sara";
		friends[2] = "Owen";
		// alternative notation
		friends = new String[]{"Sara", "Owen"}; 
//		friends = new String[2]{"Sara", "Owen"}; 
//		friends = new String[3]{"Sara", "Owen"}; 
	}

}
