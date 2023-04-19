package com.skillstorm.training.day3.icecreamshop.models;

/*
REQUIREMENTS
- Defines properties such as ice cream flavors, name, and address
- Have the data be fully encapsulated via private fields and public getters and setters
- Have the ability to create multiple IceCreamShop objects and have their data be independent of one another
- Possess the ability to run out of and restock ice cream flavors through publicly accessible methods on the IceCreamShop class
- Prevent the addition of empty strings entities to the ice cream flavors array 
- Override the toString method to allow the printing of an IceCreamShop object
- Override the equals method to compare two IceCreamShop objects (only compare the array of flavors not any other properties such as name)
BONUS
- Prevent the addition of empty strings entities with an if-statement that throws an IllegalArgumentException
- In a separate test class, write a main method and use try-catch to call the method and handle the exception
*/

public class IceCreamShop {
	// Static properties
	private static int numShops;
	private static final int MAX_CAPACITY = 31;
	
	//---------------------------------------------------------------
	// Define properties such as ice cream flavors, name, and address
	// Instance Properties                                // Java runs this code everytime a constructor is called
	private String[] flavors = new String[MAX_CAPACITY]; // Another way to initialize instance properties
	private String name;
	private String address;
	private int numFlavorsInStock;
	
	
	//---------------------------------------------------------------
	// Has the ability to create multiple IceCreamShop objects and have their data be independent of one another
	// Constructors
	public IceCreamShop() {
		// What this defaults the properties to is:
		// name will be: null
		// address will be: null
		// numFlavorsInStock will be: 0
		// flavors is going to be: the String[] I created above { null, null, null, ..... null }
		///////////////////////////
		// How can I call the parameterized constructor below from here?
		this("TBD", "unknown");
	}
	
	public IceCreamShop(String name, String address) {
		this.name = name;
		this.address = address;
	}
	//---------------------------------------------------------------
	// The data is fully encapsulated via private fields and public getters and setters
	// Getters and Setters
	
	// Prevent the addition of empty strings to the ice cream flavors array
	
	
	
	//---------------------------------------------------------------
	// Has the ability to run out of and restock ice cream flavors through publicly accessible methods
	// Methods
	
	
	//---------------------------------------------------------------
	// Override the toString method
	
	
	
	//---------------------------------------------------------------
	// Override the equals method to compare two IceCreamShop objects (only compare the array of flavors)
	
}
