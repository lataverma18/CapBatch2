package com.lata.springdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lata.springdemo.beans.Employee;

@Repository("ed")
public class EmployeeDaoImpl implements IEmployeeDao {

	List<Employee> elist=new ArrayList<>();
	
	public EmployeeDaoImpl()
	{
		elist.add(new Employee(101,"Ronit",23000,null));
		elist.add(new Employee(102,"Rohit",32000,null));
		elist.add(new Employee(103,"Rita",25000,null));
		elist.add(new Employee(104,"Sita",34000,null));
		elist.add(new Employee(105,"Gita",40000,null));
	}
	@Override
	public void insert(Employee emp) {
	
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return elist;
	}

}
