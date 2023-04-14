package com.skillstorm.training.day5.abstractclasses2;

public abstract class Employee {
	
	private String name;
	private final String EMPLOYEE_ID; // if not doing arithmetic, don't use a numeric type to save headaches down the road
	
	public Employee(String id) {
		this.EMPLOYEE_ID = id;
	}
	
	public abstract double calculatePaycheck();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEMPLOYEE_ID() {
		return EMPLOYEE_ID;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + this.name + ", EMPLOYEE_ID=" + this.EMPLOYEE_ID;
	}
}
