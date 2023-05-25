package com.skillstorm.training.day4.recursion;

public class RecursionExamples {
	
	public static void main(String[] args) {
		hello(10);

		System.out.println(getFib(4));
		System.out.println(factorial(50));
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
	
	public static int getFib(int n) {
		System.out.println("n = " + n) ;
		if (n < 2)    // base case
			return n; // if n is 0 return 0 and if n is 1 return `
		return getFib(n-1) + getFib(n-2);		// if n is 2 or more return the sum of the previous two values
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
