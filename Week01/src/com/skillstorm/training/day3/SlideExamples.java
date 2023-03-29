package com.skillstorm.training.day3;
// NOTE: to run the code you can use ALT SHIFT X, J or CTRL F11
// mac is OPTION CMD X, J
public class SlideExamples {
	
	public static void main(String[] args) {
		// Knowledge check
		int x = Integer.MAX_VALUE + 1;
		System.out.println(x);
		
		// Implicit cast
		int y = 2000000;
		double z = y;
		System.out.println(z); // note over 10^6 it prints in scientific notation 2E8
		
		float myFloat = 0.1f; // need the f (can't do an implicit double to float cast)
		System.out.printf("%.15f%n", myFloat);
		double myDouble = myFloat;
		System.out.println(myDouble); 
		
		// Will this mess up our math?
		// 10% of a trillion dollars
		float testFloat = 0.1f * 1_000_000_000_000f; 
		System.out.printf("%15f\n",testFloat); // expected 100_000_000_000
		
		// Explicit cast examples
//		boolean bool = (boolean) 1; // booleans don't play nice with numerics
		
		double anotherDouble = 2.5;
		int myInt = (int) anotherDouble; 
//		int myInt = (double) (int) anotherDouble; // applied right to left
		
		short largish = 200;
		byte canItFit = (byte) largish; // wrap around
		System.out.println(canItFit);

		
	}

}
