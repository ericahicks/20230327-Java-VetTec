package com.skillstorm.training.day5;

import java.util.Random;
import java.util.Arrays;

public class BinarySearchExample {
	
	public static void main(String[] args) {
		
	}
	
	/** 
	 * @param nums  The array of integers to search through
	 * @param value The value to search for
	 * @return      The index of the position of the value in the array,
	 *              or -1 if not found.
	 * @throws	NullPointerException if the array is null
	 */
	public static int binarySearch(int[] nums, int value) {
		int start = 0;
		int end = nums.length - 1;
		// iterative loop
		while (start <= end) {
			int middleIndex = (start + end) / 2;
			int middleValue = nums[middleIndex];
			
			if (value == middleValue)
				return middleIndex;
			if (value < middleValue) {
				
			} else {
				
			}
		}
		return -1;
	}
	
	public static int[] create(int size) {
		Random generator = new Random();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = generator.nextInt(100); // any int from -2billion to 2billion
		}
		return nums;
	}
	
	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
