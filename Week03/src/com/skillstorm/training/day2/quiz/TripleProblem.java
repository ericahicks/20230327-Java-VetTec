package com.skillstorm.training.day2.quiz;

public class TripleProblem {
	// Java allows methods to have the same name, but
	// The method signatures must be different
	// Remember: only the name and parameter type/order are part of the signature
	// not the return type
    
    public static int triple(int x) {
        return x * 3;
    }
    
//    public static double triple(int x) { // Cannot have two methods with the same signature
//        return x * 3;
//    }
    
    public static void main(String[] args) {
        int x = triple(1);
        double y = triple(1);
        System.out.println(x + ", " + y);
    }

}