package com.skillstorm.training.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//4 ways to use a MethodReference
//1. calling a static method
//2. calling an instance method on a particular object --- this is the goal to do in example 4
//3. calling an instance method on an arbitrary object 
//4. calling a constructor
public class WhyUseInstanceMethodReference {

	public static void main(String[] args) {
		// Example 4:
		List<Cat> cats = Arrays.asList(
										new Cat("Boots"), 
										new Cat("Pumpkin"), 
										new GrumpyCat("Thunder"), 
										new GrumpyCat("Fluffy"), 
										new Cat("Stevie"), 
										new GrumpyCat("Garfield")
									);
		for (Cat cat : cats) {
			petCat(cat::greet); // lambda notation equivalent here is petCat(cat -> cat.greet());
		}
	}
	
	public static void petCat(Greeter g) { // takes a functional interface as the "target type"
		System.out.println("You see a cat and go up to it. The cat responds with:");
		g.greet();
	}

}

interface Greeter {
	void greet();
}

class Cat implements Greeter {
	String name;
	public Cat(String name) { this.name = name; }
	@Override
	public void greet() {
		System.out.println("Hello, I am " + name + " and I love chin scritches.");
	}
}

class GrumpyCat extends Cat {
	public GrumpyCat(String name) {
		super(name);
	}

	@Override
	public void greet() {
		System.out.println("Hello, I am " + name + " and I want to be left alone.");
	}
}