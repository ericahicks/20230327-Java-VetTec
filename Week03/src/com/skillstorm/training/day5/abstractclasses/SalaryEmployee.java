package com.skillstorm.training.day5.abstractclasses;

public class SalaryEmployee extends Employee {
	private double salary; // annual
	public SalaryEmployee(String id) {
		super(id);
	}
	@Override
	public String toString() {
		return String.format("SalaryEmployee [salary=%s, name=%s]", salary,
				getName());
	}
	
	// Calculate weekly pay
	@Override
	public double calculatePaycheck() {
		return this.salary / 52; // 52 pay periods/year
	}
	
	public double calculatePaycheckForWeeks(int num) {
		return this.calculatePaycheck() * num;
	}
	
	public double getSalary() {
		return this.salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
