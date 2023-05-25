package com.skillstorm.training.day4.recursion;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;

public class DivideAndConquer {
	static int size;
	static int max = Integer.MIN_VALUE;
	static int[] nums;
	
	public static void main(String[] args) throws InterruptedException {
		////////////////////////////////////////////////////////////
		// Finding the max in a large array try #1
		size = 200_000_000;
		nums = create(size);
		
		Instant start = Instant.now();
		max = findMax(nums);
		Instant end = Instant.now();
		Duration time = Duration.between(start, end);
		System.out.println("found max of " + max + " in " + time);
		
		max = Integer.MIN_VALUE; // reset the max and try again

		////////////////////////////////////////////////////////////
		// Finding the max in a large array try #2
		Thread t1 = new Thread(()-> max = Math.max(max, findMax(nums, 0, size / 2)));
		Thread t2 = new Thread(()-> max = Math.max(max, findMax(nums, size / 2, size)));

		start = Instant.now();
		// start the threads
		t1.start();
		t2.start();
		
		// wait for threads to finish before printing result
		t1.join();
		t2.join();
		
		end = Instant.now();
		time = Duration.between(start, end);
		System.out.println("found max of " + max + " in " + time);
		
		max = Integer.MIN_VALUE; // reset the max and try again

		////////////////////////////////////////////////////////////
		// Finding the max in a large array try #3
		Thread th1 = new Thread(()-> max = Math.max(max, findMax(nums, 0, size / 3)));
		Thread th2 = new Thread(()-> max = Math.max(max, findMax(nums, size / 3, 2 * size / 3)));
		Thread th3 = new Thread(()-> max = Math.max(max, findMax(nums, 2 * size / 3, size)));

		start = Instant.now();
		// start the threads
		th1.start();
		th2.start();
		th3.start();
		
		// wait for threads to finish before printing result
		th1.join();
		th2.join();
		th3.join();
		
		end = Instant.now();
		time = Duration.between(start, end);
		System.out.println("found max of " + max + " in " + time);
	}
	
	public static int findMax(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		return max;
	}
	
	public static int findMax(int[] nums, int from, int to) {
		int max = Integer.MIN_VALUE;
		for (int i = from; i < to; i++) {
			max = Math.max(max, nums[i]);
		}
		return max;
	}
	
	public static int[] create(int size) {
		Random r = new Random();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = r.nextInt(); // any int from -2billion to 2billion
		}
		return nums;
	}
	
}


