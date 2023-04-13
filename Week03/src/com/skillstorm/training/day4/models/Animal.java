package com.skillstorm.training.day4.models;

public class Animal {
	////////////////////////////////////////////////
	/////////////// Properties /////////////////////
	private int cuteness; // 1 to 10

	
	////////////////////////////////////////////////
	/////////////// Constructors ///////////////////
	public Animal() {
		this.cuteness = 5; // initialize to be somewhat cute
	}

	public Animal(int cuteness) {
		this.cuteness = cuteness;
	}

	////////////////////////////////////////////////
	/////////////// Getters/Setters ////////////////
	public int getCuteness() {
		return cuteness;
	}

	public void setCuteness(int cuteness) {
		if (cuteness > 0 && cuteness <= 10)
			this.cuteness = cuteness;
	}
	
	////////////////////////////////////////////////
	/////////////// Overriding Methods /////////////
	@Override
	public String toString() {
		return "This is an animal with cuteness " + cuteness;
	}
	

	////////////////////////////////////////////////
	////////////////// Methods /////////////////////
	
	public void eat(String food) {
		System.out.println("Eating " + food);
	}
	
	public void sleep() {
		System.out.println("Sleeping");
	}
}
