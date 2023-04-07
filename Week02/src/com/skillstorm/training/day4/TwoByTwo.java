package com.skillstorm.training.day4;

public class TwoByTwo {
	
	public static void main(String[] args) {
		// Count by two
		int count = 0;
		while (count < 10 ) {
			count += 2;
			System.out.println(count);
		}
		
		
		String sentence = "Will this work or not?";
		String[] words = sentence.split(" ");
		count = 0;
//		while (count < words.length - 1) {
//			System.out.println(words[count] + " " + words[count + 1]);
//			count += 2;
//		}
		
		
		while (count < words.length) {
			// if there is only one character left, just print one word on the line
			if (count == words.length - 1) { 
				System.out.println(words[count]); 
			// if there are two characters or more left, print two words on the line separated by a space
			} else {
				System.out.println(words[count] + " " + words[count + 1]);
			}
			count += 2;
		}
	}

}
