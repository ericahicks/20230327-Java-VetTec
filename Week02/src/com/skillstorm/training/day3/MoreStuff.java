package com.skillstorm.training.day3;

public class MoreStuff {
	// This is a class variable
	static int xx = 11;
	// This is a instance variable
	int yy = 22;
	
	public static void main(String[] args) {
		MoreStuff a = new MoreStuff();
		MoreStuff b = new MoreStuff();
		a.increaseYY(100);
		b.increaseYY(5);
//		System.out.println(yy); // ERROR
		System.out.println(a.yy); // 122
		System.out.println(b.yy); // 522
	}
	
	// num is a local variable
	public void increaseYY(int num) {
		if (num < 10) {
			// bigNum is a local variable
			int bigNum = num * 100;
			this.yy = this.yy + bigNum;
		} else {
			// instance variable + local variable
//			System.out.println(bigNum); // does not exist
			this.yy = this.yy + num;
		}
	}

}
