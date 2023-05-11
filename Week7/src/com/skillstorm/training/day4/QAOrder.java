package com.skillstorm.training.day4;

import java.util.Random;
import java.util.PriorityQueue;

public class QAOrder {
	
	public static void main(String[] args) {
		PriorityQueue<Student> students = new PriorityQueue<>();
		students.add(new Student("Anthony"));
		students.add(new Student("Blake"));
		students.add(new Student("Ksena"));
		students.add(new Student("Jaycie"));
		students.add(new Student("Tenzin"));
		
		// loop through
		while (!students.isEmpty() ) {
			System.out.println(students.poll());
		}
		
	}

}

class Student implements Comparable<Student> {
	String name;
	
	public Student(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		// Random ordering -- generate a random int 
		return new Random().nextInt();
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
