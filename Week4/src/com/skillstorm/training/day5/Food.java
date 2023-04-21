package com.skillstorm.training.day5;

public class Food {
	
	public static void main(String[] args) {
		Food a = new Food();
		Crayon c = (Crayon) new Food(); // java.lang.ClassCastException
//		Crayon c = new Food(); 
		// java.lang.Error: Unresolved compilation problem: 
		//Type mismatch: cannot convert from Food to Crayon
	}

}

class Crayon extends Food {
	
}
