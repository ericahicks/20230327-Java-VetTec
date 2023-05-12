package com.skillstorm.training.day4.officehours;

import java.util.Arrays;

public class ArraysSortExample {
	
	public static void main(String[] args) {
		EarthQuake quake = new EarthQuake(3.6f, "Toyah", "Texas");
		EarthQuake quake1 = new EarthQuake(3.1f, "Cameron", "Arizona");
		EarthQuake quake2 = new EarthQuake(2.5f, "El Moro", "Colorado");
		System.out.println(quake);
		EarthQuake[] quakes = new EarthQuake[3];
		quakes[0] = quake2;
		quakes[1] = quake;
		quakes[2] = quake1;
		System.out.println(Arrays.asList(quakes));
		
		Arrays.sort(quakes);
		System.out.println(Arrays.asList(quakes));
		
		Arrays.sort(quakes, new EarthQuakeComparator().reversed());
		System.out.println(Arrays.asList(quakes));
		

		Arrays.sort(quakes, new StateComparator());
		System.out.println(Arrays.asList(quakes));
		
	}

}
