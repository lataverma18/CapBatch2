package com.lata.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lata.springmvcdemo.entities.Employee;
@Repository("ed")
public class EmployeeDaoImpl implements IEmployeeDao {

	List<Employee> emps=new ArrayList<>();
	public EmployeeDaoImpl()
	{
		Employee emp1=new Employee(101,"Ronit");
		
		Employee emp2=new Employee(102,"Rita");
		
		emps.add(emp1);
		emps.add(emp2);
	}
	@Override
	public List<Employee> getAllEmployees() {
		return emps;
		
	}

	@Override
	public String insert(Employee emp) {
		emps.add(emp);
		return "Inserted Successfully";
	}

}
