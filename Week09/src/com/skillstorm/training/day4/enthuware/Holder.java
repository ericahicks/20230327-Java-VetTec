package com.skillstorm.training.day4.enthuware;

class Holder {
	int value = 1;
	Holder link; // null

	public Holder(int val) {
		this.value = val;
	}

	// what does the final keyword do?
	// variables - can't reassign the variable
	//           - note, primitive variables store the value directly so they can't be changed
	//           - note, reference variables hold a memory address, so the memory address can't change BUT
	//           - note, reference type variables, the object can be mutated
	// method - that method cannot be overridden in child classes
	// class - cannot be extended (cannot have child classes)
	public static void main(String[] args) {
		final Holder a = new Holder(5); 
		Holder b = new Holder(10);
		a.link = b;
		b.link = setIt(a, b);
		System.out.println(a.link.value + " " + b.link.value); // a.link.value + " " + b.link.value
	}                                                         // _______               // a.value = 5
	                                                           // null

	public static Holder setIt(final Holder x, final Holder y) {
		x.link = y.link; // x is pointing to a -- now set a.link to null
		                 // y is pointing to b -- b.link is currently null
		return x; // we are returning a which make a note is now has alink of null
	}

}