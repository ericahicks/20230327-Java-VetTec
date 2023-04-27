package com.skillstorm.training.day4.enthuware;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethodsToKnow {
	
	public static void main(String[] args) {
		// Create
		// Creating an array list with or without import
		java.util.ArrayList<String> a1 = new java.util.ArrayList<>();
		
		// Creating an array list with or without specifying a type
		// PLEASE don't code this way, always specify a type
		java.util.ArrayList b = new java.util.ArrayList(); // defaults to using Object as the type
		
		// Lots of cake
		ArrayList<String> cake = new ArrayList<>(Arrays.asList("Carrot cake", 
				"chocolate cake", "cheese cake", "pound cake", "angel food cake", "ice cream cake"));
		// Add
		cake.add("cupcake"); // appends to the end
		cake.add(3, "wedding cake"); // inserts at index 8 shifting everything after right one index
		cake.addAll(Arrays.asList("red velvet cake", "strawberry shortcake")); // appends all to end
		cake.addAll(1, Arrays.asList("pineapple upside down cake", "vanilla cake")); // inserts all starting at index 1
		
		System.out.println(cake);
		
		// Remove
		cake.remove("wedding cake"); // returns true if list changed
		String was = cake.remove(8); // returns element removed
		System.out.println("Removed " + was);
		System.out.println(cake);
		
		// Update
		String oldValue = cake.set(4, "pumpkin cheese cake");
		
		// Access
		String value = cake.get(4);
		System.out.println(oldValue + " updated to " + value);
		
		// Remove all instances (of everything specified)
		ArrayList<String> letters = new ArrayList<>(Arrays.asList("a", "b", "a"));
		ArrayList<String> removals = new ArrayList<>(Arrays.asList("a"));
		letters.removeAll(removals);
		System.out.println(letters);
		
		// Contains
		boolean hasChocolate = cake.contains("chocolate cake");
		System.out.println("Have chocolate cake is " + hasChocolate);
		
		// 
	}

}
