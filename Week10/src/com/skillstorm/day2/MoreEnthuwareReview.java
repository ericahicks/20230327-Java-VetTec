package com.skillstorm.day2;
import java.time.*;
import static java.time.Month.*;
public class MoreEnthuwareReview {
	

	//////////////////////////////////////////////////////////////////////////////
	// 13 method overriding and method overloading
	class Parent {
		public void doStuff() { }
	}
	class Child {
		public void doStuff() { }
	}

	//////////////////////////////////////////////////////////////////////////////
	// 29 variable scope
	

	///////////////////////////////////////////////////////////////////////////////
	// 30 2d-arrays
	// Three was to declare a 2D array:
	//
	// How many dimensions does each of the following arrays have?
	

	//////////////////////////////////////////////////////////////////////////////
	// 34 switch statement fall through
	//    throw and return in catch and finally blocks

	// 43 switch statements
	/*
	 * What data types can be used in a switch statement?
	 * 
	 * 
	 * What data types can be used in a case statement given the switch statement is:
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'c';
		int i = 3;
		long l = 4;
		float f = 0.5f;
		double x = 0.75;
		
		// Which are allowed?
//		c = s;
//		s = c;
//		c = (short) 128;
//		s = 'c';
		
		Month month = LocalDate.now().getMonth();
		switch (month) {
			case JANUARY: 
			case FEBRUARY: 
			case MARCH: 
				System.out.println("Winter");
			case APRIL: 
			case MAY: 
			case JUNE: 
				System.out.println("Spring");
			case JULY: 
			case AUGUST: 
			case SEPTEMBER: 
				System.out.println("Summer");
			case OCTOBER: 
			case NOVEMBER: 
			case DECEMBER: 
				System.out.println("Fall");
		}
	}

}
