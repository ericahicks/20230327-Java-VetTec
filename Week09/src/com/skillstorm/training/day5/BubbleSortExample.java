package com.skillstorm.training.day5;

import java.util.Random;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;

public class BubbleSortExample {
	
	public static void main(String[] args) {
		

		// TODO time the algorithm with and without the optimized -k in the inner loop
		// when there are lots of elements to compare
		
		int[] nums = create(100_000);
		int[] copy = Arrays.copyOf(nums, nums.length);
		print(nums);
		Instant start = Instant.now();
		sort(nums);
		Instant end = Instant.now();
		print(nums);
		Duration time = Duration.between(start, end);
		System.out.println("Took " + time + " seconds");
		

		start = Instant.now();
		sortOptimized(copy); // optimized bubble sort with fewer inner loop iterations
		end = Instant.now();
		print(copy);
		time = Duration.between(start, end);
		System.out.println("Took " + time + " seconds");
		
		
	}
	
	// Challenge - write a generic method that takes in a list of any type
	//   and sorts using the bubble sort algorithm
	public static <E> List<E> sort(List<E> arr) {
		return null;
	}
	
	public static void sort(int[] arr) { // in place sort doesn't need to return array
		// Iterative version of Bubble Sort
		
		// The outer loop runs nx where n is the number of elements in the list
		for (int k = 0; k < arr.length - 1; k++) {
//			System.out.println("Outer loop: " + k);
		// Inner loop compares each element swapping if left is greater than right
			for (int i = 0; i < arr.length  - 1; i++) {
				// compare
				if (arr[i] > arr[i + 1]) {
					// swap
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
//				System.out.print("Loop " + i + ": ");
//				print(arr);
			}
//			System.out.println();
		}
	}
	
	public static int[] sortOptimized(int[] arr) {
		// Iterative version of Bubble Sort
		
		// The outer loop runs nx where n is the number of elements in the list
		for (int k = 0; k < arr.length - 1; k++) {
//			System.out.println("Outer loop: " + k);
		// Inner loop compares each element swapping if left is greater than right
			for (int i = 0; i < arr.length  - 1 - k; i++) {
				// compare
				if (arr[i] > arr[i + 1]) {
					// swap
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
//				System.out.print("Loop " + i + ": ");
//				print(arr);
			}
//			System.out.println();
		}
		return arr;
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
