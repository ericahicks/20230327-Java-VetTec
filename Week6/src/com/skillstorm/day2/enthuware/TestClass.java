package com.skillstorm.day2.enthuware;
// Problem 7
public class TestClass {
	int x = 5;

	int getX() {
		return x; // returns the instance variable this.x
	}

	public static void main(String args[]) throws Exception {
		TestClass tc = new TestClass();
		tc.looper();
		System.out.println(tc.x);
	}

	public void looper() {
		int x = 0; // "shadows" the instance variable
		while ((x = getX()) != 0) { // sets the value of the local x (not the instance x)
			for (int m = 10; m >= 0; m--) {
				x = m; // sets the value of the local x (not the instance x)
			}
		}

	}

}
