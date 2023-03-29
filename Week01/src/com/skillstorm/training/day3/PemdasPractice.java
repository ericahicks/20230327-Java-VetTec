package com.skillstorm.training.day3;
// CRTL-SHIFT-F will clean up the formatting and fix all your indentation

public class PemdasPractice {

	public static void main(String[] args) {
		// PEMDAS
		// p - parenthesis
		// E - exponents
		// MD - multiplication and division
		// AS - addition and subtraction

		double test1 = 2 * Math.pow(2, 3); // 2 * (2 ^ 3) NOT (2 * 2) ^ 3
		// how can rewrite test1 to do the other order of operations
		System.out.println("test1: " + test1);
		System.out.println("redo test1 other order:" + Math.pow(2 * 2, 3));

		double test2 = Math.pow(2 * 4, 3); // (2 * 4) ^ 3 NOT 2 * (4 ^ 3)
		System.out.println("test2:" + test2);

		int test3 = 12 / 2 * 3; // does this print 2 or 18? 18 because it does
								// (12 / 2) * 3
		int test4 = 3 + 12 / 3; // does this print 5 or 7? 7 because it does 3 +
								// (12 / 3)
		System.out.println("test3: " + test3);
		System.out.println("test4:" + test4);

		int test5 = 12 - 10 + 1; // does this print 1 or 3? does (12 - 10) + 1 =
									// 3
		System.out.println("test5: " + test5);

		float test6 = 120f / 4f / 100f; // 0.3 not 3000.0 because (120 / 4 ) / 100 = 30 / 100 = 0.3
		float test7 = 120f / (4f / 100f);
		
		System.out.println("test6: " + test6);
		System.out.println("test7:" + test7);
		
		String test8 = "1" + 2 + 3; // 15 or 123? String concatenation or integer addition first?
//		test8 = "12" + 3;
//		test8 = "123";
		String test9 = "1" + 2 * 3; // 16 
		
		System.out.println("test8: " + test8);
		System.out.println("test9: " + test9);
	}

}
