package com.skillstorm;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GetUserIdTest {

	static String[] tests = new String[] {
			"https://www.skillstorm.store.com/user/12345/cart",
			"https://www.skillstorm.store.com/user/12345",
			"https://www.skillstorm.store.com/cart"};

	@Test
	void testSuccessInMiddle() {
		assertEquals(12345,
				GroupWork.getUserId(tests[0]));
	}
	
	@Test
	void testSuccessAtEnd() {
		assertEquals(12345,
				GroupWork.getUserId(tests[1]));
	}
	
	@Test
	void testFailure() {
		assertThrows(IllegalArgumentException.class, 
				() -> {
				     GroupWork.getUserId(tests[2]);
				});
	}
	
	
}
