package com.skillstorm.training.day3;

public class MorePeopleExamples {

	public static void main(String[] args) {
		Person tony = new Person("Tony", (short) 73, "jumbalaya", "football");
		Person blake = new Person("Blake", (short) 71, "sushi", "football");
		System.out.println(tony); // print will call the toString method I defined
		System.out.println(blake);
		Person.lifeSpan = 79; // STATIC PROPERTIES MUST BE ACCESSED IN A STATIC WAY aka use the class name it belongs to
		blake.favoriteSport = "golf";
		System.out.println(tony);
		System.out.println(blake);
		
		// calling a non-static method, we need an object
		boolean result = tony.isTallerThan(blake);
		System.out.println("Tony is taller than Blake is " + result);
		
		Person[] people = {tony, blake};
		// calling a static method, we can
		Person tallest = Person.findTallest(people);
		System.out.println("Tallest is " + tallest.name + " who is " + tallest.height + "in tall");
	}

}
