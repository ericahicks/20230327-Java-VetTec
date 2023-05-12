package com.skillstorm.training.day4.queue;

public class QueueTests {
	
	public static void main(String[] args) {
		Queue<Integer> nums = new Queue<>();
		System.out.println(nums);
		nums.add(1);
		System.out.println(nums);
		nums.add(2);
		System.out.println(nums);
		nums.offer(3);
		nums.remove();
		System.out.println(nums);
	}

}
