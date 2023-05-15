package com.skillstorm.training.day1.assignment.athletes;
// Step 0
import java.util.Comparator;

// How to create a comparator for the Athlete class
// Step 1: implement Comparator<Type>
// Step 2: implement compare
public class WinsComparator implements Comparator<Athlete> {

	@Override
	public int compare(Athlete o1, Athlete o2) {
		return o1.getWins() - o2.getWins(); // + number if o1 > o2 like 90 wins vs 10 wins
	}                                       // 0 if the same number of wins aka o1 == o2
	                                        // - numver if o1 < o2 like 10 wins vs 100 wins
	

}
