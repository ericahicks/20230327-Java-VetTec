package com.skillstorm.training.day3;

public class BitWiseOperators {
	
	public static void main(String[] args) {
		int x = 1;
//		System.out.println(String.format("%32s", Integer.toBinaryString(x)).replace(" ", "0") );
//		System.out.println(Integer.toBinaryString(~x));
		
//		int y = 2;
//		System.out.println(String.format("%32s", Integer.toBinaryString(y)).replace(" ", "0") );
//		System.out.println(String.format("%32s", Integer.toBinaryString(x | y)).replace(" ", "0"));
		
		// TODO print out in binary the values below and
		// Put in the chat
		int a = 10;
		int b = 2;
		int z = a & b;
//		System.out.println(String.format("%32s", Integer.toBinaryString(a)).replace(" ", "0") );
//		System.out.println(String.format("%32s", Integer.toBinaryString(b)).replace(" ", "0") );
//		System.out.println(String.format("%32s", Integer.toBinaryString(z)).replace(" ", "0"));
		// newCapacity = oldCapacity + oldCapacity / 2;
		
		int c = 20;
		int c2 = c >> 2;
		System.out.println(String.format("%32s", Integer.toBinaryString(c)).replace(" ", "0") );
		System.out.println(String.format("%32s", Integer.toBinaryString(c2)).replace(" ", "0") );
		System.out.println("c2 is " + c2); // 5
		
		double test = 1.0;
		test = (int)test >> 1; // can't do decimal
		
		byte test2 = (byte) 1;
		System.out.println(test2 >> 1);
		

		short test3 = (short) 1;
		System.out.println(test3 >> 1);
		

		char test4 = (char) 98;
		System.out.println(test4);
		System.out.println(test4 = (char)(test4 >> 1));
		
		// can't use floats or doubles only integral values
		
		boolean test5 = true;
//		System.out.println(test5 >> 1); // can't do bit-shift with boolean
//		System.out.println(test5 & 1);
		System.out.println(test5 & true); // I can do & | ~ ^ with boolean
		System.out.println(test5 | true);
	}

}
