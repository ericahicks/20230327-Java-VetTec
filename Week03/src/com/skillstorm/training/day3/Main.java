package com.skillstorm.training.day3;

public class Main {
	
	public static void main(String[] args) {
		Person mark = new Person();
		mark.name = "Mark";
		mark.height = (short) 66;
		mark.favoriteFood = "doughnuts";
		mark.favoriteSport = "soccer";
		
		Person[] people = { mark, 
				            new Person(), 
				            new Person("Dan", (short)72, "pickles", "running")};
		// For each to print out the array
		for (int i = 0; i < people.length; i++ ) {
			System.out.println(people[i]);
		}
		System.out.println("----------------------------------");
		// Enhanced for loop for looping over a collection
		for (Person p : people) {
			System.out.println(p);
		}
		System.out.println("----------------------------------");
		// Enhanced for loop to find the tallest person (just like findMax)
		Person tallestPerson = new Person();
		for (Person p : people) {
			if (p.height > tallestPerson.height) {
				tallestPerson = p;
			}
		}
		System.out.println("Tallest person is:");
		System.out.println(tallestPerson.name + " who is " + tallestPerson.height + "in tall");
		
		
		
		// PUT A SCREENSHOT IN THE CHAT
		// OF THE BELOW CODE AND OUTPUT
		System.out.println(mark.name);
		System.out.println(mark.height);
		System.out.println(mark.favoriteFood);
		System.out.println(mark.favoriteSport);
		
		System.out.println(mark.toString());
		System.out.println(mark); // calls toString
	}

}
