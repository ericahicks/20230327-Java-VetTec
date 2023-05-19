package com.skillstorm.training.day5.stringbuilder;

public class StringBuilderPractice {
	
	public static void main(String[] args) {
		// Put in the chat the output to the following code
		System.out.print("ABCs holds: ");
		StringBuilder abcs = new StringBuilder("a");
		abcs.insert(0, "b");
		abcs.insert(0, "c");
		abcs.insert(0, "d");
		abcs.insert(0, "e");
		System.out.println(abcs);

		System.out.print("XYZs holds: ");
		StringBuilder xyzs = new StringBuilder("x");
		xyzs.append("y");
		xyzs.append("z");
		System.out.println(xyzs);

		System.out.print("EFG holds: ");
		String efg = "e";
		efg.toUpperCase().concat("f").concat("g");
		System.out.println(efg);
	}

}
