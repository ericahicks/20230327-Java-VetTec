package com.skillstorm.training.day3;

public class LabeledLoops {
	
	public static void main(String[] args) {
		// Example 1: Loop name unneeded but allowed here
//		int x = 0;
//		myloop: for (x = 0; x < 100; x++) {
//			if (x >= 10) {
//				break myloop;
//			}
//			// do stuff here
//		}
//		System.out.println(x); // will print 10
		
		
		
		
		
		
		
		
		// Example 2: This breaks the inner loop
//		int k = 0;
//		outer: for (int i = 0; i < 3; i++) {
//			System.out.println("i = " + i);
//			inner: for (int j = 0; j < 5; j++) {
//				if (j > i) {
//					break inner; // vs running it with outer
//				}
//				System.out.println(">>> j = " + j);
//				k++;
//			}
//		}
//		System.out.println(k); // Will k = 3 x 5 ? Or will k = something else? it will be 1 + 2 
		
		
		
		
		
		
		
		
		
		
		// Example 3: 
//		outer: for (int i = 0; i < 3; i++) {
//			System.out.println("i=" + i);
//			inner: for (int j = 0; j < 3; j++) {
//				if ((i + j) > 2) 
//				     break outer; // outer; // try changing to inner
//				System.out.println(">>>j= " + j + " so (i+j)=" + (i + j) + " and > 2 is " + ((i + j) > 2));
//			}
//		}
		
		// BE CAREFUL WHAT SCOPE THE BREAK IS IN
//		int k = 0;
//		for (int i = 0; i < 5; i++) {
//		System.out.println("i=" + i);
//		for (int j = 0; j < 3; j++) 
//			System.out.println(k++);
//		
//			if (i > 2) 
//			     break; // outer; // try changing to inner
//		
//	    }
		
		
		
		
		
		
		
		
		// Example 4:
		// add a counter in the above nested loop and try break outer; and break inner;
		int counter = 0;
		outer: for (int i = 0; i < 3; i++) {
			System.out.println("i=" + i);
			inner: for (int j = 0; j < 3; j++) {
				if ((i + j) > 2) break outer; // try changing to outer
				counter++;
				System.out.println(">>>j= " + j + " so (i+j)=" + (i + j) + " and > 2 is " + ((i + j) > 2));
			}
		}
		System.out.println(counter);
	}

}
