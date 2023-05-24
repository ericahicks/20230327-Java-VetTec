package com.skillstorm.training.day4.officehours;

import java.util.PriorityQueue;

public class PriorityQueueExamples {
	
	public static void main(String[] args) {
		// As a news reporter, let's compile a list of earth quakes
		// Then we'll report on the earthquakes in order of magnitude
		PriorityQueue<EarthQuake> quakes = new PriorityQueue<>(new EarthQuakeComparator().reversed());
		EarthQuake quake = new EarthQuake(3.6f, "Toyah", "Texas");
		EarthQuake quake1 = new EarthQuake(3.1f, "Cameron", "Arizona");
		EarthQuake quake2 = new EarthQuake(2.5f, "El Moro", "Colorado");
		EarthQuake quake3 = new EarthQuake(2.7f, "Lincolnville", "Kansas");
		EarthQuake quake4 = new EarthQuake(2.9f, "Ferndale", "California");
		EarthQuake quake5 = new EarthQuake(2.6f, "Hoodsport", "Washington");
		EarthQuake quake6 = new EarthQuake(2.6f,"Chickaloon", "Alaska");
		quakes.offer(quake6); // 2.6
		quakes.offer(quake3); // 2.7
		quakes.offer(quake); // 3.6
		quakes.offer(quake5); // 2.6
		quakes.offer(quake4); // 2.9
		quakes.offer(quake1); // 3.1
		quakes.offer(quake2); // 2.5
		
		while (!quakes.isEmpty()) {
			System.out.println("News Alert! " + quakes.poll());
		}
		
	}

}
