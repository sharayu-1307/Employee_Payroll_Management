package Payroll_System;

public class PartTimeEmployee extends Employee{
	
	private int hoursWorked;
	
	private double hourlyRate;
	
	

	public PartTimeEmployee(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}



	public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
		super(name, id);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}



	@Override
	public double calculateSalary() {
		return hoursWorked*hourlyRate;
	}
	
	

}
