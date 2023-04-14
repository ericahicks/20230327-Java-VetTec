package com.skillstorm.training.day5.abstractclasses2;

public class HourlyEmployee extends Employee {

	private double hoursWorked;
	private double hourlyWage;

	public HourlyEmployee(String id) {
		super(id);
	}

	@Override
	public double calculatePaycheck() {
		return hoursWorked * hourlyWage;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
	public String toString() {
		return super.toString() + ", hoursWorked=" + hoursWorked
				+ ", hourlyWage=" + hourlyWage + "]";
	}

}
