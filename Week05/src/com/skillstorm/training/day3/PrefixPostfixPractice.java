package com.skillstorm.training.day3;

public class PrefixPostfixPractice {
	
	public static void main(String[] args) {
//		int x = 1; 
//		int y = x++; // int y = x; x = x + 1;
//		System.out.println(String.format("x=%d, y=%d", x, y)); // prints x=2, y=1
		

//		int x = 1; 
//		int y = ++x; // int y = (x = x + 1;)
//		System.out.println(String.format("x=%d, y=%d", x, y)); // prints x=2, y=2

//		int x = 1 ; // x is now 2
//		int y = 1 ;
////		System.out.println(++x > y); // true
//		if (++x > y || ++x > y) // short circuits if the left operand is true
//		    y++; // this runs so y is now 2
//		System.out.println(String.format("x=%d, y=%d", x, y));
		
//		int x = 1 ; // x is now 2
//		int y = 1 ;
////	System.out.println(++x > y); // true 
////	System.out.println(++x > y); // true so x is now 3
////		 what does ++x > y do?
//		if (++x > y | ++x > y)
//		    y++;
//		System.out.println(String.format("x=%d, y=%d", x, y));

		int x = -1; // 0
		int y = 0; // -1
		System.out.println("x=" + x + ", y=" + y);
		// x++ == y evaluates to true
		// --y == -1 evaluates to true
		if (x++ == y & --y == -1) // short circuits if the left operator is false
		    y++; // y becomes 0
		System.out.println(String.format("updated to x=%d, y=%d", x, y));

	}

}
