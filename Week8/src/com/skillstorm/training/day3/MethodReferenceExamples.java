package com.skillstorm.training.day3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// 4 ways to use a MethodReference
// 1. calling a static method
// 2. calling an instance method
// 3. calling an instance method on an arbitrary object
// 4. calling a constructor
public class MethodReferenceExamples {
	
	public static void main(String[] args) {
		// Example 1: Method Reference to a Static method
		// TODO put in the chat a screenshot of the following code running
		Arrays.asList(1, 2, 3, 4, 5).stream().forEach(System.out::println); // .forEach(x -> System.out.println(x))
		
		// Example 2: Method reference to a constructor
		// construct a list of pets from a stream of strings
		List<Pet> pets = Stream.of("Boots", "Luna", "Shadow", "Fluffy", "Tiger")
				                .map(Pet::new) // .map(s -> new Pet(s))
				                .collect(Collectors.toList());
		System.out.println(pets);
		
		// Example 3: Method reference to an instance method of an arbitrary object
		List<String> hobbies = Stream.of("rock climbing", "wood working", "PC building", "coding", "reading")
			  .map(String::toUpperCase)
			  .collect(Collectors.toList());
		System.out.println(hobbies);
	}

}
class Pet {
	String name;
	public Pet(String name) { this.name = name; }
	public String toString() { return "Pet [name=" + name + "]"; }
}
