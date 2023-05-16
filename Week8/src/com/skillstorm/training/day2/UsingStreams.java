package com.skillstorm.training.day2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingStreams {
	
	public static void main(String[] args) {
		// Example 1: Creating a stream
		// TODO put a screenshot in the chat of the following code result
//		Stream.of(1, 10, 100).peek(x -> System.out.println(x)).map(x ->  x * 2).forEach(x -> System.out.println(x));
		
		// Example 2: Creating a stream from an ArrayList
		Stream.of(1, 10, 100).peek(x -> System.out.println(x)).map(x ->  x * 2).forEach(System.out::println);;
      //                                                          -------------          ------------------
		//                                                         lambda                  method reference
		//                                                      here's the code to run       here's where to find the code to run
		
		// Example 3: Filter
		List<String> desserts = Arrays.asList("chocolate chip cookies", "double chocolate brownies", 
				                              "cheesecake", "mint chocolate chip ice cream", "strawberry ice cream",
				                              "apple pie", "blueberry muffins");
		desserts = desserts.stream().filter(dessert -> dessert.contains("chocolate")).collect(Collectors.toList());
		System.out.println(desserts);
		
		String s = "hello";
		s = s.toUpperCase().replace("H", "m");
		System.out.println(s);
		
		// reduce
		List<Integer> nums = Arrays.asList(1, 2, 3, 4);
		Integer sum = nums.stream()
				.peek(System.out::println)
				.reduce(0, (x, y) -> {
					System.out.println("x="+ x + ", y=" + y);
					return x + y;
				});
		System.out.println(sum);
		
		// map
		List<House> houses = Arrays.asList(new House("Yellow", 1900), new House("Red", 2400), new House("White", 1300));
		// find the largest square footage
		int lgst = houses.stream()
				.peek(System.out::println)
				.map(house -> house.squrFt)
				.peek(System.out::println)
				.reduce(0, (x,y)->{System.out.println("comparing " + x + " and " + y); return Math.max(x, y);});
		System.out.println(lgst);
		
		// map to find the cutest pet
		List<Pet> pets = Arrays.asList(new Pet("Boots the cat", 10), new Pet("Taco the Corn Snake", 5));
		System.out.println(pets.stream().map(pet -> pet.cuteness).reduce(0, (x,y) -> Math.max(x, y)));
		/*
		System.out.println(people.stream().reduce(new Person("", Arrays.asList()), // initially compare to "empty" person not just int of 0
		(p1,p2) -> {                                                               // comparing two people, return the one with more pets
		   if (p1.pet.sizes() > p2.pets.sizes())
		       return p1;
		   else
		       return p2;
		});
		*/
	}

}

class House {
	String color;
	int squrFt;
	public House(String color, int squrFt) { this.color = color; this.squrFt = squrFt; }
	public String toString() {
		return color + " house with " + squrFt + "squrFt";
	}
}

class Pet {
	String name;
	int cuteness;
	public Pet(String name, int cuteness) {
		super();
		this.name = name;
		this.cuteness = cuteness;
	}
	@Override
	public String toString() {
		return "Pet [name=" + name + ", cuteness=" + cuteness + "]";
	}
}

// TODO write a constructor and toString
//       in the main method, create a list of people
//       uses steams to print out the largest number of pets
// Ex: If someone has 10 pets and someoneElse has 2 pets, I should print out: 10 pets
class Person {
	String name;
	List<Pet> pets;
}