package com.skillstorm.training.day3;

public class CastingWithChar {
	
	public static void main(String[] args) {
		char a = 'A';
		System.out.println((int) a); // 65 is the ASCII value of 'A'
		char mystery = '1' + '1'; // System.out.println("1" + "1"); // 11
		System.out.println("mystery=" + mystery + "something ");
		System.out.println((short) mystery);
		System.out.println((short) '1');
		
		// I can send a secret message by shifting every letter
		char h =  'h' + 9;
		char i = 'i' + 9;
//		System.out.printf("%c%c%c%c%d%f" + "!", h, i, 'h', 'j', 10.1, 1.5);
//		System.out.printf("%c%c%c%c%d%f!", h, i, 'h', 'j', 10.1, 1.5);
//		System.out.printf("h%c%c%c%d%f!", i, 'h', 'j', 10.1, 1.5);
//		System.out.printf("hi%c%c%d%f!", 'h', 'j', 10.1, 1.5); // 
		
		// How does printf work?
		// we can hand it a comma separated list of values
		// The first value is a String with a special notation
		//    everywhere it sees a % that next character is treated as 
		
		/* Challenge
		Print out the following values:
		*/
		short test10 = (short) Character.MAX_VALUE;
		int test10b = Character.MAX_VALUE;
		short test11 = Character.MIN_VALUE;
		short test12 = Short.MAX_VALUE;
		short test13 = Short.MIN_VALUE;
		
		// What does this tell us about the difference between char vs short?
		System.out.println("---------------------------");
		System.out.println(test10);
		System.out.println(test10b);
		System.out.println(test11);
		System.out.println(test12);
		System.out.println(test13);
	}

}
