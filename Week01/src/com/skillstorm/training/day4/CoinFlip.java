package com.skillstorm.training.day4;

// Here we are using two new operators:

// == is a comparison operator that returns true if the operands are equal and false if they are not
// Examples:
// 1 == 0  returns false
// 0 == 0  returns true
// 'A' == 'A'
// 'A' == 'B'  returns false
// Only use == for primitive data types (byte, short, int, long, float, double, char, boolean)
// true == false   returns false
// true == true    returns true
// false == true   returns false
// false == false  returns true

// ? : is the ternary operator that takes a boolean and if true returns the first value else it returns the second value
// Examples:
// true ? 1 : 0   returns 1
// false ? 0 : 1  returns 0
// (I can return any data type)
// true ? "Heads" : "Tails"  returns "Heads"
// false ? "Heads" : "Tails" returns "Tails"


public class CoinFlip {
	// Math.random() is very useful in games
	
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
