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
		numShops++;
	}
	//---------------------------------------------------------------
	// The data is fully encapsulated via private fields and public getters and setters
	// Getters and Setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String[] getFlavors() {
		return this.flavors;
	}
	
	public static int getNumShops() {
		return IceCreamShop.numShops; // Access static variables in a static way (use a class name not an object)
	}
	
	// Prevent the addition of empty strings to the ice cream flavors array
	
	
	
	//---------------------------------------------------------------
	// Has the ability to run out of and restock ice cream flavors through publicly accessible methods
	// Methods
	public void addFlavor(String flavor) {
		// Make sure we don't exceed the max capacity?
		
		// Add it at the index of the numFlavors
		this.flavors[this.numFlavorsInStock] = flavor;
		this.numFlavorsInStock++;
	}
	
	//---------------------------------------------------------------
	// Override the toString method
	@Override
	public String toString() {
		String result = "";
		// Include the name
		result += "Name: " + this.name + "\n";
		// Include the address
		result += "Address: " + this.address + "\n";
		// Include a list of the flavors in stock
		result += this.numFlavorsInStock + " flavors available: \n";
		for (int i = 0; i < this.numFlavorsInStock; i++) {
			result += this.flavors[i] + ", ";
		}
		result = result.substring(0, result.length() - 2);
		return result;
	}
	
	
	//---------------------------------------------------------------
	// Override the equals method to compare two IceCreamShop objects (only compare the array of flavors)
	
}
