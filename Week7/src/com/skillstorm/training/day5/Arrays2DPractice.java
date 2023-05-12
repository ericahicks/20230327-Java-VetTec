package com.skillstorm.training.day5;
import java.util.Arrays;
public class Arrays2DPractice {
	
	public static void main(String[] args) {
		//////////////////////////////
		// Create an empty 2D array
		// TODO what does the below code print? Put a screenshot in the chat.
		int[][] nums = {};
		System.out.println(nums); // prints 
		System.out.println(Arrays.asList(nums)); // prints 
		System.out.println(nums.length); // prints 0

		// What does the below code do?
//		nums[0][0] = 1; // java.lang.ArrayIndexOutOfBoundsException: 0
//		nums[0][1] = 2;
		
		// Literals rectangular
		String[][] ticTacToe = { { "x" , "o", "o"},
				                 { "_" , "x", "_"},
				                 { "_" , "x", "_"}
		};
		// Without using Arrays.asList, how can I print out the tic-tac-toe board?
		for (int i = 0; i < ticTacToe.length; i++) {
			for (int j= 0; j < ticTacToe[i].length; j++) {
				System.out.print(ticTacToe[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		// Literals jagged array
		String[][] friendGroups = { {"Sara", "Annabelle"}, 
				                    {"Jo", "Bob", "Gary"}, 
				                    {"Sean", "Chris", "Chris", "Michael"}, 
				                    {},
				                    {null},
				                    {"Susan"}, // extra comma ignored, length is still six
//				                    "Susan "// WILL THIS WORK???
//				                    null // causes null pointer exception in below loop
								  };
		for (int i = 0; i < friendGroups.length; i++) {
			for (int j= 0; j < friendGroups[i].length; j++) {
				System.out.print(friendGroups[i][j] + " ");
			}
			System.out.println();
		}
 		// Print out the number of rows
		System.out.println("number of rows is " + friendGroups.length);
		
		
		// Print out the number of columns in each row
		for (int i = 0; i < friendGroups.length; i++) {
			// how many columns?
			System.out.println("num friends in group " + i + " is " + friendGroups[i].length);
		}
		
		
		
		
		
		
		/////////////////////////////
		// New operator rectangular
		Integer[][] pixels = new Integer[10][20];
		
		// Put some values in the arrays
		pixels[0][0] = 0xFF0000; // RGB value this is red!
		// Print out the number of rows
		System.out.println("The number of rows is " + pixels.length);
		// Print out the number of columns in each row
		System.out.println("The number of columns is " + pixels[0].length);
		
		// Print it out using a for loop
		for (int i = 0; i < pixels.length; i++) {
			for (int j = 0; j < pixels[i].length; j++) {
				System.out.print((pixels[i][j] == null ? null : Integer.toHexString(pixels[i][j])) + " ");
			}
			System.out.println();
		}
		
		/////////////////////////////
		// New operator create a jagged 2D array
		// int[][] numbers = new int[][]; // invalid
		 int[][] numbers = new int[3][]; 
		// int[][] numbers = new int[][3]; // invalid
		 

		// Add the inner arrays
		numbers[0] = new int[3]; // 0, 0, 0
		numbers[1] = new int[2]; // 0, 0
//		numbers[2] = new int[1]; // nullpointer if not initialized


		// Print out the size
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == null)
			     System.out.println(null + " ");
			else 
		         System.out.println(numbers[i].length);
		}
		
		// Print out the contents
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == null)
				System.out.println(null + " ");
			else 
				for (int j = 0; j < numbers[i].length; j++) {
					
					System.out.print(numbers[i][j] + " ");
				}
			System.out.println();
		}
		
		
		
		
	}

}
