package com.skillstorm.training.day4;

public class CoinFlip {
	
	public static void main(String[] args) {
		//----------------------------------------------------------------------------------------------------------
		 System.out.println("--------------Coin Flip----------------------");
		 // convert 0 or 1 into Heads or Tails
		 int result = (int) (Math.random() * 2); // 0 is heads and 1 is tails
		 boolean isHeads = (0 == result); // true if the result is 0
		 String coin = isHeads ? "Heads" : "Tails"; // ternary operator to store one of two values based on a boolean
		 System.out.println(coin);
//		 String bad = isHeads ? System.out.println("Heads") : System.out.println("Tails"); // NO I cannot call code that doesn't return a value
//		 String hi = isHeads ? "Hello".toUpperCase() : "Tails".toLowerCase(); // YES! I can call any method that returns a value of matching type
	}

}
