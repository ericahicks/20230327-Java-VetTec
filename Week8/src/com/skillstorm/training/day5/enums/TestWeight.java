package com.skillstorm.training.day5.enums;

public class TestWeight {

	public static void main(String[] args) {
		Person p = new Person("Sam", 150);
		System.out.println(p);
		// Get all the planets and loop through them
		for (Planet planet : Planet.values()) {
			System.out.println("On " + planet + " Sam weighs " + p.getWeight(planet) + "lbs");
		}
		// Useful enum methods to remember:
		/*
		 * .values() -- gives me a 
		 * .ordinal() -- the number position the enum value was defined 
		 * 
		 * .valueOf(String) -- turns a Sting into the cooresponding enum
		 */
	}

}
