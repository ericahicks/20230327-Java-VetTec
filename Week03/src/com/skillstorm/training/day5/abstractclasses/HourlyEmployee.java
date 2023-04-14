package com.skillstorm.training.day5.abstractclasses;

public class HourlyEmployee extends Employee {
	private double hourlyWage;
	private double hoursWorked; // current pay period
	public HourlyEmployee(String id) {
		super(id);
	}
	@Override
	public double calculatePaycheck() {
		return this.hourlyWage * this.hoursWorked;
	}
	public double getHourlyWage() {
		return hourlyWage;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

}
