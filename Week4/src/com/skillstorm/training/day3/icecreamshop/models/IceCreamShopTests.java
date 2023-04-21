package com.skillstorm.training.day3.icecreamshop.models;

public class IceCreamShopTests {
	
	public static void main(String[] args) throws Exception {
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

		try {
			// Remove a flavor to one of the Ice Cream Shop's inventory
			// Print out both shops again
			System.out.println();
			myShop.addFlavor("chocolate");
			myShop.addFlavor("Strawberry");
			System.out.println(myShop);
			
			System.out.println();
			myShop.removeFlavor("chocolate");
			System.out.println(myShop); // Was it removed successfully?
			
			System.out.println();
			myShop.removeFlavor("vanilla"); // Trying to remove flavor that is not there, nothing should change
			System.out.println(myShop); // Is the correct count and flavors still there?
			
			System.out.println();
			myShop.addFlavor("Cherry Garcia");
			myShop.addFlavor("Chunky Monkey");
			myShop.addFlavor("Coffee Coffee BuzzBuzzBuzz");
			myShop.addFlavor("Mint Chip Cookie");
			myShop.addFlavor("Matcha");
			myShop.addFlavor("Mudslide");
			myShop.addFlavor("Rocky Road");
			myShop.addFlavor("Bubble Gum");
			myShop.addFlavor("Cookie Dough");
			myShop.addFlavor("Cookies 'n Cream");
			myShop.addFlavor("Cookie Monster");
			myShop.addFlavor("Vanilla");
			myShop.addFlavor("Vanilla Bean");
			myShop.addFlavor("Carmel Cone");
			myShop.addFlavor("Rasberry");
			myShop.addFlavor("Cherry");
			myShop.addFlavor("Coffee");
			myShop.addFlavor("Coffee Almond Fudge");
			myShop.addFlavor("Mocha");
			myShop.addFlavor("Dulce de Leche");
			myShop.addFlavor("Sweet Cream");
			myShop.addFlavor("Oreo");
			myShop.addFlavor("Reeses");
			myShop.addFlavor("MnMs");
			System.out.println(myShop);
			myShop.addFlavor("Eggnog");
			myShop.addFlavor("Pumpkin");
			myShop.addFlavor("Neopolitan");
			myShop.addFlavor("Peppermint");
			myShop.addFlavor("Moose Tracks");
			myShop.addFlavor("Dark Chocolate");
			myShop.addFlavor("Pistachio"); // Adding 31st flavor isn't added!
		
			System.out.println();
			System.out.println(myShop);
			
			myShop.removeFlavor("Dark Chocolate");
			myShop.addFlavor("Pistachio"); // remove last
			System.out.println();
			System.out.println(myShop); 
			System.out.println();
		} catch (StockOverflowException | DuplicateFlavorException | InvalidFlavorException e) {
			// Recovery options:
			// 1. Don't recover and throw another exeption that would stop the program
//			throw new Exception("Something went wrong", e);
			// 2. Print out the message and keep running the program
			System.out.println(">>>>>>>>>>>>>" + e.getMessage());
			// 3. Do nothing just keep going
			
		}
		
		myShop.removeFlavor("Strawberry"); // remove first
		System.out.println(myShop);
		System.out.println();
		
		myShop.removeFlavor("Oreo"); // remove somewhere in the middle
		System.out.println(myShop);
		
		//////////////// Test 4 ///////////////
		// Compare the Ice Cream Shops
		
		
		
		// Make the flavor lists match
		// Compare the Ice Cream Shops
		
		
		
	}

}
