package com.skillstorm.training.day5.abstractclasses;

public class EmployeeTests {
	public static void main(String[] args) {
//		Employee e = new Employee(); // can't create an instance of an abstract class
//		Employee e = new Employee("123a5"); // still can't call it
		SalaryEmployee se = new SalaryEmployee("1234z5");
		System.out.println(se);
//		se.name = "Sam"; // private so not inherited
		se.setName("Sam"); // public so inherited
		System.out.println(se);
		Employee e = new SalaryEmployee("000");
		Employee e2 = new HourlyEmployee("123");
		se.setName("Tom");
		// BE CAREFUL OF CLASS CAST EXCEPTIONS -- this is us telling Java we will hand it the proper type so it's on us
		((SalaryEmployee) e).setSalary(200000); // Employee class does not have the method .setSalary so we use casting
		System.out.printf("$%.2f", e.calculatePaycheck());
	}
}
