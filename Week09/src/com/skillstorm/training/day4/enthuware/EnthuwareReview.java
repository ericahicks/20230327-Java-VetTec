package com.skillstorm.training.day4.enthuware;

import java.time.LocalDate;

public class EnthuwareReview {

	public static void main(String[] args) {
		//////////////////////////////////////////////
		// PROBLEM 35 OOP concepts encapsulation - See below Person and employee classes
		
		//////////////////////////////////////////////
		// PROBLEM 47 Operators and Decision statements
		boolean hasParams = (args == null ? false : true); // no arguments provided means args is empty not null
        //                   ------------           ----
		//                     false                 true is returned
		// do not write code this way!
		
		if(hasParams){ // if (true)
            System.out.println("has params"); // does this run? yes
        }{ // NOTICE there is not else keyword here
            System.out.println("no params"); // does this run? yes
        }
        // Notice curly braces are allowed anywhere and create an inner block scope for variables
        {
        	int x = 10; // not visible outside these inner curly braces
        }
        int x = 2;
        int year = LocalDate.now().getYear();
//         String test = year == 2023 ? System.out.println("It is a good year") : System.out.println("It is a boring year");
        		//                      ---------------------------------------
        		//                         return type is void so type mismatch
        String test = (year == 2023) ? "It is a good year" : "It is a boring year";
        System.out.println(test);
        
        // nested ternaries
        String test2 = x > 10 ? (x < 20 ? (x < 13 ? "preteen" : "teenager") : "adult" ) : (x == 2 ? "terrible two" :"child");
        System.out.println(test2);
	}

	// What exception is thrown?

	// What overriding, which is valid?

	// Post-fix and Pre-fix

	// Static methods

	// Access modifiers

}
/*
// ENCAPSULATION - limiting access to change or view data
// FULLY ENCAPSULATED CLASS - all variables are private
// GETTERS/SETTERS rules
// - must be public
// - setters should be:
//     public void setName(type var)
// - getters should be:
//     public type getName()
//     public boolean isPropertyName() 
//                                     -- exception to the naming rule, 
//                                       for booleans you can use is instead of get
//                                        
*/

// fully encapsulate person
class Person{                                        // can be public bc can't be changed
	public static final int MAX_POPULATION = 100000; // don't have setter bc constant
	private int age;
	//Insert code here 

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
} 

class Employee extends Person{
	 public static void main(String[] args) {
		 Employee e = new Employee();
		 e.setAge(29);
		 System.out.println(e.getAge());
	 }
}
