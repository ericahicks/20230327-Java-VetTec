package com.skillstorm.day2.enthuware;

public class OrderOfOperations {
// ENTHUWARE EXAMPLE
//	public static int m1(int i) { // int i = 0
//		return ++i; // returns i + 1 = 1
//	}
//
//	public static void main(String[] args) {
//		int k = m1(args.length); // m1(0) so k = 1
//		k += 3 + (++k);
//		// k = k + 3 + (k = k + 1)
//		// k = k + 3 + (k = 1 + 1)
//		// k = k + 3 + 2
//		// k = 2 + 3 + 2
//		System.out.println(k);
//	}

// EXAMPLE 2
	public static void main(String[] args) {
		// Question 54:
		int i = args.length; // 0
//		System.out.println(args.length);
//
//		// Why does += happen before ++ ??? Think of it like syntatic sugar your compiler expands it and does the substitution first)
	
		int k = ++i; // set to 1 which updates to 2
		k += 2 + (++k); // expands and substitute before doing the addtion
//		// k = k + 2 + (k = k + 1) // STEP 1 : expand the shorthand 
//		// k = 1 + 2 + (k = 1 + 1) // STEP 2 : SUBSTITUTE
//		// k = 1 + 2 + (k = 2)     // STEP 3 : order of operations
//		// k = 1 + 2 + 2
//		// k = 1 + 2 + 2
	    // k = 5
//
		System.out.println(k);
//
//		// k = k + 2 + (k = k + 1) becomes
//		// k = k + 2 + (k = 1 + 1) becomes
//		// k = k + 2 + 2
//		// k = 2 + 2 + 2
//		// k = 5
	}

}
