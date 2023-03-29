package com.skillstorm.training.day3;

public class ModulusExamples {
	
	public static void main(String[] args) {
		// % modulus - gives the remainder from integer division
		// if I do 3 / 2 = 1.5 aka 1 remainder 1 
		// so 3 mod 2 = 1 NOT 1.5
		
		// Example1: years and months
		int totalMonths = 18;
		// How may years and months is this?
		int years = 18 / 12;
		int months = 18 % 12;
		System.out.println(totalMonths + " months is " + years + " years and " + months + " months");
		
		
		// Example2: what time will it be in 71 hours?
		int now = 1400;
		int timeIn71Hours = (now + 7100) % 2400;
		System.out.println(timeIn71Hours);
		
		// What will this print out?
		int someNumber = 16; 
		System.out.println(someNumber % 2); // 0
		System.out.println(someNumber % 3); // 1 
		
		// modulus: 16 mod 2 what is 16 / 2? 8 what is 16 - (8 * 2) = 16 - 16 = 0
		//          x  mod y what is x / y? n  what is  x - (n * y)
		
		// Example3: find the row and column of box 9 in the below grid
		
		// -----------------------------
		// | 0 | 1 | 2 | 3 | 4 | 5 | 6 | <--- row: 0
		// -----------------------------
		// | 7 | 8 | 9 | 10| 11| 12| 13| <--- row: 1
		// -----------------------------
		// | 14| 15| 16| 17| 18| 19| 20| <--- row: 2
		// -----------------------------
		
		int boxNum = 9;
		int numRows = 3;
		int numCols = 7;
		
		int row = boxNum / numCols;
		int col = boxNum % 7;
		System.out.println("Box #" + boxNum + " is in row " + row + ", col " + col);
	}

}
