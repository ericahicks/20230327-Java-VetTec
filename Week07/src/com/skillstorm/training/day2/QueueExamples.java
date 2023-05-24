package com.skillstorm.training.day2;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueExamples {
	
	public static void main(String[] args) {
		// Example 1: TODO drop a screenshot in the chat of the following code running
//		Queue<Integer> line = new Queue<>(); // Queue is an interface not a class 
		Queue<Integer> line = new LinkedList<>();
		System.out.println(line.poll());
		try {
		    System.out.println(line.remove());
		} catch (NoSuchElementException e) {
			
		}
		
		// Example 2: Add to the queue
		Queue<String> customers = new LinkedList<>();
		customers.add("Sean"); 
		customers.add("Miles"); 
		customers.add("John"); 
		// offer is the same as add effectively
		customers.offer("Jon");
		System.out.println("Customers waiting: " + customers);
		
		// Example 3: Look at the center of the line or the end of the line
		// -- Don't use type casting if you find yourself using typecasting, 
		//     you probably didn't want a queue in the first place
//		System.out.println(customers.get(2)); // Queue is NOT an indexed data type
		System.out.println( ((LinkedList<String>) customers).get(2)); // Don't cheat by using type casting
		
		// Example 4: Serve all the customers
		while (customers.peek() != null) {
			System.out.println("Serving: " + customers.poll());
		}
		System.out.println("Customers waiting: " + customers);
		
		
		
	}

}
