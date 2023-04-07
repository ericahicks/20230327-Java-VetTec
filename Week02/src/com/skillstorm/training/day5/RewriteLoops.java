package com.skillstorm.training.day5;

public class RewriteLoops {
	
	public static void main(String[] args) {
		// TODO put a screenshot in the chat of the below output
		// rewrite dash method
		int count = 0;
		for (;count < 68; count++) {
			System.out.print("-");
		}
		System.out.println(String.format("%n%35s", "Example 1"));
		for (count = 0; count < 68; count++) {
			System.out.print("-");
		}
		System.out.println();
		// Print out the counter each time
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		for (count = 0; count < 68; count++) {
			System.out.print("-");
		}
		System.out.println(String.format("%n%35s", "Example 2"));
		for (count = 0; count < 68; count++) {
			System.out.print("-");
		}
		System.out.println();
		String[] hansonSongs = {
				"MMMbop", 
				"Where's the love?", 
				"Speechless"};
		for (int i = 0; i < hansonSongs.length; i++) {
			System.out.println(hansonSongs[i]);
		}
		
		for (count = 0; count < 68; count++) {
			System.out.print("-");
		}
		System.out.println(String.format("%n%35s", "Example 3"));
		for (count = 0; count < 68; count++) {
			System.out.print("-");
		}
		System.out.println();
		
		// Add up the numbers in an array
		int sum = 0;
		int[] nums = new int[] { 10, 20, 30, 40, 5 };
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println("sum is " + sum);
		
		// Find max value
		// Assume the array is all positive values
		// not null and not empty
		int max = 0;
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		System.out.println("max is " + max);
		
		// Concatenate the strings in an array and print out the result
		String[] hanson = {"H","a","n","s","o","n"};
		String strSum = "";
		for (int i = 0; i < hanson.length; i++) {
			strSum += hanson[i];
		}
		System.out.println("sum is " + strSum);
	}

}
