package com.skillstorm.day2.quiz;

import java.util.ArrayList;
import java.util.Random;

public class QuizReview {

	public static void main(String[] args) {
		// Concepts to remember
		// 1. method overloading - Java looks for the method with the exact
		// parameter type before casting or autoboxing
//	     ArrayList<Integer> nums = new ArrayList<>();
//	      nums.add(1); // Autoboxing so int become Integer
//	      nums.add(2); // If removing the Integer 2, this element at index 1 would be removed
//	      nums.add(3); // Index 2 is here so 3 is removed
////	      nums.remove(2); // This is not autoboxing, it looks for a method with the exact type int
//	      nums.remove((Integer) 2); // did not auto unbox, it treats Integer as an object
//	      System.out.println(nums);

//	      ArrayList<String> names = new ArrayList<>();
//	      names.add("1");
//	      names.add("2");
//	      names.add("3"); // index 2
////	      names.remove(2);
////	      names.remove((Integer) 2); // object and doesn't find a match REMEMBER boolean remove(Object other)
//	      names.remove("2"); // treated as an object not a number
//	      System.out.println(names);
//		long l = (new Random()).nextLong();
//		System.out.println(l);
//		System.out.println(Long.toBinaryString(l));

		/////////////////////////////////////////////////////////////
		// Problem 19
//		String foo = "hello";
//		String bar = new String("hello"); // will always create a new object rather than use the String pool
////		String bar = "hello"; // assume the String pool has cached this value and will reuse the previous String literal
//		System.out.println(foo == bar);
//		System.out.println(foo.equals(bar));
		
		/////////////////////////////////////////////////////////////
		// Problem 20
		int x = 30; // now 31
		int a = x++; // 30
		int b = a <= 30 ? a++ : a; // conditional ? trueCaseValue : falseCaseValue; must be a single value of the correct type
		// the above is the same as 
//		int b;
//		if (a <= 30) {
//			b = a++;
//		} else {
//			b = a;
//		}
		int c = b == a ? ++a : b++;
		System.out.println(a + b + c);
		
		
		
		
		
		
		// Expand the following into an if-else
		int m = 0;
		int n = 1;
		int z = (m > n ? m : n );
		System.out.println(z);
		
		if (m > n) {
			z = m;
		} else {
			z = n;
		}
		// Example usage of ternary: 
		boolean coin = new Random().nextBoolean();
		System.out.println(coin ? "Heads" : "Tails");
	}

}
