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
				row += strs[i][j] + " ";
			}
			result[i] = row; // store the result of the inner loop
		}
		
		return result;
	}

	public static String getParagraph(String[][] strs) {
		return null;
	}

	public static int maxValue(int[][] nums) {
		return 0;
	}

	public static int minValue(int[][] nums) {
		return 0;
	}

	public static double[] studentGrades(int[][] studentAssignmentGrades) {
		return null;
	}

}
