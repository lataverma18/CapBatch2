package com.lata.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.lata.springdemo.beans.Employee;
import com.lata.springdemo.services.IEmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	IEmployeeService es;
	public List<Employee> getEmps()
	{
		return es.getAllEmployees();
	}
	
}
