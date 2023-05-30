package com.skillstorm.day2;

public class TestSwitchWithexception {
	// catch-or-specify requirement -- compilation error if not followed
	// all checked exceptions that are thrown in a method must  be "caught" with a try-catch or
	// "specified" with a throws clause
	
	// finally block "supersedes" the catch block and so it's return value (or exception value) is returned
	public int luckyNumber(int seed) { // seed = 6
		if (seed > 10) // false
			return seed % 10;
		int x = 0; // runs
		try {
			if (seed % 2 == 0) // does 6 / 2 have a remainder of 0? is 6 even? true
				throw new Exception("No Even no."); // checked exception 
			else
				return x; // NOT 0
		} catch (Exception e) {
//			throw new RuntimeException();
			return 3; // is 3 or 7 returned?
		} finally {
//			throw new NullPointerException();
			return 7;
		}
	}

	public static void main(String args[]) {
//		System.out.println(new TestSwitchWithexception().luckyNumber(6));
		int amount = 100, seed = 6;
		switch (new TestSwitchWithexception().luckyNumber(6)) { // We just saw 7 is the value 
		case 3:
			amount = amount * 2;
		case 7:
			amount = amount * 2; // 100 * 2 = 200
		case 6:
			amount = amount + amount; // 200 + 200 = 400
		default:
		}
		System.out.println(amount);
	}

}
