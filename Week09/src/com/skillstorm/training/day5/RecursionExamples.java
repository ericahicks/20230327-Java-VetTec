package com.skillstorm.training.day5;

public class RecursionExamples {
	
	// Recursion - A function that calls itself
	public static void main(String[] args) {
		System.out.println("sam");
		System.out.println(reverse("sam"));
		System.out.println(reverse(""));
		
		System.out.println(spelling("Harry"));
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
	          "tangerines", "upside-down", "very good", "what", "x-ray", "yucky", "zucchini"};

	private static String getBaseCaseValue(char c) {
		int index = (int) c - (int) 'A';
		return bases[index];
	}
	/**
	 * 
	 * @param name A non-null non-empty string with no-spaces
	 * @return A multiline STring with an explanation of the spelling of the name
	 */
	public static String spelling(String name) {
		if (name.length() == 1) {
			return name.toUpperCase().charAt(0) + " as in " + getBaseCaseValue(name.toUpperCase().charAt(0));
		} else {
			return name.toUpperCase().charAt(0) + " as in " + name + "\n" + spelling(name.substring(1));
		}
	}
}
