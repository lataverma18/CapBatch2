package com.lata.springmvcdemo.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.lata.springmvcdemo.dao.EmployeeDaoImpl;
import com.lata.springmvcdemo.dao.IEmployeeDao;
import com.lata.springmvcdemo.entities.Employee;
import com.lata.springmvcdemo.exceptions.IdNotFoundException;
import com.lata.springmvcdemo.respentities.ErrorInfo;
import com.lata.springmvcdemo.respentities.SuccessInfo;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeDaoImpl ed;
	
	@GetMapping(value="/employees",produces="application/json")
	public List<Employee> getEmps()
	{
		return ed.getAllEmployees();
	}
	
	@GetMapping(value="/employees/{id}",produces="application/json")
	public Employee getEmps(@PathVariable("id") int eid)
	{
		return ed.getEmployeeById(eid);
	}
	
	@PostMapping(value="/employees",produces="application/json")
	public ResponseEntity<SuccessInfo> insertEmp(@RequestBody Employee emp)
	{
		String str=ed.insert(emp);
		return new ResponseEntity<>(new SuccessInfo(HttpStatus.CREATED,201,str),HttpStatus.CREATED);
	}
	
	@PutMapping(value="/employees/{id}")
	public String updateEmp(@PathVariable("id") int eid,@RequestBody Employee emp)
	{
		return ed.updateEmp(eid, emp);
	}
	
	@DeleteMapping(value="/employees/{id}",produces="application/json")
	public String deleteEmp(@PathVariable("id") int eid)
	{
		return ed.deleteEmp(eid);
	}
}
