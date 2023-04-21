package com.skillstorm.training.day5;

public class WrapperPractice {

	public static void main(String[] args) {
		example2();
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

	}

	// Example 3b: Implicitly unwrapping an Integer using "Auto-unboxing"
	public static void example3b() {

	}

	// Example 4: Casting between byte > short > char > int > long > float >
	// double with wrappers
	public static void example4() {

	}

	// Example 5: Arithmetic with wrapper classes
	public static void example5() {

	}

	// Example 6: String conversion
	public static void example6() {

	}

	// Example 7: Wrapper classes are immutable
	public static void example7() {

	}

	public static void example8() {

	}

	public static void example9() {

	}

}
