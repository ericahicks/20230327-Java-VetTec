package com.skillstorm.day5;

public class ExceptionReturnValuesExample {
	
	public static void main(String[] args) {
		int x = tryReturning();
		System.out.println(x);
	}

	static int tryReturning() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			return 1;
		} finally {
			return 2;
		}
	}

}
