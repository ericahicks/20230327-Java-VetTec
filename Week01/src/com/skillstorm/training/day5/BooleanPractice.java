package com.skillstorm.training.day5;

public class BooleanPractice {

	public static void main(String[] args) {
		// TODO put a screenshot of the below in the chat
//		System.out.print(true || false); // deadcode warning -- java says it will never read this part of the code
		System.out.println("-----------Comparison Examples--------------");
		boolean answer;
		answer = 5 > 10; // false
		answer = 5 >= 5; // true
		answer = 5 < 100; // true
		answer = 5 <= 0; // false
		answer = 5 == 5.0; // true -- this converts both to the same data type
							// before comparing
		answer = (3.0 / 4.0) == 0.75;
		System.out.println(answer);
		answer = (3.0 / 4.0) == 0.75f; // true -- java will automatically do a
										// wide cast (float -> double)
		answer = 5 != 0; // true

		// ! : not
		// && : and
		// || : or
		System.out.println("-----------Logical Operators Examples-----------");
		int x = 1;
		int y = 2;
		System.out.println(0 <= x && x < 10); // true
		
		System.out.println(y == 0 || y == 1); // false
		
		System.out.println(!(y == 0)); // two steps, compare if equal, then use not to check if false
		System.out.println(y != 0); // one step just compare if not equal
		
		int num = (int) (Math.random() * 10) + 1; // number between 1 and 10
		System.out.println("Generated number is " + num);
		System.out.println("Less than or equal to 5 " + (num <= 5));
		System.out.println("Greater than 5 " + (num > 5));
	}

}
