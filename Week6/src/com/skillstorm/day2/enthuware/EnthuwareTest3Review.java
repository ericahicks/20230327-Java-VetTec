package com.skillstorm.day2.enthuware;

public class EnthuwareTest3Review {

	public static void main(String[] args) {
		// Ternary review:
		// Same as an if-else but cannot call void methods 
		// (each expression must evaluate to a single value of appropriate type)
		// Notation: conditional ? trueCaseValue : falseCaseValue;
		
		// Can I do the following?
//		 String name = Math.random() > 0.5 ? System.out.println("Erica") : System.out.println("Sean");
		// No, because the true-expression and false-expression must evaluate to String values not void
		
		
		// Problem 3: Where are the parenthesis?
		int x = 1; // now 2
		int y = 2; // now 1
		int z = x++; // 1 now 0 now 1
		int a = --y; // 1
		int b = z--; // 1 now 2
		b += ++z; // b = b + (++z) becomes
		// b = b + (z = z + 1)
		// b = b + z
		// b = 1 + 1 = 2
		int answ = (x > a) ? (y > b ? y : b ): (x > z ? x : z);
		//                    -----  --   --
		
		
//		int answ = (x > a ) ? (y > b ? y : b ): (x > z ? x : z);
		//         --------  ---------------   ---------------
		//          condition  truecasevalue    falsecasevalue
		int answSameAs = (x > a) ? (y > b ? y : b ) : (x > z ? x : z);
		//               ------- ? ---------------- : ---------------
		// same as
		int sameAs;
		if (x > a) {
			sameAs = (y > b ? y : b );
		} else {
			sameAs = (x > z ? x : z);
		}
		
		
		
		
		
		
		
		
		
		// also same as
		int alsoSameAs;
		if (x > a) {
			if (y > b) {
				alsoSameAs = y;
			} else {
				alsoSameAs = b;
			}
		} else {
			if (x > z) {
				alsoSameAs = x;
			} else {
				alsoSameAs = z;
			}
		}
		System.out.println(answ);
		System.out.println(answSameAs);
		
		
	}

}
