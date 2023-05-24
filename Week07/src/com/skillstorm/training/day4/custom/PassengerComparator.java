package com.skillstorm.training.day4.custom;

import java.util.Comparator;

public class PassengerComparator implements Comparator<Passenger>{

	// Returns negative if o1.group < o2.group
	// Returns 0 if o1 and o2 in same group
	// Return positive if o1.group > o2.group
	@Override
	public int compare(Passenger o1, Passenger o2) {
		return o1.group - o2.group; // 1 - 6 
	}

}
