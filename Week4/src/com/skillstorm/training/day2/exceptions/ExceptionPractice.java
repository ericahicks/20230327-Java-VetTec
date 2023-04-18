package com.skillstorm.training.day2.exceptions;

public class ExceptionPractice {

	// TODO drop a screenshot in the chat of the below code running without
	// exception handling
	public static void main(String[] args) {
		try {
			System.out.println(divide(1, 0));
		} catch (ArithmeticException e) {
			System.out.println("catch statement running from divide");
		}
		//////////////////////////////////////////////////////
		// Example 2: ArrayIndexOutOfBoundsException
		// DO NOT WRITE CODE THIS WAY always let ArrayIndexOutOfBoundsExceptions be thrown
		//   you should then debug your code to avoid this situation rather than use this "BANDAID"
		try {
		    badPrintLast(new int[] {1, 2, 3});
		} catch (Exception e) {
			System.out.println("In catch block from badPrintLast");
//			System.out.println("The type of exception thrown was:                " + e.getClass());
//			System.out.println("The message included in the exception was:       " + e.getMessage());
//			System.out.println("The exception also give us the stack trace: ");
//			e.printStackTrace();
//			System.out.println("The exception cause was: " + e.getCause());
		}
		
		////////////////////////////////////////////////////////////////////////////
		// CHALLENGE: Call badPrintLastChar and then write a try-catch to handle it
		//   In your catch statement print out useful information about what happened
		// TODO put a screenshot in the chat when you're done
		////////////////////////////////////////////////////////////////////////////
		try {
			badPrintLastChar("Hello");
//		} catch (StringIndexOutOfBoundsException | NullPointerException e) { // order doesn't matter NOTE can't be parent-child
		} catch (StringIndexOutOfBoundsException e) { // order doesn't matter NOTE can't be parent-child
			System.out.println("In catch block from badPrintLastChar");
			System.out.println(e.getClass());
		} catch (NullPointerException e) {
			System.out.println("In catch block from badPrintLastChar");
			System.out.println(e.getClass());
//		} 
//		catch (Exception e) {
//			System.out.println("In catch block from badPrintLastChar");
//			System.out.println(e.getClass());
		} finally { // This will run in all 3 cases: (1) no exceptions thrown (2) exeption gets caught (3) exception not caught
			System.out.println("In finally block, do stuff like releasing resources here");
		}
//		catch (NullPointerException e) { // ORDER MATTERS
//			System.out.println("In catch block from badPrintLastChar");
//		}
		
		////////////////////////////////////////////////////
		// Example 3: ClassCastException
		
		try {
		    badClassCastCode();
		} catch (ClassCastException cce) { // name your exception object whatever you want
			System.out.println("\n\nYou can only cast to a supertype not a subtype");
			System.out.println(cce.getMessage());
		}
		
		Exception e = new Exception(); // note: exceptions are just objects
		
		System.out.println("End of Main reached");
	}

	public static int divide(int x, int y) {
		return x / y;
	}
	
	public static void badPrintLast(int[] numbers) {
		System.out.println(numbers[numbers.length]);
	}
	
	public static void printLast(int[] numbers) {
		System.out.println(numbers[numbers.length - 1]);
	}
	
	public static void badPrintLastChar(String str) {
		int x = 0;
		int y = 1 / x; // throws ArithmeticException
//		String str2 = null;
//		str2.length();
		System.out.println(str.charAt(str.length()));
	}
	
	public static void badClassCastCode() {
		// bad code here
		Dog d = new Dog();
		Animal a = (Animal) d; // IS-A holds true here Dog > Animal > Object
		
		Animal a2 = new Animal();
		Dog d2 = (Dog) a2; // IS-A doesn't hold here Dog > Animal > Object can only cast-up the inheritance tree NOT down
		
	}

}

class Animal {
	
}

class Dog extends Animal {
	
}
