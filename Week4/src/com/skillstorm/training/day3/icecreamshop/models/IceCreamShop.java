package com.skillstorm.training.day3.icecreamshop.models;

import java.util.Arrays;

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
	
	public void removeFlavor(String flavor) {
		// Option 1: Find the index of the flavor in the array, and remove it from the list
		//  by copying the contents after the flavor to the left one index


		// Option 2: Recreate the array copying everything but the flavor specified
		String[] newArray = new String[MAX_CAPACITY];
		int newIndex = 0;
		for (int i = 0; i < this.numFlavorsInStock; i++) {
			if (!this.flavors[i].equals(flavor)) {
				// copy over the flavor
				newArray[newIndex] = this.flavors[i];
				// increment the counter
				newIndex++;
			} else {
				// don't copy over the flavor
				// don't increment the counter
				// decrease the number of flavors in stock
				this.numFlavorsInStock--;
			}
		}
		this.flavors = newArray;
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

	// Best practice is always implement hashCode when you implement equals
	// so they match, don't worry about it for now, we will talk about this data structures week
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(flavors);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // checking if the memory addresses are the same
			return true;
		if (obj == null) // check if the object I'm comparing to is null, I know I'm not null, so I can return false
			return false;
		if (getClass() != obj.getClass()) // comparing class makes sure they are the exact same class
//		if (obj instanceof IceCreamShop) { // matches if it is IceCreamShop or any of its subclasses
			return false;
		IceCreamShop other = (IceCreamShop) obj; // cast to same type
		if (other.flavors.length != this.flavors.length)  // check the length
			return false;
		for (int i = 0; i < other.flavors.length; i++) {// check the elements match
			if (!other.flavors[i].equals(this.flavors[i])) {
				return false;
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	//---------------------------------------------------------------
	// Override the equals method to compare two IceCreamShop objects (only compare the array of flavors)
	
	
	
	
	
	
	
	
	
	
	
}
