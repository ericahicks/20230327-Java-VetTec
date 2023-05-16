package com.skillstorm.training.day2;

import java.util.Arrays;

public class UsingLambdas {
	
	// Example 1: Using lambdas as a return type
	public static Incrementer<Integer> getIncrementer(int times) {
		return (x) -> x + times;
	}
	
	

	public static void main(String[] args) {
		
		// Example 2: Storing lambdas in a variable
		Incrementer<Integer> inc2 = getIncrementer(2);
		Incrementer<Integer> inc10 = getIncrementer(10);
		Incrementer<Integer> inc100 = getIncrementer(100);
		Incrementer<Integer> inc5 = getIncrementer(5);
		
		// How do I use a lambda stored in a variable?
		//  Just like any other object with fields we can call!!! 
		for (int i = 0; i < 100; i = inc5.increment(i)) {
			System.out.println(i);
		}
	
	}

}

interface Incrementer<E extends Number> {
	E increment(int x); 
}