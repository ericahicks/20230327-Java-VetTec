package com.skillstorm;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GetUserIdMethod2Test {

	static String[] tests = new String[] {
			"https://www.skillstorm.store.com/user/12345/cart",
			"https://www.skillstorm.store.com/user/12345",
			"https://www.skillstorm.store.com/cart"};

	@Test
	void testSuccessInMiddle() {
		assertEquals(12345,
				GroupWork.getUserIdMethod2(tests[0]));
	}
	
	@Test
	void testSuccessAtEnd() {
		assertEquals(12345,
				GroupWork.getUserIdMethod2(tests[1]));
	}
	
	@Test
	void testFailure() {
		assertThrows(IllegalArgumentException.class, 
				() -> {
				     GroupWork.getUserIdMethod2(tests[2]);
				});
	}
	
	
}
