package com.skillstorm.training.day4;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExamples {
	
	public static void main(String[] args) {
		///////////////////////////////////////////////////////////////////////
		// TODO put a screenshot in the chat of the below priority queue order
		PriorityQueue<String> people = new PriorityQueue<>();
		people.add("10zen");
		people.add("Tony");
		people.add("Daun");
		people.add("Ksena");
		people.add("Erica");
		people.add("Sean");
		people.add("Blake");
		people.add("Jaycie");
		
		while (!people.isEmpty()) {
			System.out.println(people.poll());
		}
		// Ordering is the natural ordering of Strings 
		PriorityQueue<String> people2 = new PriorityQueue<>(new StringLengthComparator());
		people2.add("10zen");
		people2.add("Tony"); // 4
		people2.add("Daun"); // 4
		people2.add("Ksena");
		people2.add("Erica");
		people2.add("Sean"); // 4
		people2.add("Blake");
		people2.add("Jaycie"); // 6
		System.out.println("Using the name length to prioritize the people:");
		while (!people2.isEmpty()) {
			System.out.println(people2.poll());
		}
		
//		PriorityQueue<String> people3 = new PriorityQueue<>(new ());
//		people3.add("Ann");
//		people3.add("Ana");
//		people3.add("Jo");
//		people3.add("Oj");
//		System.out.println("Using the name sum to prioritize the people:");
//		while (!people3.isEmpty()) {
//			System.out.println(people2.poll());
//		}
		PriorityQueue<Task> todos = new PriorityQueue<>(new TaskComparator());
		todos.offer(new Task("study")); 
		todos.offer(new Task("clean bathroom")); // 2
		todos.offer(new Task("sleep")); 
		todos.offer(new Task("clean windows")); // 2
		todos.offer(new Task("clean car")); // 2
		System.out.println("\nPrioritizing todos:");
		while (!todos.isEmpty()) {
			System.out.println(todos.poll().name); //  Task cannot be cast to java.lang.Comparable, so TaskComparator is used
		}
	} // end main
} // end main class

class Task {
	String name;
	public Task(String name) { this.name = name; }
}

class TaskComparator implements Comparator<Task> {
	@Override
	public int compare(Task o1, Task o2) {
		if (o1.name.contains("clean")) 
			return 2;
		return 1;
	}
}
