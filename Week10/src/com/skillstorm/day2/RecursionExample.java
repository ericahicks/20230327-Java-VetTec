package com.skillstorm.day2;

public class RecursionExample {

	public static void main(String[] args) {
		recursive(3);
//		print();
	}
	
	public static void recursive(int x) {
		System.out.println("start x = " + x);
		if (x <= 0) {
			System.out.println("base case reached");
			System.out.println("end x = " + x);
			return;
		}
		recursive(x - 1);
		System.out.println("end x = " + x);
	}
	
	public static void print() {
		System.out.println("printing");
		doStuff();
		System.out.println("printing");
	}

	public static void doStuff() {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}
}
