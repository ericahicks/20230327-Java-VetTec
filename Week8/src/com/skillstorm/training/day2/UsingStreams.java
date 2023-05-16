package com.skillstorm.training.day2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreams {
	
	public static void main(String[] args) {
		// Example 1: Creating a stream
		Stream<Integer> nums = Stream.of(1, 2, 3, 4, 5, 6);
		
//		nums.forEach(System.out::println);
//		nums.map((x) -> {
//			int doubled = x * 2;
//			System.out.println(doubled);
//			return doubled;
//		}); // nothing happens until a terminal operation is applied
		List<Integer> lst = nums.map((x) -> {
			int doubled = x * 2;
			System.out.println(doubled);
			return doubled;
		}).collect(Collectors.toList());
		System.out.println(lst);
		// Example 2: Creating a stream from an ArrayList
		
		
	}

}
