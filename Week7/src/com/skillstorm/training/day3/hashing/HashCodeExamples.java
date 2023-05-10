package com.skillstorm.training.day3.hashing;

public class HashCodeExamples {
	
	public static void main(String[] args) {
		// Examples of built-in hashCode() methods
		Integer i = Integer.valueOf(1);
		String str = "Hi";
		Double x = Double.valueOf(1.5);
		Character c = Character.valueOf('c');
		
		System.out.println("Hashcode of Integer 1: " + i.hashCode());
		System.out.println("Hashcode of String Hi: " + str.hashCode());
		System.out.println("Hashcode of Double 1.5: " + x.hashCode());
		System.out.println("Hashcode of Character c: " + c.hashCode());
		
		Long l = Double.doubleToLongBits(1.5);
		Long ls = l >>> 32;
		System.out.println(String.format("%64s", Long.toBinaryString(l)).replace(" " , "0"));
		System.out.println(String.format("%64s", Long.toBinaryString(ls)).replace(" ", "0")); // shift filling with 0
		System.out.println(String.format("%64s", Long.toBinaryString(l ^ ls)).replace(" ", "0")); // XOR
	}

}
