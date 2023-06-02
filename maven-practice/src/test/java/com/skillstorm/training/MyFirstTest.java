package com.skillstorm.training;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MyFirstTest {
	
	@Test
	void failTest() {
		fail("This causes the test to fail.");
	}
	
	@Test
	void positiveMathPowTest() {
		assertTrue(Math.pow(3, 2) == 6);
	}
	
	@Test
	void negativeMathPowTest() {
		assertFalse(Math.pow(4, 2) == 6);
	}
	
	@Test
	void integerDivision() {
		Throwable t = assertThrows(ArithmeticException.class, () -> {int x = 1 / 0;});
		
		assertEquals("/ by zero", t.getMessage());
	}

}
