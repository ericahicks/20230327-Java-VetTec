package com.skillstorm.training.day3.icecreamshop.models;

public class IceCreamShopTests {
	
	public static void main(String[] args) {
		// Testing remove 2 characters from a string

//		String str = "radar";
//		str = str.substring(0, str.length() - 2);
//		System.out.println(str);
		///////////// Test 0 //////////////////
		System.out.println("There are now: " + IceCreamShop.getNumShops() + " shops.");
		System.out.println();
		
		//////////////// Test 1///////////////
		// Create an Ice Cream Shop
		// Print it out
		IceCreamShop jenisShop = new IceCreamShop("Jeni's", "123 Broadway");
		System.out.println(jenisShop);
		System.out.println();

		System.out.println("There are now: " + IceCreamShop.getNumShops() + " shops.");
		System.out.println();
		//////////////// Test 2 ///////////////
		// Create another Ice cream Shop
		// Print it out
		IceCreamShop myShop = new IceCreamShop();
		System.out.println(myShop);
		System.out.println();

		// Check the numShops static property has updated to 2
		System.out.println("There are now: " + IceCreamShop.getNumShops() + " shops.");
		System.out.println();
		
		///////////// Test 2b ////////////////////
		// Set the name and address of the shop
		myShop.setName("Scoops n' Smiles");
		System.out.println("My shop is now named: " + myShop.getName());
		
		myShop.setAddress("123 Main St.");
		System.out.println("My shop is now located at: " + myShop.getAddress());
		//////////////// Test 3 ///////////////
		// Add a flavor to one of the Ice Cream Shop's inventory
		// Print out both shops again
		
		// Remove a flavor to one of the Ice Cream Shop's inventory
		// Print out both shops again
		System.out.println();
		myShop.addFlavor("chocolate");
		System.out.println(myShop);
		

		//////////////// Test 4 ///////////////
		// Compare the Ice Cream Shops
		
		
		
		// Make the flavor lists match
		// Compare the Ice Cream Shops
		
		
		
	}

}
