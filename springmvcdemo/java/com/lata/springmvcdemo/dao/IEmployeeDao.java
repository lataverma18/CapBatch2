package com.lata.springmvcdemo.dao;

import java.util.List;

import com.lata.springmvcdemo.entities.Employee;

public interface IEmployeeDao {
	List<Employee> getAllEmployees();
	String insert(Employee emp);
}
