package com.skillstorm.training;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyClassesTest {

	@Test
	void testWithOddNumber() {
		assertTrue(MyClass.isOdd(1));
	}
}
