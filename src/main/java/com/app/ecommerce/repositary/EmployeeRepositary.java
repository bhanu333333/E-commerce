package com.app.ecommerce.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.ecommerce.model.Employee;

public interface EmployeeRepositary extends JpaRepository<Employee, Integer>{

	

}
