package com.skillstorm.day3.otherpackage;

import com.skillstorm.day3.mypackage.MyClass;
public class OtherClass {

 	public static void main(String[] args) {
		MyClass mc = new MyClass();
		System.out.println("a=" + mc.a); // only public fields accessible outside the package
//		System.out.println("b=" + mc.b); // the field MyClass.b is not visible
//		System.out.println("c=" + mc.c);
//		System.out.println("d=" + mc.d);
	}
 
}
