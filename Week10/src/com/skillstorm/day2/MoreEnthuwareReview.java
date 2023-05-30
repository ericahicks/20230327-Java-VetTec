package com.skillstorm.day2;
import java.time.*;
import static java.time.Month.*;
public class MoreEnthuwareReview {
	

	//////////////////////////////////////////////////////////////////////////////
	// 13 method overriding and method overloading
	// what are the rules for overriding a method?
	// - return type = must be the exact or a sybtype
	// - parameter types = parameter types have to match exactly
	// - exception types = must be the exact or subtype or fewer or none
	// - access modifiers = can be more permissive but not less permissive
	// - other modifiers:
	//    - synchronized parent method can be a synchronized or unsynchronized child method
	//    - cannot change to static if not originally there     ||  
	// see example Parent and Child class at bottom of file    _||_
	//                                                        \    /
	//                                                         \  /
	//                                                          \/

	//////////////////////////////////////////////////////////////////////////////
	// 29 variable scope
	

	///////////////////////////////////////////////////////////////////////////////
	// 30 2d-arrays
	// Three was to declare a 2D array:
	//
	int[][] a; // 2d
	int b[][]; // 2d
	int[] c[]; // 2d
	/*
//	int x, y, z;
 *  int x;
 *  int y;
 *  int z;
 * */
	
	// How many dimensions does each of the following arrays have?
	int[][] x[], y, z[];
	/*
	 * same as saying
	 * int[][][] x;
	 * int[][] y
	 * int[][][] z
	 */
	// x has 3 dimensions
	// y has 2 dimension
	// z has 3 dimensions
	
	int[] array1, array2[]; int[][] array3; int[] array4[], array5[];
	/*
	 * array1 1D
	 * array2 2D
	 * array3 2D
	 * array4 2D
	 * array5 2D
	 */
	// How to initialize a 2D array?
	array2 = new int[][]{{1, 3}, {1, 4, 7}, null};
	//                     0         1       2
	array1 = new int[] {1, 2, 3};
	// replace the null with the value stored in array1
	array2[2] = array1;
//	array2 = array1; // type mismatch
			
	// How can I grab the value 7?
	int seven = array2[1][2];
	int three = array2[0][1];
	

	//////////////////////////////////////////////////////////////////////////////
	// 34 switch statement fall through
	//    throw and return in catch and finally blocks

	// 43 switch statements
	/*
	 * What data types can be used in a switch statement?
	 * - byte or Byte
	 * - char or Character
	 * - short or Short
	 * - int or Integer
	 * - String
	 * - Enum types
	 * 
	 * What data types can be used in a case statement given the switch statement is:
	 * char c
	 * switch (c)
	 * case can be:
	 * - char
	 * - int in a valid range of 0 to 2^15
	 * - short in a valid range
	 * - bye in a valid range
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
	
		/*
		 * - char
		 * - int in a valid range of 0 to 2^15
		 * - short in a valid range
		 * - bye in a valid range
		 * */
		char myChar;
//		myChar = 200000;
		myChar = 32000;
		myChar = (byte) 127;
//		myChar = (byte) -127;
		myChar = (short) 127;
		
		byte b = 1;
		short s = 2;
		char c = 'c';
		int i = 3;
		long l = 4;
		float f = 0.5f;
		double x = 0.75;
		// Which are allowed?
		c = (char) s; // s; is not allowed because could be out of range of valid char values
//		s = c; // c;  is not allowed because could be out of range
		
		c = (short) 128;
		s = 'c'; // this is the special case where it is a LITERAL
		
		// Will this work?
//		 s = Character.MAX_VALUE; // TOO LARGE
		
		 c = Short.MAX_VALUE; // Why does this one work? 32000 is the max which fits in the range 0-64000
//		 c = Short.MIN_VALUE; // Why doesn't this work? -32000 is out of the range 0-64000
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Month month = LocalDate.now().getMonth();
		switch (month) {
			case JANUARY: 
			case FEBRUARY: 
			case MARCH: 
				System.out.println("Winter");
				break;
			case APRIL: 
			case MAY: 
			case JUNE: 
				System.out.println("Spring");
				break;
			case JULY: 
			case AUGUST: 
			case SEPTEMBER: 
				System.out.println("Summer");
				break;
			case OCTOBER: 
			case NOVEMBER: 
			case DECEMBER: 
				System.out.println("Fall");
				break;
			default:
				System.out.println("Not a month");
				break;
		}
	}
	
	public void switchTest(byte x){
		   switch(x){
		      case 'b':   // 1 'a' is 97 this means the decimal value of b is 98 is that in the range -128 to 127
		      default :   // 2 default can be anywhere, but will always run only if no case matches
		      case -2:    // 3 
		      case 80:    // 4
		   }
		}

}
class Test {
	public static void main(String[] args) {
		Parent p = new Child();
		p.doStuff(); // overriden method body chosen at runtime
		p.update(); // static method (shadowed) chosen at compile time
		
	}
}

class Parent {
	protected Parent doStuff() throws Exception { }
	public static void update() { }
	
	// overloading
	protected static Parent doStuff(int x) throws Exception { } // must have different params than above
	
	// method signature = parameter types and the name
	// static isn't part of the method signature
}
class Child extends Parent {
	@Override
	public Child doStuff() { } // will this work?

	// redefining the static method is not called overriding it is called "shadowing"
	public static void update() { } // static method body is chosen at compile time
}
