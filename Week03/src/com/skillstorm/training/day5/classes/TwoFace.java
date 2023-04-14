package com.skillstorm.training.day5.classes;

import com.skillstorm.training.day5.interfaces.Interface1;
import com.skillstorm.training.day5.interfaces.Interface2;

public class TwoFace implements Interface1, Interface2 {

	@Override
	public void tryMe() {
		System.out.println("Trying once");
	}
	// inherits x = 10 from Interface1 and x = 20 from Interface2
}
