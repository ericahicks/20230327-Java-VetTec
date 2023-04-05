package com.skillstorm.training.day3;

public class WhatWillThisDo {
	
	public static void main(String[] args) {
		int x = doStuff();
		System.out.println(x);
	}
	
	public static int doStuff() {
		int x = doMoreStuff() + 1;
		return x;
	}
	
	public static int doMoreStuff() {
		int x = 1 + 1;
		return x;
	}

}
