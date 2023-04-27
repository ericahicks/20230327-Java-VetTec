package com.skillstorm.training.day4;

// static imports
// How can I import Math.PI so I don't have to use the Math.
import java.lang.Math; // normal import I still have to use the class name to access methods and properties
//import static java.lang.Math; // static import lets me drop the class name, but I must specify what property or method


import static java.lang.Math.PI;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*; // means import everything


import java.io.*;
//import java.util; // does not work must use star notation

public class PackageImports {
	
	// Example 1:
	// static import so don't need class name
	double p = PI; // static imports are useful for shorthand 
	
	// Example 2:
	// normal import so don't need package name but do need class name
	long d = Math.round(p); // normal imports are useful for getting access to classes w/o specifying the package
	
	// Example 3: 
	// Not imported, so specify the full name including package name
	java.util.ArrayList<String> a = new java.util.ArrayList<>();
	
}
