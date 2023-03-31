package com.skillstorm.training.day5;

public class VariableScopeExamples {
	
	public static void main(String[] args) {

		System.out.println("-----------Temperature Based Wardrobe Decisions--------------");
		int temp = 60;
		String outfit;
		// Ideas for temperature divisions
		// < 30  snow pants and jacket
		// 30-50 hoodie and sweatpants
		// 50-70 jeans and a sweatshirt
		// 70-90 tshirt and shorts
		// 90+   swimsuit
		if (temp < 30) {
			outfit = "snow pants and jacket";
		} else if (temp < 50 ) { // (temp > 30 && temp < 50) { // I already know temp > 30 when I get to this line
			outfit = "hoodie and sweatpants";
		} else if (temp < 70) {
			outfit = "jeans and a sweatshirt";
		} else if (temp < 90) {
			outfit = "tshirt and shorts";
		} else { // else if (temp > 90) {
			outfit = "swimsuit";
		}
		System.out.println(outfit);
	}

}
