package com.lata.springmvcdemo.dao;

import java.util.List;

import com.lata.springmvcdemo.entities.Employee;

public interface IEmployeeDao {
	List<Employee> getAllEmployees();
	Employee getEmployeeById(int id);
	String insert(Employee emp);
	String updateEmp(int id,Employee emp);
	String deleteEmp(int id);
}
