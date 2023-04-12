package com.skillstorm.training.day3;

public class TestStudentCalculations {
	
	public static void main(String[] args) {
		Student s = new Student();
		System.out.println(s.name + " has a grade of " + s.calculateGrade() + " so far");
		Student s2 = new Student("Sue", 2, 80, 93, 0);
		System.out.println(s2.name + " has a grade of " + s2.calculateGrade() + " so far");
		Student s3 = new Student("Jo");
		System.out.println(s3.name + " has a grade of " + s3.calculateGrade() + " so far");
	}

}
