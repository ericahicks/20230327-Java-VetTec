package com.skillstorm.training.day5.classes;

import com.skillstorm.training.day5.interfaces.Interface1;

public class Main2 {
	public static void main(String[] args) {
		TwoFace face = new TwoFace();
		face.tryMe();
//		System.out.println(face.x); // ambiguous
		System.out.println("Interface1 x is " + Interface1.x); // x is static
		System.out.println("End of Main");
	}

}
