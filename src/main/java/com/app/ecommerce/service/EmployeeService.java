package com.app.ecommerce.service;

import java.util.List;

import com.app.ecommerce.model.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployees();

	Employee getEmployeeById(Integer empId);
	
}
