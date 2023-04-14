package com.skillstorm.training.day5.abstractclasses2;

public class EmployeeTests {
	
	public static void main(String[] args) {
//		Employee ann = new Employee("123a"); // cannot instantiate a abstract class
		Employee ann;
		ann = new SalaryEmployee("453227");
		ann.setName("Ann");
		((SalaryEmployee) ann).setAnnualSalary(200000);
		System.out.printf("$%,.2f%n", ann.calculatePaycheck());
		System.out.println(ann.toString()); // runtime polymorphism
		// aka dynamic binding = runtime polymorphism
		//        the method body is "bound" to the
		//        method call at runtime 
		// vs  static binding = compiletime polymorphism
		//        the method body is "bound" to the
		//        method call at compile time
		
		Employee barb;
		barb = new HourlyEmployee("123495");
		barb.setName("Barb");
		((HourlyEmployee) barb).setHourlyWage(7.25);
		((HourlyEmployee) barb).setHoursWorked(40); // returns void
		System.out.printf("$%.2f%n", barb.calculatePaycheck()); // print this out
		System.out.println(barb);
	}

}
