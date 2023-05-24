package com.skillstorm.training.day1.assignment.athletes;

import java.util.Comparator;

// Step 1: implements Comparator
// Step 2: override compare(_, _)
public class WinRateComparator implements Comparator<Athlete>{
	
	@Override
	public int compare(Athlete o1, Athlete o2) {
		return (int) ((o1.winRate()- o2.winRate()) * 100);
	}

}
