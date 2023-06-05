package com.skillstorm.training;
// valid import
import java.lang.System;
// invalid import
//import java.lang.System.out;
// valid import
import static java.lang.System.out;
// invalid import
//import java.util;
// valid import
import java.util.*;
// invalid import
//import static java.lang.Math;
// valid import 
import static java.lang.Math.PI;
import static java.lang.Math.*;
public class Review {
	int j;
	void doStuff() {
		// Rule(s) for variables of the same name: 
		/*
		 * Okay as long as not in the same local scope
		 */
		this.j = 2;
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
//		int j;
//		{
//			int j;
//		}
	}
	
	// types of scopes
	/*
	 * - class scope
	 * - method scope
	 * - instance scope
	 * - local scope
	 * - block scope
	 * - for-loop scope
	 */
}
