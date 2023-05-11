package com.skillstorm.training.day4;

import java.util.Comparator;

public class SumOfTheLettersComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < o1.length(); i++) {
			sum1 += o1.charAt(i);
		}
		for (int i = 0; i < o2.length(); i++) {
			sum2 += o2.charAt(i);
		}
		return sum1 - sum2;
	}

}
