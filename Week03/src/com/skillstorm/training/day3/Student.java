package com.skillstorm.training.day3;

public class Student {
	
	public static final int MAX_NUM_EXAMS = 3;
	
	String name;
	double[] exams; // scores between 0 and 100
	int numExamsTaken; // could be between 0 and 3

	public Student() {
		this.name = "unknown";
		this.exams = new double[MAX_NUM_EXAMS];
		this.numExamsTaken = 0;
	}
	
	public Student(String name) {
		this.name = name;
		this.exams = new double[MAX_NUM_EXAMS];
		this.numExamsTaken = 0;
	}
	
	public Student(String name, int numExamsTaken, double exam1Score, double exam2Score, double exam3Score) {
		this.name = name;
		this.numExamsTaken = numExamsTaken;
		this.exams = new double[]{ exam1Score, exam2Score, exam3Score }; 
	}
	
	public double calculateGrade() {
		if (this.numExamsTaken == 0)
			return 0;
		double sum = 0;
		for (int i = 0; i < this.numExamsTaken; i++) {
			sum += this.exams[i];
		}
		return sum / this.numExamsTaken;
	}
	
//	public static double calculateGrade(Student s) {
//		return 0;
//	}
}
