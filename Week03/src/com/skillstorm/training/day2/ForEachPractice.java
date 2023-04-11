package com.skillstorm.training.day2;

public class ForEachPractice {
	
	public static void main(String[] args) {
		//////////////////////////////////////
		// Print out the contents of an array
		int[] numbers = {1, 2, 3, 4, 5};
		for (int n: numbers) {
			System.out.println(n);
		}
		
		//////////////////////////////////////
		// Find the sum of an array
		int sum = 0;
		for (int n: numbers) {
			sum += n;
		}
		System.out.println(sum);
		
		///////////////////////////////////////
		// Find the max value of an array (assume all positives)
		int max = 0;
		for (int n: numbers) {
			max = Math.max(n, max);
		}
		System.out.println(max);
		
		/////////////////////////////////////////
		// Can I have a compatible numeric type for the local variable? 
		// Yes, because of implicit wide casting
		for (long n: numbers) {
			System.out.println(n);
		}
//		for (byte n: numbers) { // We cannot explicit cast, so you must use a type of equal or larger size for the local variable
//			System.out.println(n);
//		}
	}

}
