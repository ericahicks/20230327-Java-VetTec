package com.skillstorm.training.day4.ArrayListPractice;

public class Student implements Comparable<Student> {
	
	private String name;
	
	private int grade; // out of 100
	
	public Student() {
		
	}
	
	public Student(String name) {
		this(name, 0);
	}
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		return name + "'s grade is " + grade + "%\n";
	}

	@Override // 0 if equal
	          // neg if this is smaller
	          // pos if this is larger
	public int compareTo(Student other) {
//		return this.name.compareTo(other.name);
//		return this.grade - other.grade; // returns 0 if they are the same
	                                    // returns < 0 if this.grade is < other.grade
                                         // returns > 0 if this.grade is > other.grade
		return other.grade - this.grade;
	}
}
