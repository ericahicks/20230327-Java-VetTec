package com.skillstorm.training.day4.controllers;

import com.skillstorm.training.day4.models.Animal;
import com.skillstorm.training.day4.models.Cat;
import com.skillstorm.training.day4.models.Dog;

public class AnimalsController {

	public static void main(String[] args) {
		// Creating an Animal, a Dog, and a Cat
		Animal a = new Animal();
		System.out.println(a);

		Dog d = new Dog();
		System.out.println(d);

		Cat c = new Cat();
		System.out.println(c);

		// Calling the inherited methods in Dog
		System.out.println();
		System.out.println(d.getName() + " is ");
		d.sleep();
		d.eat("bacon");
		
		// Calling the Dog specific methods
		d.sit();
		d.rollOver();
		d.fetch("tennis ball");
		d.fetch("frisbee");

		// Calling the inherited methods in Cat and the Cat specific methods
		System.out.println();
		System.out.println("c is a ");
		System.out.println(c.getClass());
//		System.out.println(c.getClass().toString().split("\\.")[5]);

		System.out.println();
		System.out.println("c is ");
		c.climb();
		c.climb("tree");
		c.sleep();
		c.climb("sofa");
		c.eat("chicken");
		
		// Making another dog and printing out the Dog population
		System.out.println();
		Dog spot = new Dog("Spot");
		System.out.println(spot);
		System.out.println("Dog population is " + Dog.getPopulation());
		
	}

}
