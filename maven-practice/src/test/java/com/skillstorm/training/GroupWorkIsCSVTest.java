package com.skillstorm.training;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GroupWorkIsCSVTest {
	
	/*
	 * Test I would write for the isCSV method:
	 * - for running the test, we'd need to set up some Strings to test with
	 *   - Something that ends with .csv (success scenario)
	 *   - Something that has .csv in the middle of the string (failure scenario)
	 *   - Something that doesn't have .csv in it at all (failure scenario)
	 *   - Something that is empty (failure scenario)
	 *   - Something that is null (failure scenario)
	 *   - Something with capital .CSV (failure scenario)
	 */
	static String[] tests;
	
	@BeforeAll
	static void initialSetup() {
		// do something here if you need to
		tests = new String[]{ "numbers.csv", "my.csv.txt", ""};
	}

	@Test
	void testSuccess() {
//		assertEquals(true, GroupWork.isCSV(tests[0]));
		assertTrue(GroupWork.isCSV(tests[0]));
	}
	
	@Test
	void testNullString() {
		assertThrows(IllegalArgumentException.class, () -> GroupWork.isCSV(null), "The isCSV method should throw an illegal argument exception when the string is null");
	}
	
}
