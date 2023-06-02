package com.skillstorm.training;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeJunitTest {
	
	static Holder h = new Holder();

	@BeforeAll
	static void init() {
		h.str = "init";
		h.print();
	}
	
	@BeforeEach
	void setup() {
		h.str = "  setup";
		h.print();
	}
	
	@AfterEach
	void cleanup() {
		h.str = "  cleanup";
		h.print();
	}
	
	@AfterAll
	static void finalTeardown() {
		h.str = "final Teardown";
		h.print();
	}
	
	@Test
	void test1() {
		h.str = "    Test 1";
		h.print();
		fail("Test 1");
	}
	
	@Test
	void test2() {
		h.str = "    Test 2";
		h.print();
		fail("Test 2");
	}
	
	@Test
	void test3() {
		h.str = "    Test 3";
		h.print();
		fail("Test 3");
	}
	
	
}
