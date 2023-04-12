package com.skillstorm.training.day3;

public class Person {
	
	static double lifeSpan = 80.2;
	
	String name;
	short height;
	String favoriteFood;
	String favoriteSport;
	
	// Java gives me a default constructor when I don't write one
	// IF I DEFINE A CONSTRUCTOR, java won't give me the default no-arg
	public Person() { }
	
	// Define a constructor that assigns all the properties
	public Person(String name, short height, 
			      String favoriteFood, String favoriteSport) {
		this.name = name; // shortcut CTRL-ALT DOWN ARROW to copy line
		this.height = height;
		this.favoriteFood = favoriteFood;
		this.favoriteSport = favoriteSport;
	}
	
	// Java gives me a default toString method if I don't write one
	// but it gives the class name and memory address only
	@Override
	public String toString() {
		// If there are no local variables creating name-conflicts
		// we don't need to specify this. and Person.
		return "name=" + this.name + ", " 
				+ "height=" + this.height + ", " 
				+ "favoriteFood=" + this.favoriteFood + ", " 
				+ "favoriteSport=" + this.favoriteSport + ", "
				+ "lifeSpan=" + Person.lifeSpan;
	}
}
