package com.skillstorm.training.day2;

public class TestVideoGameShop {
	
	public static void main(String[] args) {
		VideoGameShop shop = new VideoGameShop();
		System.out.println(shop);
		
		shop.addCustomer("Tenzin");
		shop.addCustomer("Blake");
		shop.addCustomer("Tony");
		shop.addCustomer("Senia");
		shop.addCustomer("Jaycie");
		shop.addCustomer("Daun");
		
		shop.restockVideoGames("Pokemon");
		shop.restockVideoGames("Battlefield");
		shop.restockVideoGames("Call of Duty");
		shop.restockVideoGames("Tears of the Kingdom");
		
		shop.helpNext();
		shop.helpNext();
		shop.helpNext();
		shop.helpNext();
		shop.helpNext();
		shop.helpNext();
		shop.helpNext();
	}

}
