package com.skillstorm.training.day4;

public class MyRandom extends java.util.Random {
	// Inherits all the properties and methods from the Random  class
	
	public byte nextByte() {
		return (byte) super.next(8); // by extending the java.util.Random class I have access to the protected methods
	}
	
	public short nextShort() {
		return (short) super.next(16); // by extending the java.util.Random class I have access to the protected methods
	}
}
