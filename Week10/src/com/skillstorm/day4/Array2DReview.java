package com.skillstorm.day4;

public class Array2DReview {

	public static void main(String[] args) {
		// Creating 2d arrays
		int[][] nums = new int[3][4]; // # of rows = 3, # of cols = 4
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
//				System.out.print(nums[i][j] + " ");
			}
//			System.out.println();
		}

		// Creating a 2d array
		int[][] nums2 = new int[3][]; // # of rows = 3, # of cols = ?
//		for (int i = 0; i < nums2.length; i++) {
//			System.out.print(nums2[i] + " ");
//		}
//		System.out.println();
		
		for (int i = 0; i < nums2.length; i++) {
			nums2[i] = new int[i]; // row 0 will hold: {} array
		}                          // row 1 will hold: {0} array
		                           // row 2 will hold: {0, 0} array
		
		for (int i = 0; i < nums2.length; i++) {
			System.out.print("{ ");
			for (int j = 0; j < nums2[i].length; j++) {
				System.out.print(nums2[i][j] + " ");
			}
			System.out.println("}");
		}
		/*
		 * It will print 3 rows with what in each row?
		 * 
		 * 
		 */

		
		// invalid is 
//		 int[][] nums3 = new int[][3];
//		 int[][] nums3 = new int[2][3]{ {1, 2, 3}, {1, 2, 3}};
//		 int[2][3] nums3 = new int[][]{ {1, 2, 3}, {1, 2, 3}};
	}
}
