package com.skillstorm.training.day2.review.constructors;

public class ConstructorsExamples {
	// Points to take away
	// 1. all constructors have a hidden call to super
	// 2. the parent class of any class we don't specify the parent of
	//      is Object
	// 3. Before a constructor runs for the first time,
	//      the classLoader fetches all the info about the class
	//      and runs the static blocks
	// 4. static properties are set up first before the construtor runs the first time
	//      and only once
	
	public static void main(String[] args) {
//		Bird a = new Ostrich(); 
		Penguin p = new Penguin();
		Penguin p2 = new Penguin();
	}

}

