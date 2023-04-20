package com.skillstorm.training.day4;

import java.util.ArrayList;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		// Example 1: Creating a String ArrayList
		ArrayList<String> names = new ArrayList<>(8); // initial capacity is 8
		System.out.println(names);
		
		// Example 2: Add elements
		names.add("Jon");
		System.out.println(names);
		// TODO Add all the students in the class and print out your ArrayList
		// Drop a screenshot in the chat
		names.remove("Jon"); // REMOVING works! 
		System.out.println(names);
		names.add("Tony");
		names.add("Blake");
		names.add("Daun");
		names.add("Jaycie");
		names.add("Josh");
		names.add("Senia");
		names.add("Tenzin");
		System.out.println("Length: " + names.size());
		System.out.println(names);
		
		// Example 3: Add someone in the middle of the list
		names.add(2, "Jon");
		System.out.println(names);
		
		// Example 4: Sort alphabetically
		names.sort(null); // Don't worry about creating a "comparator", null uses the natural ordering
		System.out.println(names);
		
		// Example 5: Buggy code example
//		names.add(10, "Erica"); // java.lang.IndexOutOfBoundsException: Index: 10, Size: 8
		
		// Example 6: Adding the 9th person triggers the capacity to increase
		names.add("Erica");
		System.out.println(names);
		System.out.println(names.size());
//		System.out.println();
		
		// Example 7: indexOf
		int myTurn = names.indexOf("Erica");
		System.out.println("I am " + (myTurn + 1) + " in the presentation order out of " + names.size() + ".");
		
//		String person = names.indexOf(names.size() - 1);
		String lastPerson = names.get(names.size() - 1);
		System.out.println("Last person is " + lastPerson);
		
		int student10zinsTurn = names.indexOf("10zin");
		System.out.println("10zin's turn is " + student10zinsTurn);
		
		// Example 8: contains
		boolean isMilesPresenting = names.contains("Miles");
		System.out.println("Is Miles presenting today? " + isMilesPresenting);
		
		// Example 9: Replace Jon with Miles
		// Step 1: Get Jon's index
		int jonsIndex = names.indexOf("Jon");
		// Step 2: Overwrite Jon with Miles
		names.set(jonsIndex, "Miles");
		System.out.println(names);
		System.out.println("Is Miles presenting today? " + names.contains("Miles"));
	}
	
	// TODO Generate random order of students
	public static void printOrder(ArrayList<String> students) {
		
	}

}
