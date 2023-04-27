package com.skillstorm.training.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PresentationOrder {
	
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>(Arrays.asList("Tony", "Blake", "Daun", "Jaycie", "Josh", "Senia", "Tenzin"));
		Collections.shuffle(names);
		int i = 1;
		for (String name : names) {
			System.out.println(i++ + ". " + name);
		}
	}

}
