package com.lata.springdemo.services;

import java.util.List;

import com.lata.springdemo.beans.Employee;

public interface IEmployeeService {
	void insert(Employee emp);
	List<Employee> getAllEmployees();

}
