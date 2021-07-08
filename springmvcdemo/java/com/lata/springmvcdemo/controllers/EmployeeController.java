package com.lata.springmvcdemo.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lata.springmvcdemo.dao.EmployeeDaoImpl;
import com.lata.springmvcdemo.dao.IEmployeeDao;
import com.lata.springmvcdemo.entities.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeDaoImpl ed;
	
	@GetMapping(value="/employees",produces="application/json")
	public List<Employee> getEmps()
	{
		return ed.getAllEmployees();
	}
}
