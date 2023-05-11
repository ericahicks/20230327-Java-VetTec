package com.skillstorm.training.day4.custom;

import java.util.Arrays;
import java.util.Random;

public class SortingArraysPractice {
	
	public static void main(String[] args) {
		Random generator = new Random(); // or just use (int) (Math.random() * 10) + 1
		Cat cat = new Cat("Boots", generator.nextInt(10) + 1);
		Cat cat1 = new Cat("Adorable", generator.nextInt(10) + 1);
		Cat cat2 = new Cat("Shadow", generator.nextInt(10) + 1);
		Cat cat3 = new Cat("Luna", generator.nextInt(10) + 1);
		Cat cat4 = new Cat("Cleo", generator.nextInt(10) + 1);
		Cat cat5 = new Cat("Stevie", generator.nextInt(10) + 1);
		Cat cat6 = new Cat("Dog", generator.nextInt(10) + 1);
		System.out.println(cat);
		
		// Create an Array of Cats
		Cat[] cats = new Cat[7];
		cats[0] = cat;
		cats[1] = cat1;
		cats[2] = cat2;
		cats[3] = cat3;
		cats[4] = cat4;
		cats[5] = cat5;
		cats[6] = cat6;
		System.out.println(Arrays.asList(cats));
		// Sort the Array using Arrays sort method
		Arrays.sort(cats);
		System.out.println(Arrays.asList(cats));
	}

}

// Custom comparables
// Step 1: implements Comparable<Cat>
// Step 2: Override the method compareTo
class Cat implements Comparable<Cat> {
	String name;
	int cuteness;
	public Cat(String name, int cuteness) {
		this.name = name;
		this.cuteness = cuteness;
	}
	
	@Override
	public String toString() {
		return this.name + " (Cuteness: " + cuteness + ")";
	}

	// Returns negative if this is less cute
	// Returns 0 if same cuteness
	// Returns positive if this is cuter
	@Override
	public int compareTo(Cat that) {
		return this.cuteness - that.cuteness; // larger cuteness returns + 
//		return that.cuteness - this.cuteness;
	}
}