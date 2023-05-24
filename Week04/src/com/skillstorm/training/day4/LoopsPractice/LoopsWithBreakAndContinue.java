package com.skillstorm.training.day4.LoopsPractice;

import java.util.ArrayList;
import java.util.Arrays;

import com.skillstorm.training.day4.utils.dontworryaboutthis.*;

public class LoopsWithBreakAndContinue {

	public static void main(String[] args) {
		/////////////////////////////////////////////
		// What will the below code print?
//		mystery1();
		System.out.println();
		mystery2("cvs");
	}

	public static void mystery1() {
		// Example 1:
		ArrayList<String> foods = new ArrayList<>(Arrays.asList("apples",
				"bananas", "bread", "cereal", "milk", "fish", "mangos",
				"passion fruit", "anchovies", "almonds", "olives"));
		ArrayList<String> foodsIHate = new ArrayList<>(
				Arrays.asList("anchovies", "olives", "oysters", "fish"));

		for (String food : foods) {
			if (foodsIHate.contains(food))
				continue;
			System.out.println(food);
		}
	}

	
	
	// Example 2:
	public static void mystery2(String companyName) {
		ArrayList<String> fortune500List = getCompanies(); // Assume this returns complete list
		
		int i;
		for (i = 0; i < 500; i++) {
			if ( fortune500List.get(i).toLowerCase().contains( companyName.toLowerCase() ) ) {
				break;
			}
		}
		System.out.println( i < 10 ? "Yes" : "No");
		System.out.println(i);
	}

	
	
	
	
	
	public static ArrayList<String> getCompanies() {
		return ReadList.getCompanies();
	}

}
