package com.skillstorm.training.day5;

import java.util.ArrayList;
import java.util.Arrays;

public class WrapperPractice {

	public static void main(String[] args) {
		example6();
		

		// Hexidecimal example color code to decimal
		// User enters a color CD5C44
		String color = "CD5C44";
		colorDecoder(color);
	}

	// Example 1: Explicitly creating a wrapper object
	public static void example1() {
		// Method 1:
		Integer x = Integer.valueOf(1); // valueOf caches values so does not
										// have to create a new one every time

		// Method 2:
		Integer y = new Integer(1); // do not use because inefficient use of
									// memory

	}

	// Example 1b: Explicitly unwrapping an Integer
	public static void example1b() {
		Integer i = Integer.valueOf(10);
		int j = i.intValue();
		System.out.println(i instanceof Integer); // true
//		System.out.println(i.intValue() instanceof Integer); // incompatible operator types int and Integer
	}

	// Example 2: Comparing wrapper objects using == vs .equals
	public static void example2() {
		// Method 1:
		Integer x = Integer.valueOf(1); // valueOf caches values so does not
										// have to create a new one every time
		Integer alsoX = Integer.valueOf(1); 
		System.out.println("x == alsoX is " + (x == alsoX));
		System.out.println("x.equals(alsoX) is " + (x.equals(alsoX)));

		// Method 2:
		Integer y = new Integer(1); // do not use because inefficient use of
									// memory
		System.out.println("y == x is " + (y == x));
		System.out.println("y.equals(x) is " + (y.equals(x)));
	}

	// Example 3: Implicitly creating a wrapper object using "Autoboxing"
	public static void example3() {
		Integer a = 1;
		Integer b = 2; 
		int x = a;
		int y = b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	}

	

	// Example 4: Casting between 
	//  byte > short > char > int > long > float > double with wrappers
	public static void example4() {
		int a = 1;
		double b = a; // works bc of wide casting
		
		Integer x = Integer.valueOf(1);
//		Double y = x; // type mismatch cannot convert from type Integer > Double
		Double y = x.doubleValue();
		Double z = (double) x; // auto-unboxing to int then needs explict cast to double to autobox to Double
	}

	// Example 5: Arithmetic with wrapper classes
	public static void example5() {

	}

	// Example 6: String conversion
	public static void example6() {
		// User enters in a value between 1 and 10
		// Enter a value between 1 and 10
		String response = "10";
		int num = Integer.valueOf(response); // returns an Integer object which gets unboxed
		int numV2 = Integer.parseInt(response); // returns a primitive int
		
		System.out.println(num + " and " + numV2);
		System.out.println("The value of the String \"10\" is: ");
		// .valueOf with a radix specified (decimal is 10, binary is 2, hexidecmil is 16, octal is 8)
		System.out.println(Integer.valueOf("10", 10));
		System.out.println(Integer.valueOf("10", 2));
		System.out.println(Integer.valueOf("10", 16));
		System.out.println(Integer.valueOf("10", 8));
		
	}
	
	public static void colorDecoder(String color) {
		int red = Integer.parseInt(color.substring(0, 2), 16);
//		System.out.println(red);
		int green = Integer.parseInt(color.substring(2, 4), 16);
//		System.out.println(green);
		int blue = Integer.parseInt(color.substring(4, 6), 16);
//		System.out.println(blue);
		System.out.println(String.format("The color 0x%s is rgb(%d,%d,%d)", color, red, green, blue));
	}

	// Example 7: Wrapper classes are immutable
	public static void example7() {
		Integer test = 1;
		Integer copyTest = test;
		System.out.println("test is      " + test);
		System.out.println("copyTest is  " + copyTest);
		test++;
		System.out.println("test is now       " + test);
		System.out.println("copyTest is still " + copyTest);
	}

	// Example 8: Wrapper classes in an ArrayList
	public static void example8() {
		// Polymorphism applies
		ArrayList<Number> numbers = new ArrayList<>();
		numbers.add(Byte.valueOf((byte)1));
		numbers.add(Short.valueOf((short)1));
		numbers.add(Integer.valueOf(1));
		numbers.add(Long.valueOf(1));
		numbers.add(Float.valueOf(1));
		numbers.add(Double.valueOf(1));
		System.out.println(numbers);
		
		// Polymorphism here? siblings don't work
		ArrayList<Double> bigNumbers = new ArrayList<>();
		bigNumbers.add(Double.valueOf(1));
		bigNumbers.add((double)Float.valueOf(1)); // It autounboxes to int, does the cast to double, autoboxes again
		bigNumbers.add((double)Long.valueOf(1)); // It autounboxes to int, does the cast to double, autoboxes again
		bigNumbers.add((double)Integer.valueOf(1)); // It autounboxes to int, does the cast to double, autoboxes again
		bigNumbers.add((double)Short.valueOf((short)2));
		bigNumbers.add((double)Byte.valueOf((byte)2));
	}

	// Example9: ArrayList of wrapper classes and making copies
	// Are the copies independent of eachother?
	public static void example9() {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
		ArrayList<Integer> copyOfNumbers = numbers;
		ArrayList<Integer> betterCopyOfNumbers = new ArrayList<>(numbers);
		System.out.println("numbers is              " + numbers);
		System.out.println("copyOfNumbers is        " + copyOfNumbers);
		System.out.println("betterCopyOfNumbers is  " + betterCopyOfNumbers);
		System.out.println("Change made:");
		numbers.set(0, 10);
		System.out.println("numbers is              " + numbers);
		System.out.println("copyOfNumbers is        " + copyOfNumbers);
		System.out.println("betterCopyOfNumbers is  " + betterCopyOfNumbers);
	}
	
	// Deep copy vs Shallow copy
	

}

class Wrapper {
	Integer x;
}
