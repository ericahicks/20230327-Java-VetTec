package com.skillstorm.training;

public class Holder {
	
	String str;
	
	public Holder() { this.str = ""; }

	public Holder(String str) { this.str = str; }
	
	public void print() {
		System.out.println(str);
	}
}
