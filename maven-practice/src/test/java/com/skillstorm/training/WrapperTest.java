package com.skillstorm.training;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.*;
import com.skillstorm.training.Problem18;

public class WrapperTest {

	@Disabled
	@Test
	void testChangeWrapperAdds9() {
		Wrapper w = new Wrapper();
		w.w = 20;
		int value = Problem18.changeWrapper(w).w;
		assertEquals(29, value);
	}
	
	@Test
	void testChangeWrapperWithNull() {
		assertThrows(NullPointerException.class, () -> Problem18.changeWrapper(null));
	}
}
