package com.skillstorm.training.day3.icecreamshop.models;

import java.util.Scanner;

public class ListGenerator {
	
	public static void main(String[] args) {
		String iceCreams = "Mint Chip Cookie\r\n"
				+ "Matcha\r\n"
				+ "Mudslide\r\n"
				+ "Rocky Road\r\n"
				+ "Bubble Gum\r\n"
				+ "Cookie Dough\r\n"
				+ "Cookies 'n Cream\r\n"
				+ "Cookie Monster\r\n"
				+ "Vanilla\r\n"
				+ "Vanilla Bean\r\n"
				+ "Carmel Cone\r\n"
				+ "Rasberry\r\n"
				+ "Cherry\r\n"
				+ "Coffee\r\n"
				+ "Coffee Almond Fudge\r\n"
				+ "Mocha\r\n"
				+ "Dulce de Leche\r\n"
				+ "Sweet Cream\r\n"
				+ "Oreo\r\n"
				+ "Reeses\r\n"
				+ "MnMs"
				+ "Eggnog\r\n"
				+ "Pumpkin\r\n"
				+ "Neopolitan\r\n"
				+ "Peppermint\r\n"
				+ "Moose Tracks\r\n"
				+ "Dark Chocolate\r\n"
				+ "Pistachio";
		Scanner flavors = new Scanner(iceCreams);
		while (flavors.hasNext()) {
			System.out.println("myShop.addFlavor(\"" + flavors.nextLine() + "\");");
		}
		flavors.close();
	}

}
