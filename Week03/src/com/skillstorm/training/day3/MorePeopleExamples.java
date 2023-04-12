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
	}

}
