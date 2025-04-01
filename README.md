# Salary Management System

## Overview
The **Salary Management System** is a Java-based application that provides a user-friendly GUI to manage employee salaries. It enables users to perform CRUD operations (Create, Read, Update, Delete) on salary records, ensuring efficient payroll management.

## Features
- **Add Employee Salary**: Users can enter and save salary details for employees.
- **Update Salary Records**: Modify existing salary data.
- **Delete Employee Salary**: Remove records of employees.
- **View Salary Details**: Retrieve salary information for a specific employee.
- **Database Integration**: Uses MySQL for storing salary records.

## Technologies Used
- **Java (Swing)** - For GUI development.
- **JDBC (Java Database Connectivity)** - For database connection.
- **MySQL** - For storing salary data.
- **NetBeans** - Development IDE.

## Installation & Setup
### Prerequisites
Ensure you have the following installed:
- Java Development Kit (JDK) 8 or later
- NetBeans or any Java IDE
- MySQL Server & MySQL Workbench

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/yourusername/salary-management-java.git
   ```
2. Open the project in **NetBeans**.
3. Set up the database:
   - Create a database in MySQL named `salary_db`.
   - Use the following SQL script to create the required table:
     ```sql
     CREATE TABLE salaries (
         id INT PRIMARY KEY AUTO_INCREMENT,
         employee_name VARCHAR(100),
         salary DOUBLE,
         department VARCHAR(50)
     );
     ```
4. Update the database connection details in the Java code:
   ```java
   String url = "jdbc:mysql://localhost:3306/salary_db";
   String user = "root";
   String password = "yourpassword";
   ```
5. Compile and run the program in NetBeans.

## Usage
1. Open the application.
2. Use the GUI buttons to **Add, Update, Delete, or View Salary Records**.
3. The system will interact with the database and store the data persistently.

## Contributing
1. Fork the repository.
2. Create a new branch (`feature-branch`).
3. Commit your changes and push to GitHub.
4. Open a Pull Request for review.

## License
This project is licensed under the **MIT License**.

## Author
[Your Name](https://github.com/hirwachretien)

