package com.example.microservices.service;

import java.util.List;
import java.util.Optional;

import com.example.microservices.model.Employee;
import com.example.microservices.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeServiceImple implements EmployeeService{
	@Autowired
	EmployeeRepository repository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return repository.save(employee);
	}

	@Override
	public List<Employee> showAllEmployees() {
		return repository.findAll();
	}

	@Override
	public Employee findEmployee(int id) {
		Optional<Employee> employee = repository.findById(id);
		if(employee.isPresent())
		{
			return employee.get();
		}
		return null;
	}

	@Override
	public List<Employee> findEmployeeByName(String name) {
		List<Employee> employee = repository.findByName(name);
		if(employee.isEmpty())
		{
			return null;
		}
		return employee;
	}

}
