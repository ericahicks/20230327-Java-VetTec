package com.skillstorm.training.day3;

import java.util.ArrayList;
import java.util.Iterator;

public class NestedLoopsPractice {
	
	public static void main(String[] args) {
		// Example 1: 
//		String[] exercises = {"squats", "push-ups", "jumping-jacks", "lunges", "plank"};
//		int round = 0;
//		while (round < 4) {
//			System.out.println("Round " +  ++round);
//			for (String ex : exercises) {
//				System.out.println(">>> 30sec " + ex);
//			}
//		}
//		
//		String[] apples = {"fuji", "gala", "red delicious","pink lady"};
//		outer: for (int i = 0; i < 7; i++) {
//			for (String apple : apples) {
//				if (apple.equals("red delicious")) break outer;
//				System.out.println(apple);
//			}
//		}
		
		
//		String[] exercises = {"squats", "jumping-jacks", "push-ups", "lunges", "plank"};
//		int round = 0;
//		outer: while (round < 4) {
//			System.out.println("Round " +  ++round);
//			for (String ex : exercises) {
//				int time = 10 * round;
//				if (ex.equals("push-ups") && time > 20) 
//					continue outer;
//				System.out.println(">>> " + time + "sec " + ex);
//			}
//			System.out.println("Rest 1min");
//		}
		
		
		// Example 2: TODO run the below code and drop a screenshot in the chat
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println(String.format("i=%d, j=%d", i, j)); // first argument must be formatter string, the rest must match the formatter types
//			}
//		}
//		
		// Example 3: Do 4 rounds of the following exercises
//		ArrayList<Exercise> circuit = new ArrayList<>();
//		circuit.add(new Exercise("burpees", 60));
//		circuit.add(new Exercise("flutter kicks", 30));
//		circuit.add(new Exercise("bear crawls", 30));
//		circuit.add(new Exercise("plank", 500));
//		circuit.add(new Exercise("jumping jacks", 30));

//		Iterator<Exercise> itr = circuit.iterator(); // WILL THIS WORK?
		// Do 4 rounds of the circuit
//		for (int i = 1; i <= 4; i++)
//		{
//			System.out.println("Round " + i);
//			// Set up an iterator and go through the list
//			Iterator<Exercise> itr = circuit.iterator();
//			while (itr.hasNext()) {
//				Exercise ex = itr.next();
//				// print out the exercise and time
//				System.out.println(">>>>" + ex.time + " sec of " + ex.name);
//			}
//		}
		
		int outerCount = 0;
		int innerCount = 0;
		int k = 0;
		while (outerCount < 3) {
			System.out.println("outerCount is " + outerCount);
			while (innerCount < 4) {
				innerCount++;
				System.out.println("outercount = " + outerCount +", innerCount = " + innerCount);
				k++;
//				innerCount = 0;
			}
			innerCount = 0;
			outerCount++;
		}
		System.out.println(k);
		
		// Example 3:
//		int k = 0;
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 4; j++) {
//				System.out.println("i=" + i + ", j=" + j);
//				k++;
//			}
//		}
//		System.out.println("k=" + k);
	}

}
