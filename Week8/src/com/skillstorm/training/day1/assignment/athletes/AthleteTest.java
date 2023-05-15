package com.skillstorm.training.day1.assignment.athletes;

import java.util.Arrays;
import java.util.Comparator;

public class AthleteTest {
	
	public static void main(String[] args) {
		// Create an athlete
		Athlete a = new Athlete("Al", 90, 10);
		System.out.println(a);
		
		Athlete b = new Athlete("Bob", 50, 50);
		System.out.println(b);
		
		Athlete c = new Athlete("Chase", 90, 10);
		System.out.println(c);
		
		System.out.print("Al should be greater than Bob: ");
		System.out.println(a.compareTo(b) > 0);
		
//		System.out.println(a.compareTo(null));
		
		System.out.print("Bob should be less than Al: ");
		System.out.println(b.compareTo(a) < 0);
		
		System.out.print("Chase should be equal to Al: ");
		System.out.println(c.compareTo(a) == 0);
		
		Athlete d = new Athlete("Doug", 9, 1); // winrate is 9/10 90%
		System.out.println(d);
		
		System.out.println("Is Doug equal to Al? ");
		System.out.println(d.compareTo(a) == 0);
		
		//////////////////////////////////////////////////
		// Comparator tests
		System.out.println("==================================");
		Comparator<Athlete> comp = new WinRateComparator();
		System.out.print("Al should be greater than Bob: ");
		System.out.println(comp.compare(a, b) > 0);
		
		
		Athlete[] athletes = new Athlete[] {a, b, d};
		System.out.println(Arrays.asList(athletes));

		Arrays.sort(athletes, new WinRateComparator().reversed());
		System.out.println(Arrays.asList(athletes));
		

		Arrays.sort(athletes, new WinsComparator().reversed());
		System.out.println(Arrays.asList(athletes));
		
	}

}
