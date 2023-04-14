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
		se.setName("Tom");
		System.out.printf("$%.2f", e.calculatePaycheck());
	}
}
