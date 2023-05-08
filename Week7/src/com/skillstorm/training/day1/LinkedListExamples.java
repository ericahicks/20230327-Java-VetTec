package com.skillstorm.training.day1;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExamples {
	
	public static void main(String[] args) {
		// Example 1: Create an empty LinkedList
		// TODO put a screenshot in the chat of your empty list printed out to the console
		LinkedList<String> fruits = new LinkedList<>();
		
		LinkedList lst1 = new LinkedList(); // object type linked list
		
		System.out.println(fruits);
		System.out.println(fruits.size());
		
		// Example 2: Adding elements to the list
		fruits.add("apples");
		fruits.add("guava");
		fruits.add("lyche");
		fruits.add("mango");
		fruits.add("pineappple");
		
		System.out.println(fruits);
		fruits.add(1, "pears");
		System.out.println(fruits);
		
		fruits.addFirst("papaya");
		System.out.println(fruits);
		
		fruits.addLast("papaya");
		fruits.addLast("papaya");
		System.out.println(fruits);
		
		// Example 3: Removing elements from the list
		fruits.remove("papaya"); // first occurence
		System.out.println(fruits); // will contain [apples, pears, guava, lyche, mango, pineappple, papaya, papaya]
		
		fruits.removeAll(Arrays.asList("papaya", "pears"));
		System.out.println(fruits); // [apples, guava, lyche, mango, pineappple]
		
		String fruit = fruits.remove(2);
		System.out.println("Fruit removed was " + fruit);
		System.out.println(fruits);
		
		fruits.add(2, fruit);
		fruits.addFirst(fruit);
		System.out.println(fruits);
		
		fruits.removeLastOccurrence(fruit);
		System.out.println(fruits); // [lyche, apples, guava, mango, pineappple]
		// What will the index of lyche be?
		System.out.println(fruits.indexOf(fruit)); // 0
		
		// Insert a couple more lyche
		fruits.add(fruit);
//		fruits.add(3, fruit);
//		fruits.add(3, fruit);
		fruits.addAll(3, Arrays.asList(fruit, fruit));
		System.out.println(fruits);
		System.out.println(fruits.lastIndexOf(fruit)); // 7
		
		fruits.removeLast();
		System.out.println(fruits);
		System.out.println(fruits.lastIndexOf(fruit)); // 4
		
		String fruit2 = fruits.remove();
		System.out.println(fruit2);
		
		String fruit3 = fruits.removeFirst();
		System.out.println(fruit3);
		
		fruits.clear();
		System.out.println(fruits);
		
		// Example 4: clone method
		LinkedList<Door> doors = new LinkedList<>();
		Door door1 = new Door(true);
		Door door2 = new Door(false);
		doors.addAll(Arrays.asList(door1, door2));
		System.out.println("Doors is " + doors);
		// clone the list
		LinkedList<Door> doors2 = (LinkedList<Door>) doors.clone();
		System.out.println("Doors2 is " + doors2);
		// shallow or deep copy?
		doors.getFirst().open = false;
		System.out.println("Doors is " + doors);
		System.out.println("Doors2 is " + doors2);
	}
}

class Door {
	boolean open; // TODO fully encapsulate this later
	public Door(boolean open) { this.open = open;}
	@Override public String toString() { return "The door is " + (this.open ? "open" : "closed"); }
}
