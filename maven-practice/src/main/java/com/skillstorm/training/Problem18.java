package com.skillstorm.training;

public class Problem18 {
	/**
	 * Adds 9 to the wrapper value
	 * 
	 * @param w
	 * @return
	 */
	static Wrapper changeWrapper(Wrapper w) { // w.w = 20
		w = new Wrapper(); // w.w = 10
		w.w += 9; // w.w = 19
		return w; // w.w = 19
	}
}

class Wrapper {
	int w = 10;
}