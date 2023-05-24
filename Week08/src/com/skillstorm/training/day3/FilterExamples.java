package com.skillstorm.training.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Filter has to take a Predicate lambda
//    Predicate - Is a function that takes in one value and returns a boolean
public class FilterExamples {

	public static void main(String[] args) {
		// TODO put a sreenshot in the chat of the output of the following 
		Arrays.asList(1, 20, 30, 599 ,43, 20, 8, 0).stream().filter(x -> x > 10).forEach(System.out::println);
		
		// Filter strings use the method reference 
		List<House> houses = new ArrayList<>();
		houses.add(new House("Yellow", 2400));
		houses.add(new House("Red", 1400));
		houses.add(new House("White", 55000));
		houses.add(new House("Blue", 1900));
		houses.add(new House("Brown", 1900));
		System.out.println(houses);
		
		// How can I use a method reference to filter on if the house is large?
//		houses = houses.stream().filter(house -> house.squrFt > 2000).collect(Collectors.toList());
		houses = houses.stream().filter(House::isLarge).collect(Collectors.toList());
		System.out.println(houses);	
	}

}
class House {
	String color;
	int squrFt;
	public House(String color, int squrFt) { this.color = color; this.squrFt = squrFt; }
	public String toString() {
		return color + " house with " + squrFt + "squrFt";
	}
	
	public boolean isLarge() {
		return squrFt > 2000;
	}
}