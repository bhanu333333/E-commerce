package com.app.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.ecommerce.model.Employee;
import com.app.ecommerce.repositary.EmployeeRepositary;
import com.app.ecommerce.service.EmployeeService;
@Service

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepositary employeeRepositary;
	
	@Autowired

	public EmployeeServiceImpl(EmployeeRepositary employeeRepositary) {
		super();
		this.employeeRepositary = employeeRepositary;
	}


	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepositary.save(employee);
	}


	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepositary.findAll();
	}
	
	
	@Override
	public Employee getEmployeeById(Integer empId) {
		return employeeRepositary.findById(empId).get();
	}
  }

