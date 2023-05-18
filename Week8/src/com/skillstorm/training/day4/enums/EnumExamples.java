package com.skillstorm.training.day4.enums;

// Enum = enumeration
// used for a set of predifined constants
// useful for restricting the values a variable can hold
public class EnumExamples {
	
	enum Meal {
		BREAKFAST,
		SECOND_BREAKFAST,
		ELVENSIES,
		LUNCH,
		DINNER,
		MIDNIGHT_CHOW
	}
	
	public static void main(String[] args) {
		System.out.println(Meal.BREAKFAST);
		for (Meal m : Meal.values()) {
			System.out.println(m.ordinal() + " " + m);
		}
//		
//		System.out.println(Meal.BREAKFAST == 1);
//		System.out.println(Meal.BREAKFAST == "BREAKFAST");
		
		System.out.println(Meal.BREAKFAST == Meal.valueOf("bREAKFASt".toUpperCase()));
		System.out.println(Meal.BREAKFAST.ordinal() == 1);
		
	}

}
