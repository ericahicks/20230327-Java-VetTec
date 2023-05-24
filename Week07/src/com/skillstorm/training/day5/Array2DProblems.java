package com.skillstorm.training.day5;

public class Array2DProblems {

	public static void main(String[] args) {
		System.out.println(numElements(new int[3][2]));
		System.out.println(numElements(new int[30][3])); // num elements of n by
															// m array is always
															// n * m

		int[][] nums = new int[2][];
		nums[0] = new int[3];
		nums[1] = new int[4];
		nums[0][0] = 1;
		nums[0][1] = 3;
		nums[0][2] = 1;
		nums[1][0] = 1;
		nums[1][1] = 2;
		nums[1][2] = 1;
		nums[1][3] = 1;
		System.out.println(countElements(nums));
		System.out.println(countElements(new int[5][6]));
		System.out.println(sum(nums));
		
		System.out.println("Expecting " + ((double) 10 / 7));
		System.out.println("Getting " + average(nums));
		String[][] friendGroups = { {"Sara", "Annabelle"}, 
                {"Jo", "Bob", "Gary"}, 
                {"Sean", "Chris", "Chris", "Michael"}, 
                {},
                {null},
                {"Susan"}, 
			  };
		String[] rowStrings = getSentences(friendGroups);
		for (String s : rowStrings) {
			System.out.println(s);
		}
		
		// All negatives test of max
		// If max starts at 0 it will give 0
		int[][] negatives = {{-1, -2}, {-3, -4}};
		System.out.println("Max is " + maxValue(negatives));
		int[][] positives = {{1,2},{3,4}};
		System.out.println("Min is " + minValue(positives));
		
		// Concatenate all the words in a String[][] array
		// No spaces
		System.out.println(concatenate(friendGroups));
		System.out.println(getParagraph(friendGroups));
		
		// Testing the grade averages method
		double[][] assignmentGrades = 
		{{48, 56, 69.33, 32, 27.17, 26.67, 43.5, 33.33, },
		{52.67, 58.67, 73.33, 56, 48.83, 54, 81, 56, },
		{48.67, 46.67, 73.33, 42, 39, 32, 55.5, 35.5, },
		{52, 50.67, 64, 52, 46.33, 54.67, 73.5, 47.33, },
		{46, 54, 57.33, 24, 49.67, 27.33, 40.5, 35.5, },
		{52, 48, 77.33, 42, 45.33, 53.33, 57, 41, },
		{50.67, 64, 78.67, 44, 53.33, 47.33, 72, 53.33, },
		{40, 52, 73.33, 40, 47.83, 40, 61.5, 52, },
		{52, 50, 78.67, 36, 53.33, 40.67, 58.5, 38.66, },
		{45.33, 52, 58.67, 42, 45, 50, 45, 44.66, },
		{40, 38.67, 61.33, 32, 29.83, 36, 45, 27, } };
		double[] grades = studentGrades(assignmentGrades);
		for (double grade : grades) {
			System.out.println(grade);
		}
	}

	// Assuming square or rectangular (and at least 1 row)
	public static int numElements(int[][] nums) {
		int rows = nums.length;
		int cols = nums[0].length;

		return rows * cols;
	}

	// For jagged or rectangular
	public static int countElements(int[][] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				count++;
			}
		}
		return count;
	}

	public static int sum(int[][] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				int value = nums[i][j];
				sum += value;
			}
		}
		return sum;
	}

	public static double average(int[][] nums) {
//		int sum = sum(nums);
//		int count = countElements(nums); // inefficient to loop over the whole array again, so instead do:
		int sum = 0;
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				count++;
				int value = nums[i][j];
				sum += value;
			}
		}
		return (double) sum / count;
	}

	// for each row, concatenate the strings together, and put them in a new array
	public static String[] getSentences(String[][] strs) { 
		String[] result = new String[strs.length]; // I need 1 element for each row of the original array
		for (int i = 0; i < strs.length; i++) {
			String row = ""; // reset the string we're using to be empty
			for (int j = 0; j < strs[i].length; j++) {
				row += strs[i][j] + " "; // why doesn't row += null + " "; throw an exception?
			}
			result[i] = row; // store the result of the inner loop
		}
		
		return result;
	}

	// Concatenate all the strings in the 2D Array
	public static String concatenate(String[][] strs) {
		String result = ""; // I need 1 element for each row of the original array
		for (int i = 0; i < strs.length; i++) {
			String row = ""; // reset the string we're using to be empty
			for (int j = 0; j < strs[i].length; j++) {
				row += strs[i][j]; // why doesn't row += null + " "; throw an exception?
			}
			result += row; // store the result of the inner loop
		}
		
		return result;
	}
	
	// Concatenate all the strings in the 2D Array
	public static String getParagraph(String[][] strs) {
		String result = ""; // I need 1 element for each row of the original array
		for (int i = 0; i < strs.length; i++) {
			String row = ""; // reset the string we're using to be empty
			for (int j = 0; j < strs[i].length; j++) {
				row += strs[i][j] + " "; // why doesn't row += null + " "; throw an exception?
			}
			result += row + "\n"; // store the result of the inner loop
		}
		
		return result;
	}


	// Find the largest number in the 2D Array
	public static int maxValue(int[][] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				max = Math.max(max, nums[i][j]);
			}
		}
		return max;
	}

	// Find the smallest number in the 2D Array
	public static int minValue(int[][] nums) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				min = Math.min(min, nums[i][j]);
			}
		}
		return min;
	}

	// Find the average of the numbers in a row
	// Store it in a new array
	public static double[] studentGrades(double[][] studentAssignmentGrades) {
		double[] result = new double[studentAssignmentGrades.length]; // I need 1 element for each row of the original array
		for (int i = 0; i < studentAssignmentGrades.length; i++) {
			double sum = 0; // reset the sum and count to 0
			double count = 0;
			for (int j = 0; j < studentAssignmentGrades[i].length; j++) {
				sum += studentAssignmentGrades[i][j];
				count++;
			}
			result[i] = sum / count; // store the result of the inner loop
		}
		
		return result;
	}

}
