package com.skillstorm.training.day4;

public class StringPractice {
	
	public static void main(String[] args) {
		
		System.out.println("------------String Concatenation-------------");
		// + operator
		System.out.println("hello" + " world");
		
		// += operator
		String greeting = "hello";
		System.out.println(greeting += " world");
		
		// .concat()  -- to call a method we use .methodname() 
		System.out.println(greeting.concat("!"));
		System.out.println(greeting); // .concat did not change the value in greeting
		
		String name = "erica";
		name.concat(" lynnette ");
		System.out.println(name);
		name = name.concat(" hicks"); // store the new value (overwrites the old)
		System.out.println(name);
		
		System.out.println();
		System.out.println("--------------String length-----------------");
		String cat = "Boots";
		System.out.println(cat.length());
		
		cat.concat(" Hicks");
		System.out.println(cat.length());
		
		cat = cat.concat(" is cute");
		System.out.println(" is cute".length()); // length 8
		System.out.println(cat.length());
		
		String empty = "";
		System.out.println(empty.length()); 
		
		String foo; // declared but not initialized
//		System.out.println(foo.length());
		
		System.out.println("----------------String indexOf-----------"); // Put a screenshot in the chat of the below output
		String fruit = "apple";
		System.out.println(fruit.indexOf('a'));
		System.out.println(fruit.indexOf('p'));
		System.out.println(fruit.indexOf('p')); // indexOf always returns the index of the first occurrence
		System.out.println(fruit.indexOf('l'));
		System.out.println(fruit.indexOf('e'));
		System.out.println(fruit.indexOf('x')); // if not found it returns -1
		
		System.out.println(fruit.lastIndexOf('p'));
		
		System.out.println(fruit.indexOf("a") ); // 0
		System.out.println(fruit.indexOf("ap") ); // 0
		System.out.println(fruit.indexOf("pl") ); // 2
		System.out.println("Banana has lots of a's. They are located at:");
		fruit = "banana";
		//       012345
		System.out.println(fruit.indexOf('a',0));
		int location = fruit.indexOf('a'); // holds the location of the first 'a'
		System.out.println(fruit.indexOf('a', location + 1)); // second argument is the START INDEX 
		
		
		location = fruit.indexOf('a', location + 1); // now holds the location of the 2nd 'a'
		System.out.println(fruit.indexOf('a', location + 1));
		
		// Brainteaser:
		System.out.println( fruit.indexOf('a',  fruit.lastIndexOf('a')  )  );
		System.out.println( "banana".indexOf('a', "banana".lastIndexOf('a') + 1));
		System.out.println( "banana".indexOf('a', 5));
		System.out.println( 5 );
		
	}

}
