# Employee Payroll Management System

A simple Payroll Management System built using Java and MySQL.

## 🚀 Features

- Add Full-Time and Part-Time Employees
- Calculate Salaries using OOP principles
- Store Employee Data in MySQL Database
- Remove Employees
- Display Employee Details

## 🛠 Technologies Used

- Java (OOP Concepts)
- JDBC
- MySQL
- Eclipse IDE

## 🗄 Database Setup

Create database:

```sql
CREATE DATABASE payroll_db;
```

Create table:

```sql
CREATE TABLE employees (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    type VARCHAR(20),
    salary DOUBLE
);
```

## ⚠ Important

Before running the project, update `DBConnection.java` with your MySQL:

- Username
- Password
- Port number
