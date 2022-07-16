package com.app.ecommerce.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ecommerce.model.Employee;
import com.app.ecommerce.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	//build create employee RESt API 
	@PostMapping()
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
		
	}
	
	
	
	
//build getAll employee RestAPi
	@GetMapping
	public List<Employee>getAllEmployees(){
	return employeeService.getAllEmployees();
	}
	//build getAll employee by id RestAPi
    
	@GetMapping("/{empId}")
	public Employee getEmployeeById(@PathVariable Integer empId){
		return employeeService.getEmployeeById(empId);
	}
	
}
