package com.skillstorm.training.day4.ArrayListPractice;
import java.util.ArrayList;
import java.util.Arrays;

public class GradeStudents {
	
	public static void main(String[] args) {
		// Example 12: ArrayList with a custom type
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("Blake"));
		students.add(new Student("Daun"));
		students.add(new Student("Jaycie"));
		students.add(new Student("Josh"));
		students.add(new Student("Senia"));
		students.add(new Student("Tenzin"));
		students.add(new Student("Tony"));
		
//		ArrayList<Student> students = new ArrayList<>(Arrays.asList(new Student("Bob"), new Student("Jo"), new Student("Sue")));
//		System.out.println(students);
		grade(students);
		System.out.println(students);
	}
	
	// Method to assign grades
	public static void grade(ArrayList<Student> students) {
//		for (int i = 0; i < students.size(); i++) {
//			// Generate random grade between 0 and 100
//			int grade = (int) (Math.random() * 101); // allow 0 and allow 100
//			students.get(i).setGrade(grade);
//		}
		
		// Someone give me the setup for a for-each loop
		for (Student student : students) {
			student.setGrade((int) (Math.random() * 101));
		}
	}

}
