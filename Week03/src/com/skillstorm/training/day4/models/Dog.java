package com.skillstorm.training.day4.models;

public class Dog extends Animal {
	///////////////////////////////////////////////
	//////////////// Static Properties ////////////
	private static int population = 0;
	
	////////////////////////////////////////////////
	/////////////// Properties ////////////////////
	private String name;
	
	////////////////////////////////////////////////
	/////////////// Constructors ///////////////////
	public Dog() {
		super(10);
		this.name = "Dog";
		population++; // ONLY increment this in one place
	}
	
	public Dog(String name) {
		this();
		this.name = name;
	}
	
	////////////////////////////////////////////////
	/////////////// Getters/Setters ////////////////
	
	// Inherits the Animal class methods get/set cuteness
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static int getPopulation() {
		return Dog.population;
	}
	
	// DO NOT GIVE ACCESS TO MODIFY population
	
	////////////////////////////////////////////////
	/////////////// Overriding Methods /////////////

	// Overriding the Animal class method toString
	public String toString() {
		return "This is a dog named " + name + " with cuteness " + getCuteness();
	}


	////////////////////////////////////////////////
	////////////////// Methods /////////////////////

	// Inherits the ability to eat and sleep from the Animal class
	
	// A Dog can be taught more behaviors than a cat
	
	public void sit() {
		System.out.println("Sitting");
	}
	
	public void rollOver() {
		System.out.println("Rolling over");
	}
	
	public void fetch(String object) {
		System.out.println("Fetching the " + object);
	}
}
