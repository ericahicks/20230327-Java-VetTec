package com.skillstorm.training.day4.recursion;

import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;

public class RecursionExamples {
	
	public static void main(String[] args) {
		hello(10);

		System.out.println(fibinocci(4));
		Instant start = Instant.now();
		int value = fibinocci(40);
		Instant end = Instant.now();
		Duration time = Duration.between(start, end);
		System.out.println("value is " + value);
		System.out.println("time taken: " + time);
		System.out.println(Long.MAX_VALUE);
//		System.out.println(sumN(3));
	}
	// TODO put in the chat the output from the code below
	public static void hello(int times) {
		if (times > 0) {
			System.out.println("hi");
		   hello(times - 1); //Exception in thread "main" java.lang.StackOverflowError
		} //----\\
		 //MAGIC!\\
//		System.out.println(getFib(1));
//		System.out.println(getFib(0));
	}
	
	// FIBONONACCI SEQUENCE
	// fib(n) = fib(n-1) + fib(n-2) for n > 1
	// fib(0) = 0 base case
	// fib(1) = 1 base case
	// fib(2) = 1
	// fib(3) = 2
	// fib(4) = 3
	//          5
	//          8
	//         13
	//         21
	public static HashMap<Integer, Integer> fibs = new HashMap<>();
	
	public static int fibinocci(int n) {
//		System.out.println("n = " + n) ;
		if (n < 2)    // base case
			return n; // if n is 0 return 0 and if n is 1 return `
		int prev;
		if (fibs.containsKey(n - 1))
			prev = fibs.get(n - 1);
		else {
			prev = fibinocci(n-1) + fibinocci(n-2);
			fibs.put(n - 1, prev);
		}
		return fibinocci(n-1) + fibinocci(n-2);		// if n is 2 or more return the sum of the previous two values
	}
	
	// factorial ex: 5! = 5 * 4 * 3 * 2 * 1
	// factorial(5) = 5 * factorial(4) only true for n > 1
	// factorial(n) = n * factorial(n - 1);
	// factorial(n - 1) = (n - 1) * factorial(n-2)
	// ....
	// factorial(0) = 1 BASE CASE
	public static long factorial(int n) {
		if (n == 0)
			return 1;
		else
		   return n * factorial(n - 1);
	}

	public static int sumN(int n) {
		if (n == 0)
			return 0;
		else
			return n + sumN(n - 1);
	}
}
