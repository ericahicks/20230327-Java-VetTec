package com.skillstorm.training.day4;

public class LoopPractice {

	public static void main(String[] args) {
		// TODO
		// -------------------------------------------------------
		// Put a snapshot of running the following code in the chat
		dash();
		System.out.println(String.format("%35s", "Example 1"));
		dash();
		
//		--------------------------------------------------------------------
//       Example 1
//      --------------------------------------------------------------------
		// Print out the counter each time in your loop
		int count = 0;
		while (count < 5) {
			System.out.println(count++); // (++count); prints 1 2 3 4 5 instead of 0 1 2 3 4
		}
		
		dash();
		System.out.println(String.format("%35s", "Example 2"));
		dash();
		
//		--------------------------------------------------------------------
//      Example 2
//     --------------------------------------------------------------------
		// Test your arrayPrint with an array with:
		// - many elements
		// - one element
		// - 0 elements
		// - null
		printArray(new int[] {1, 2, 3});
		printArray(new int[] {9});
		printArray(new int[0]);
//		printArray(null); // ambiguous because null could be holding the place of a String[] or an int[]
		int[] nums = null;
		printArray(nums); 
		
		// Test your arrayPrintBackward with each of the above as well
		printArrayBackward(new int[] {1, 2, 3});
		printArrayBackward(new int[] {9});
		printArrayBackward(new int[0]);
		nums = null;
		printArrayBackward(nums); 
	} // main ends here
	
//	--------------------------------------------------------------------
//  Example 2
//  --------------------------------------------------------------------
	public static void printArray(int[] numbers) {
		System.out.println("Printing int array:");
		if (numbers == null) {
			System.out.println("Input array cannot be null.");
		} else {
			// setup
			int index = 0;
			// condition
			while (index < numbers.length) {
				System.out.println("numbers[" + index + "]=" + numbers[index]);
			    // update
				index++;
			}
		}
	}
	
	public static void printArray(String[] words) {
		System.out.println("Printing String array:");
		if (words == null) {
			System.out.println("Array cannot be null.");
		} else {
			int index = 0;
			while (index < words.length) {
				System.out.println("words[" + index + "]=" + words[index]);
				index++;
			}
		}
		
	}
	
	public static void printArrayBackward(int[] numbers) {
		System.out.println("Printing int array backwards:");
		if (numbers == null) {
			System.out.println("Array cannot be null.");
		} else {
			int index =  numbers.length - 1; // start at the last index
			while (index >= 0) { // stop AFTER the 0 index element prints
				System.out.println("numbers[" + index + "]=" + numbers[index]);
				index--; // decrement to walk backwards through the array
			}
		}
	}
	
	// TODO rewrite the dash() method to use a loop
	public static void dash() {
		System.out.println();
		// setup
		int count = 0;
		// loop condition
		while (count < 68) {
			System.out.print("-");
			// update
			count++;
		}
		System.out.println();
		System.out.println();
//		System.out.println(   shortcut to comment out this is CTRL + /
//				"\n------------------------------------------------------------------\n");
	}

}
