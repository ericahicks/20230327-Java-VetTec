package com.skillstorm.day4;

public class StringBuilderREview {

	public static void main(String[] args) {
		
		String s = "blooper";
		StringBuilder sb = new StringBuilder(s); // what is the length?
		System.out.println(sb.length()); // 7
		System.out.println(sb.capacity()); // 7 + 16 = 23
		
		String temp = s.substring(4); // b l o o p e r
		                             //  0 1 2 3 4 5 6 
		                              //         ______ = per
		System.out.println(s); // s is still blooper
		System.out.println(temp);
		
		sb.append(temp);
		System.out.println(sb);
		
		sb.delete(3, 5); // b l o o p e r p e r
		                 // 0 1 2 3 4 5 6 7 8 9
		                 //       _ _            = bloerper
		System.out.println(sb);
	}
}
