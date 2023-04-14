package com.skillstorm.training.day5.abstractclasses2;

public class SalaryEmployee extends Employee {
	// We still have access to the name and employee id from the parent class
	private double annualSalary;

	public SalaryEmployee(String id) {
		super(id);
	}

	@Override
	public double calculatePaycheck() {
		return annualSalary / 52; // assuming 52 weeks in a year (aka 52 pay periods per year)
	}
	
	// Returns the paycheck amount for the given number of weeks (aka pay periods)
	public double calculatePaycheck(int numberWeeks) {
		return calculatePaycheck() * numberWeeks;
	}
	
	public double getAnnualSalary() {
		return this.annualSalary;
	}
	
	public void setAnnualSalary(double salary) {
		this.annualSalary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", annualSalary=" + annualSalary + "]";
	}
	
	

}
