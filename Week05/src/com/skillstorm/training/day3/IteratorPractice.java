package com.skillstorm.training.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorPractice {
	
	public static void main(String[] args) {
		// TODO can you print out the iterator? Does iterator have a built-in toString method? 
		// Put screenshot in chat
		// Create a list
//		String[] apples = {"fuji", "pink lady", "gala"};
//		ArrayList<String> strings = new ArrayList<>(Arrays.asList(apples));
//		
//		// Create an iterator from the list
//		Iterator<String> itr = strings.iterator();
//		System.out.println(itr);
//		
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
////		System.out.println(itr.next()); // Exception in thread "main" java.util.NoSuchElementException
//		itr.remove();
//		itr.remove(); // Exception in thread "main" java.lang.IllegalStateException
//		
//		
//		// Loop over the list
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		// Loop over the list and remove 
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			itr.remove();
//		}
//		System.out.println(strings.size());
//		
//		System.out.println(itr);
//		System.out.println(itr.hasNext());
		
		
		// Example 2: Loop over a collection with an iterator
		ArrayList<ComputerHardware> hardware = new ArrayList<>();
		hardware.add(new ComputerHardware());
		hardware.add(new ComputerHardware("cpu", 200.00));
		hardware.add(new ComputerHardware("graphic card", 2000.00));
		hardware.add(new ComputerHardware("mother board", 500.00));
		hardware.add(new ComputerHardware("fans", 30.00));
		hardware.add(new ComputerHardware("computer case", 300.00));
		hardware.add(new ComputerHardware("wifi", 100.00));
		hardware.add(new ComputerHardware("power supply", 250.00));
		hardware.add(new ComputerHardware("ram", 70.00));
		hardware.add(new ComputerHardware("ssd", 100.00));
		
		double totalCost = 0.0;
		
		// Step 1: Get an iterator
		Iterator<ComputerHardware> itr = hardware.iterator();
		// Step 2: set up a loop
		while (itr.hasNext()) {
			totalCost = totalCost + itr.next().price; // or use the syntatical sugar += // totalCost += itr.next().price
		}
		System.out.println(String.format("$%.2f", totalCost)); // add dollar sign and 2 decimal places
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		// Example 2:
//		Iterator<Integer> numItr = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3})).iterator();
//		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 2, 3}));
		ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		System.out.println(nums);
		Iterator<Integer> numItr = nums.iterator();
		System.out.println(numItr.hasNext());
		System.out.println(numItr.next());
		System.out.println(numItr.hasNext());
		System.out.println(numItr.next());
		System.out.println(numItr.hasNext());
		System.out.println(numItr.next());
		System.out.println(numItr.hasNext()); // false
//		System.out.println(numItr.next()); // Exception in thread "main" java.util.NoSuchElementException
		
		numItr = nums.iterator();
		while (numItr.hasNext()) {
			System.out.println(numItr.next()); // make sure you call .next() on the itr not the original list
		}
		System.out.println(numItr);
		System.out.println(itr.hasNext()); // false
//		System.out.println(numItr.next()); // Exception in thread "main" java.util.NoSuchElementException
//	}
	}

}
