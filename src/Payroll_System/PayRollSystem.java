package Payroll_System;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;




public class PayRollSystem {
	private ArrayList<Employee> employeeList;
	
	public PayRollSystem() {
		employeeList=new ArrayList<>();
	}
	
	public void addEmployee(Employee empl) {
		employeeList.add(empl);
	}
	
	public void removeEmployee(int id) {
		Employee employeeToRemove=null; 
		for(Employee employee:employeeList) {
			if(employee.getId()==id) {
				employeeToRemove=  employee;
				break;
			}
		}
		if(employeeToRemove!= null) {
			employeeList.remove(employeeToRemove);
		}
	}
	
	public void displayEmployye() {
		for(Employee employee:employeeList) {
			System.out.println(employee);
		}
	}
	
	public void addEmployeeToDatabase(Employee emp) {
		employeeList.add(emp); // existing logic

	    String query = "INSERT INTO employees VALUES (?, ?, ?, ?)";

	    try (Connection conn = DBConnection.databaseConnection();
	         PreparedStatement ps = conn.prepareStatement(query)) {

	        ps.setInt(1, emp.getId());
	        ps.setString(2, emp.getName());

	        if (emp instanceof FullTimeEmployee) {
	            ps.setString(3, "FULL_TIME");
	        } else {
	            ps.setString(3, "PART_TIME");
	        }

	        ps.setDouble(4, emp.calculateSalary());

	        ps.executeUpdate();

	        System.out.println("Employee saved to database.");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
		
		
	}
	
	public static void main(String[] args) {

	    PayRollSystem payrollsystem = new PayRollSystem();

	    FullTimeEmployee empl = new FullTimeEmployee("Vikas", 1, 70000);
	    PartTimeEmployee empl2 = new PartTimeEmployee("Ramesh",2,8,2000);

	    payrollsystem.addEmployee(empl);
	    payrollsystem.addEmployee(empl2);

	    System.out.println("Initial Employee Details:");
	    payrollsystem.displayEmployye();
	    System.out.println("Removing Employee");
	    payrollsystem.removeEmployee(2);
	    System.out.println("Remaing Employees Details: ");
//	    payrollsystem.displayEmployye();
//	    payrollsystem.addEmployee(empl);
//	    payrollsystem.addEmployeeToDatabase(empl2);
	}
		
		
}
