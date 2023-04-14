package com.skillstorm.training.day5.classes;
import com.skillstorm.training.day5.interfaces.Animal;

public class Main {
	
	public static void main(String[] args) {
//		Animal a = new Animal(); // CANNOT create instance of interface
		Wolf w = new Wolf(); // I'm using the default constructor
		w.eat();
		Animal snow = new Wolf();
		snow.eat();
		
		Elephant e = new Elephant(); // default constr
		e.eat();
		Animal a = new Elephant();
		a.eat();
//		Wolf what = new Elephant(); // siblings not compatible types

		Animal[] zoo = { snow, a }; // covariant types are allowed 
		////////////////////////////////////////////////////////////
		// Set up a for each loop to have all the animals at the zoo eat
		// CHALLENGE to put in the chat
		
	}

}
