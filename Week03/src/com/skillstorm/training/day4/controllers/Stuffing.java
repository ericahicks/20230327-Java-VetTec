package com.skillstorm.training.day4.controllers;

import com.skillstorm.training.day4.models.Stuff;

// Situation 3 inside a different package but it is a subclass
public class Stuffing extends Stuff {
	// in stuff we can use it
	public void printX() {
		// DANGER! someone in a different package is extending my class and can
		// suddenly see "protected" data
		System.out.println(x);
	}

}
