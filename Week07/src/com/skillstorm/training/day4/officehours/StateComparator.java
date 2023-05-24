package com.skillstorm.training.day4.officehours;

import java.util.Comparator;

public class StateComparator implements Comparator<EarthQuake> {

	@Override
	public int compare(EarthQuake o1, EarthQuake o2) {
		return o1.state.compareTo(o2.state);
	}
	

}
