package com.revature;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDao {
	
	void addEmployee(Employee employee) throws SQLException;
	void updateEmployee(Employee employee)throws SQLException;
	void deleteEmployee(Employee employee)throws SQLException;
	List<Employee> getAllEmployee()throws SQLException;
	Employee getEmployeeById(int id)throws SQLException;

}
