package com.skillstorm.day3.enthuware6;

public class Foo extends FooBase implements Bar {
	public static void main(String[] args) {
		Foo.bar();
	}
	
}

interface Bar {
	public static void bar() {
		System.out.println("In Bar interface");
	}
}

abstract class FooBase {
	public static void bar() {
		System.out.println("In FooBase");
	}
}
