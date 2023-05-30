package com.skillstorm.day2;

public class RecursionOrderOfExecution {
	// Recursive problems are bind-benders
	// Challenge: Go look up "Towers of Hanoi"

	public static void main(String[] args) {
//		recursive(3);
//		doStuff();
//		boolean found = findNemo(new String[] {"Marvin", "Nemo", "Dory", "Dalia"}, 0);
//		System.out.println("Found Nemo: " + found);
		int[] numbers = { 1, 2, 3, -1, -2, -3, 1, 2, 3 };
		int count = countNegatives(numbers, 0);
		System.out.println("count is " + count);

		// Challenge:
		Student[] students = { 
				new Student(10, true), new Student(8, false),
				new Student(9, true), new Student(7, false),
				new Student(8, false), new Student(6, false),
				new Student(10, true) };
		System.out.println("\nHigh Score is " + highScore(students, 0));
	}

	public static void recursive(int x) {
		System.out.println("In method with x=" + x);
		// This is called the base case
		if (x > 0) {
			recursive(x - 1); // pauses execution until this method call returns
			System.out.println("End of method with x=" + x);
		}
	}

	public static void doStuff() {
		System.out.println("doing stuff");
		print(); // pauses execution of this method and waits for this method
					// call to return
		System.out.println("done doing stuff");
	}

	public static void print() {
		System.out.println("hello");
		System.out.println("hello");
		System.out.println("hello");
	}

	// recursive example where it uses the value returned from the recursive
	// call
	// Example: check if the list contains a "nemo"
	public static boolean findNemo(String[] names, int i) {
		if (i > names.length - 1) // base case - stop when reach the end of the
									// list
			return false;
		if (names[i].equals("Nemo")) {
			return true;
		} else {
			return findNemo(names, i + 1);
		}
	}

	////////////////////////////////////////////////////////////////
	// Try to write a recursive method that returns true if the list
	// contains a negative number
	public static boolean simplyContainsNegative(int[] nums) {
		return containsNegative(nums, 0);
	}

	public static boolean containsNegative(int[] nums, int index) {
		// base case 1
		if (index > nums.length - 1) {
			return false;
			// base case 2
		}
		if (nums[index] < 0) {
			return true;
		} else {
			return containsNegative(nums, index + 1);
		}
	}

	// How can we change this to count up the number of negatives?
	public static int countNegatives(int[] nums, int index) {
		int count = 0;
		// base case
		if (index > nums.length - 1) {
			System.out.println(count);
			return count;
		}
		if (nums[index] < 0) {
			count++;
		}
		System.out.print(count + " + ");
		return count + countNegatives(nums, index + 1);
	}

	// Challenge: Find the highest score of the Students (not counting the ones
	// who cheated)
	public static int highScore(Student[] students, int i) {
		// Hint: If the student cheated, there score should be a 0
		return 0;
	}
}

class Student {
	int score;
	boolean cheated;

	public Student(int score, boolean cheated) {
		this.score = score;
		this.cheated = cheated;
	}
}
