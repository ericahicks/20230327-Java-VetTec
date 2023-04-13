package com.skillstorm.training.day4.models;

public class Cat extends Animal {
	////////////////////////////////////////////////
	/////////////// Properties ////////////////////
	
	// Inherits the Animal class property 
	// int cuteness

	////////////////////////////////////////////////
	/////////////// Constructors ///////////////////
	
	// Java gives us a default no-arg constructor that 
	// calls the super() constructor
	

	////////////////////////////////////////////////
	/////////////// Getters/Setters ////////////////
	
	// Inherits the Animal class methods get/set cuteness
	

	////////////////////////////////////////////////
	/////////////// Overriding Methods /////////////
	
	// Overriding the Animal class method toString
	@Override
	public String toString() {
		return "This is a cat with cuteness " + getCuteness();
	}
	

	////////////////////////////////////////////////
	////////////////// Methods /////////////////////
	
	// Inherits the ability to eat and sleep from the Animal class
	
	// Cats have the ability to climb
	public void climb() {
		System.out.println("Climbing");
	}
	
	// Method overloading = method with the same name different parameters as another method in the same class
	public void climb(String object) {
		System.out.println("Climbing up the " + object);
	}
}
