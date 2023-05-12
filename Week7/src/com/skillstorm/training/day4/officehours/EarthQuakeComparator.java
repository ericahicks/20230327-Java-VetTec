package com.skillstorm.training.day4.officehours;

import java.util.Comparator;

public class EarthQuakeComparator implements Comparator<EarthQuake> {

	// returns negative if o1 < o2
	// returns 0 if o1 == 02
	// returns positive if o1 > o2
	@Override
	public int compare(EarthQuake o1, EarthQuake o2) {
		return Math.round((o1.magnitude - o2.magnitude) * 10);
	}

}
