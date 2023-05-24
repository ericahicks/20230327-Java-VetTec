package com.skillstorm.training.day4.enthuware;

public class Problem28 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int counter = 0;
		for (int value : arr) {
			if (counter >= 5) {
				break;
			} else {
				continue;
			}
			// This cannot be here bc it is deadcode
			// if-else in both cases will skip this code
//			if (value > 4) { 
//				arr[counter] = value + 1;
//			}
//			counter++;
		}
		System.out.println(arr[counter]);
		
		// Problem 43:
		// Prefix vs Postfix
		int a = 0;
		int c = a++; // postfix means increment AFTER returning a value
		             // int c = 0; int a = 1;
		int b = ++a; // int b = 0 + 1; 
		System.out.println("a is " + a + " c is " + c);
		
		// prefix vs postfix syntatic sugar your compiler rewrites the code as
		int x = 0;
		int z = x;
		x = x +1;
		
		x = x + 1;
		int y = x;
	}
}
