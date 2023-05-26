package com.skillstorm.training.day5;

public class MemoizedFibonacci {
	/* 
	 * What is memoization? -- memorizing (aka caching) the values to avoid re-caluculating them over and over
	 */
	public static Long[] fibs = new Long[100]; // defaults to filled with null values
	
	
	// initialize the values we know from the definition
	static { // this is OK bc it runs when the class loads
		fibs[0] = 0L; // long literal needs L
		fibs[1] = 1L;
	}
	
	
	// Memoized version
	public static long fibonacciMemoized(int n) {
		// BASE CASE
		if (n < 2) {
			return n;
		}
		// RECURSION
		long fibNm1;
        long fibNm2;
		if (fibs[n - 1] == null) {//do i have n - 1 calculated)
			// make recursive call
			fibNm1 = fibonacciMemoized(n - 1);
		} else {
			 fibNm1 = fibs[n - 1];
		}
		
		
		
		if (fibs[n - 2] == null) {// do I have n - 2 calculated)
			// check if HAVE already before calling again
			 fibNm2 = fibonacciMemoized(n - 2);
		} else {
			 fibNm2 = fibs[n - 2];
		}
		
		
		
		fibs[n] = fibNm1 + fibNm2;
		return fibs[n];
	}
}
