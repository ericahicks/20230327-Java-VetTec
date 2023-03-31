package com.skillstorm.training.day5;

public class CoinFlip {
	
	public static void main(String[] args) {
		double coin = Math.random();  // returns a value between 0.0 and 0.99999999
		if (coin < 0.5) {
			System.out.println("Heads");
		} else {
			System.out.println("Tails");
		}
	}

}
