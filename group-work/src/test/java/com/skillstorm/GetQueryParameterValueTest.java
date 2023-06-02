package com.skillstorm;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class GetQueryParameterValueTest {

	static String[] tests = new String[] {
			"https://www.domain.com/page?key1=value1&key2=value2",
			"https://www.domain.com/page?key5=value2&key2=value;",
			"skillstorm.com/user/23456/asp-wahtlks/ajj/user/" };

	@Test
	void testSuccess() {
		assertEquals("value1",
				GroupWork.getQueryParameterValue(tests[0], "key1"));
	}

	@Test
	@Disabled
	void testIllegalArgument() {
		assertThrows(IllegalArgumentException.class,
				() -> GroupWork.getQueryParameterValue(tests[2], ""));

	}
}
