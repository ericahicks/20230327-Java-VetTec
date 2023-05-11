package com.skillstorm.training.day4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;

public class ClassicExamplesOfDataStructureProblems {
	
	public static void main(String[] args) {

		// Problem 1: Reversing a string using a stack
		// Data type to put in the stack
		Deque<Character> chars = new ArrayDeque<>();
		// 3 stack methods are: pop, push, peek
		String str = "Hello";
		for (int i = 0; i < str.length(); i++) {
			chars.push(str.charAt(i));
		}
		// To get the reversed String
		String reverse = "";
		while (!chars.isEmpty()) {
			reverse += chars.pop();
		}
		System.out.println(reverse);
		
		// Problem 2: Counting how many times each element occurs in a list
		ArrayList<String> books = new ArrayList<>(Arrays.asList("OCA Study Guide", 
				                                                "OCA Study Guide",
				                                                "Harry Potter",
				                                                "Lord of the Rings",
				                                                "Harry Potter",
				                                                "Enders Game",
				                                                "1984",
				                                                "1984",
				                                                "1984"));
		
		// key-value pairs
		// key is book title
		// value is number of occurences
		HashMap<String, Integer> occurences = new HashMap<>();
		for (String book : books) {
			// If the book does not exist in the map
			// store the title with the value 
			if (!occurences.containsKey(book)) {
				occurences.put(book, 1); // 
			} else {
				// update the value to be the current  value + 1
				occurences.put(book, occurences.get(book) + 1);
			}
		}
		System.out.println(occurences);
	}

}
