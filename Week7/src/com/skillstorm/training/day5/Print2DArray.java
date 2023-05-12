package com.skillstorm.training.day5;

public class Print2DArray {
	
	public static void main(String[] args) {
		int[][] nums  = { {1, 2, 3 }, {4, 5, 6 }, {7, 8, 9} };
		// Print out a 2D Rectangular Array using just 1 loop and the modulus operator
		int numCols = 3;
		for (int i = 0; i < nums.length * nums[0].length; i++) {
			int row = i / numCols; // row = i / numCols
		    int col = i % numCols; // col = i % numCols 
			System.out.print(nums[row][col] + " ");
			 if (col == numCols - 1) { // print newlines at the end of the rows (aka when cols = numCols - 1
				 System.out.println();
			 }
		}
	}

}
