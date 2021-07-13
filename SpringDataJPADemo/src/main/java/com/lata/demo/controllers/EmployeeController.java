package com.lata.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lata.demo.entities.Employee;
import com.lata.demo.services.IEmployeeService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api("This is for all kind of operations performed on Employee")
@RestController
public class EmployeeController {
	@Autowired
	IEmployeeService es;
	@ApiOperation("This is fetching employee on the basis of employee Id")
	
	@ApiResponses(value= {
			@ApiResponse(code = 200, message = "Successfully retrieved list"),
		    @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
		    @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
		    @ApiResponse(code = 404, message = "The resource for this given id is not found")
	})
	@GetMapping("employees/{id}")
	public Employee getEmployeeById(@PathVariable("id") int eid)
	{
		return es.getEmpById(eid);
	}
	
	@ApiOperation("This is fetching employee on the basis of employee Name")
	@GetMapping("employees/name/{name}")
	public Employee getEmployeeByName(@PathVariable("name") String ename)
	{
		return es.getEmpByName(ename);
	}
}
