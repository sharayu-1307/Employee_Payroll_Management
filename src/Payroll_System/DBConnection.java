package Payroll_System;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static Connection conn;
	
	public static Connection databaseConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3307/database","username","Password");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
