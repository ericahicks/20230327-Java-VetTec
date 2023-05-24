package com.skillstorm.training.day1;

public class ComparisonExamples {

	public static void main(String[] args) {
//		char grade = 'B';
//		switch (grade) {
//			case 'A':
//				System.out.println("Pass");
//			case 'B':
//				System.out.println("Pass");
//			case 'C':
//				System.out.println("Pass");
//			case 'D':
//				System.out.println("Fail");
//			case 'F':
//				System.out.println("Fail");
//			default:
//				System.out.println("Invalid grade");
//		}
//		
		System.out.println("a".compareTo("c")); // negative 
		System.out.println("x".compareTo("a")); // positive 
		System.out.println("B".compareTo("b")); // negative
		// only compares as many characters as the shortest string contains
		System.out.println("aa".compareTo("a")); // positive
		System.out.println("a".compareTo("aaaaa")); // negative
		
		System.out.println("comparing 1 and 2");
		System.out.println("1".compareTo("2")); // negative
		

		System.out.println("comparing 10 and 100");
		System.out.println("10".compareTo("100")); // negative
		

		System.out.println("comparing 1000 and 100");
		System.out.println("1000".compareTo("100")); // positive
		
		
		Car c1 = new Car();
		c1.make = "Toyota";
		c1.model = "Tacoma";
		c1.color = "grey";
		Object o = new Object();
		System.out.println(c1.equals(o));
		
		Car c2 = new Car();
		c2.make = "Toyota";
		c2.model = "Tacoma";
		c2.color = "pink";
		
		boolean result = c1.equals(c2);
		System.out.println(result);
	}//

}
