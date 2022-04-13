package com.example.microservices.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.microservices.model.Employee;
import com.example.microservices.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@RequestMapping(value ="/employee", method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee employee)
	{
		try
		{
			return service.saveEmployee(employee);
		}
		catch(Exception e)
		{
			return null;
		}
		
	}
	
	@RequestMapping(value ="/employee", method = RequestMethod.GET)
	public List<Employee> getALLEmployees()
	{
		return service.showAllEmployees();
	}
	@RequestMapping(value ="/employeee", method = RequestMethod.GET)
	public ResponseEntity<Employee> addEmployee(@RequestParam int id)
	{
		Employee employee = service.findEmployee(id);
		if(employee == null)
		{
			return ResponseEntity.notFound().build();
		}
		else {
			return ResponseEntity.ok().body(employee);
		}
	}
	@RequestMapping(value ="/login", method = RequestMethod.GET)
	public ResponseEntity addEmployee(@RequestParam String name,@RequestParam String password)
	{
		List<Employee> employees = service.findEmployeeByName(name);
		return new ResponseEntity<>(employees, HttpStatus.OK);
		
		
	}
}
