package com.skillstorm.training.day4.enthuware;

import java.util.ArrayList;
import java.util.List;

public class Test2Review {

	public static void main(String[] args) {
		// Problem 10
		java.util.Date d = new java.util.Date(); // creates a date with the current day and time
		System.out.println(d);
		
		// Problem 57
		List s1 = new ArrayList(); // 1 
		s1.add("ann");//2 
		if(s1.contains("ann"))//3 
		s1.add("ann");//4
		System.out.println(s1.size()+" "+s1.indexOf("ann"));//5
		
		// Dead code examples
//		while (false) { // This one Java knows it's dead
//			System.out.println("hello");
//		}
		
//		if (false) { // This one eclipse knows but Java doesn't
//			System.out.println("hello");
//		}
		
//		if (true) { // This one eclipse knows but Java doesn't
//			System.out.println("hello");
//		} else {
//			System.out.println("bye");
//		}
		
//		for (int i = 0; i < 10; i ++) {
//			if (i < 5) {
//				break;
//			} else {
//				continue;
//			}
//			System.out.println("Hello"); // deadcode Java won't compile
//		}

	}

}
