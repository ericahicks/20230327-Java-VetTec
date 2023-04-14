package com.skillstorm.training.day5.abstractclasses;

public abstract class Employee {
	private String name;
	private final String EMPLOYEE_ID; // I'm not using this for arithmetic so allowing non-digit characters for the future
	
	public Employee(String id) {
		this.EMPLOYEE_ID = id;
	}

	public String getEMPLOYEE_ID() {
		return this.EMPLOYEE_ID;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", EMPLOYEE_ID=" + EMPLOYEE_ID + "]";
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public abstract double calculatePaycheck();
	
	
}
