package com.skillstom.training.day1;

import java.util.Arrays;

public class QuizReview {
	
	public static void main(String[] args) {
		// Stream review
		// - "lazy evaluation" (vs eager evaluation)
		// - intermediate operations do not run until a terminal operation is applied
		Arrays.asList(1, 2, 3, 4).stream().peek(System.out::println).map(x -> x * 10).forEach(System.out::println);;
		
		// StringBuilder
		// - like Strings but they are mutable
		// - StringBuilder methods actually change the original object
		// - String methods always return a new object without mutating the original
		StringBuilder b = new StringBuilder("hello");
		b.append("apples");
		
		String str = "hello";
		str.concat("apples");
		
		System.out.println(b);
		System.out.println(str);
		
		b.insert(0, 1).insert(3, 4); // helloapples
		                             // 0123
                                     // 1helloapples
		                             // 0123
		                             // 1he4lloapples
		                             // 0123456789
		System.out.println(b);
		
		b.replace(0, 7, "red ");
		System.out.println(b);
		
		b.toString().toUpperCase();
		System.out.println(b); // red apples
		
		b.append(Arrays.asList("C", "a", "t"));
		System.out.println(b);
	}

}
