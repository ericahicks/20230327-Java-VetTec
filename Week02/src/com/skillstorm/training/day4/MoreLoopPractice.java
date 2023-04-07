package com.skillstorm.training.day4;

public class MoreLoopPractice {
	
	public static void main(String[] args) {
//		--------------------------------------------------------------------
//      Example 3
//     --------------------------------------------------------------------
		// Print a count down from 3, 2, 1
		int count = 3;
		while (count > 0) {
			System.out.println(count--);
		}
		
		// Print out the letters in the String vertically (each on a separate line)
		String str = "Go Team!";
		count = 0;
		while (count < str.length()) {
			System.out.println(str.charAt(count++));
		}
		
		
		// Print out the letters backwards
		count = str.length() - 1;
		while (count >= 0) {
			System.out.println(str.charAt(count));
			count--;
		}
		System.out.println("=============================================");
		
		// Add up the numbers in an array
		count = 0;
		int sum = 0;
		int[] nums = new int[] { 10,20,30,40,5 };
		while (count < nums.length) {
			sum = sum + nums[count];
			count++;
		}
		System.out.println("sum=" + sum);
		
		// print out the first 8 letters of the alphabet
		char c = 'a';
		count = 0;
		while (count < 3) {
			System.out.println((char)(c + count));
			count = count + 1;
		}
		System.out.println("--------------------------------");
		

		// Print out the letters of the Alphabet from A-Z
		short startLetter = (short) 'a';
		short endLetter = (short) 'z';
		short letter = startLetter;
//		System.out.println((short) 'a');
//		System.out.println((char)(short)'a');
		while (letter < endLetter) {
			System.out.println((char) letter);
			letter++;
		}
		
		// Two loop examples
	}

}
