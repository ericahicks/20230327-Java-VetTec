package com.skillstorm.day2.enthuware.overriding;

import java.io.FileNotFoundException;
import java.io.IOException;

// covariant = a subtype (more specific)
// contravarient = a parent type (more general)
public class Type1 {
	
	protected Type1 get() throws IOException {
		return null;
	}

}

class Type2 extends Type1 {
	
	// How can I override a method? -- can use more specific types or more general access (parameters must be exact match)
	@Override
//	public Type2 get() { // holds to the parent class's requirements for access (and expands it)
//	private Type2 get() { // does not meet the requirements of the parent class's method we are overriding
//	protected Type2 get() { // holds to the contract that result IS-A Type1
//	protected Type2 get() throws Exception { // Can't throw a different type or more general type of CHECKED exception
	protected Type2 get() throws FileNotFoundException, NullPointerException { // can be more specific or any unchecked
		return null;
	}
	
	public void doStuff(int a, double b) {
		
	}
	
	public void set(Type2 t) {
		
	}
	
}

class Type3 extends Type2 {
	
	@Override
	public void doStuff(int a, double b) { // 
//		public void doStuff(int a, double b) { // must match exact parameters
		
	}
	
	@Override
	public void set(Type2 t) { // must match exact 
//	public void set(Type1 t) { // can't be  contravariant type
//	public void set(Type3 t) { // can't be covariant type
		
	}
	
	
}