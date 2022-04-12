package com.example.microservices.service;
import java.util.List;

import com.example.microservices.model.Employee;
import org.springframework.stereotype.Service;


public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	
	List<Employee> showAllEmployees();
	
	Employee findEmployee(int id);
	
	List<Employee> findEmployeeByName(String name);
}
