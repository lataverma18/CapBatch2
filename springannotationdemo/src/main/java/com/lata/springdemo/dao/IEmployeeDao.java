package com.lata.springdemo.dao;

import java.util.List;

import com.lata.springdemo.beans.Employee;

public interface IEmployeeDao {
	void insert(Employee emp);
	List<Employee> getAllEmployees();
}
