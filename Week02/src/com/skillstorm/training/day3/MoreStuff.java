package com.skillstorm.training.day3;

public class MoreStuff {
	// This is a _________ variable
	static int xx = 11;
	// This is a _________ variable
	int yy = 22;
	
	public static void main(String[] args) {
		MoreStuff a = new MoreStuff();
		MoreStuff b = new MoreStuff();
		a.increaseYY(100);
//		System.out.println(yy); // ERROR
		System.out.println(a.yy);
		System.out.println(b.yy);
	}
	
	// num is a _______ variable
	public void increaseYY(int num) {
		if (num < 10) {
			// bigNum is a _________ variable
			int bigNum = num * 100;
			yy = yy + bigNum;
		} else {
			yy = yy + num;
		}
	}

}
