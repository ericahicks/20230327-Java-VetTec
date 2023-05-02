package com.skillstorm.day2.enthuware;

public class LabelRules {

	public static void main(String[] args) {
		// Where can you use labels?
		// - on loops
		// - on blocks
		// - but only referenced from within the same scope
	}
	
	 void crazyLoop() {
		 int c = 0;
		 JACK: while (c < 8)    {
			 JILL: {
				 System.out.println(c);
				 if (c > 3) 
					  break JILL; // the label being referenced must be in scope
				 else c++;    
			 }
	      } 
		 
		 while (true) {
//			 break JACK; // Doesn't work because the label referenced is in a different scope
		 }
    }

}
