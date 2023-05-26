package com.skillstorm.training.day5;

public class RecursionExamples {
	
	// Recursion - A function that calls itself
	public static void main(String[] args) {
		System.out.println("sam");
		System.out.println(reverse("sam"));
		System.out.println(reverse(""));
	}
	
	public static String reverse(String str) {
		// base case
		if (str.length() <= 1) {
			return str;
		}
		// call the reverse method again
		return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}
	
	static String[] bases = {"apples", "bananas", "carrots", "donuts", "eggs", "foodie", "grapes",
	          "honeydew mellon", "inedible", "jackfruit", "kiwi", "lemon", "mango",
	          "nectarine", "orange","papaya", "queen", "rasberries", "strawberries",
	          "tangerines", "upside-down", "very good", "yucky", "zucchini"};

	private String getBaseCaseValue(char c) {
		int index = (int) c - (int) 'A';
		return bases[index];
	}
}
