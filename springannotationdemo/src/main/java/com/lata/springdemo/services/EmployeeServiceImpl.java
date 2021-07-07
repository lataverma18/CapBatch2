package com.lata.springdemo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lata.springdemo.beans.Employee;
import com.lata.springdemo.dao.IEmployeeDao;

@Service("es")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	IEmployeeDao ed;
	
	@Override
	public void insert(Employee emp) {
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return ed.getAllEmployees();
	}

}
