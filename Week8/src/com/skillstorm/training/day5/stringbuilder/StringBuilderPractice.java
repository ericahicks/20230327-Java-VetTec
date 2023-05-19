package com.skillstorm.training.day5.stringbuilder;

public class StringBuilderPractice {
	
	public static void main(String[] args) {
//		System.out.println("ABCs holds: ");
//		StringBuilder abcs = new StringBuilder("a");
//		abcs.insert(0, "b"); // ba
//		System.out.println(abcs);
//		abcs.insert(0, "c"); // cba
//		System.out.println(abcs);
//		abcs.insert(1, "d"); // cdba
//		System.out.println(abcs);
//		abcs.insert(2, "e"); // cdeba
//		System.out.println(abcs);
//
//		System.out.println("XYZs holds: ");
//		StringBuilder xyzs = new StringBuilder("x");
//		System.out.println(xyzs); // 
//		xyzs.append("y"); // xy
//		System.out.println(xyzs); // 
//		xyzs.append("z"); // xyz
//		System.out.println(xyzs); // 
//		xyzs.reverse(); // zyx
//		System.out.println(xyzs); // 
//
		System.out.print("EFG holds: ");
		String efg = "e";
		efg.toUpperCase().concat("f").concat("g"); // Efg
		System.out.println(efg); // Strings are immutable, all the String methods create a new String
		
		StringBuilder efg2 = new StringBuilder("e");
//		efg2 + efg2;
		efg2.append(efg2); 
		efg2.append(efg); 
		efg2.append(new Integer(1)); 
		String result = efg2 + "h";
		System.out.println(result); // eee1h
		
		StringBuilder result2 = new StringBuilder(result).replace(0,3, "hi");
		System.out.println(result2);
		
	}

}
