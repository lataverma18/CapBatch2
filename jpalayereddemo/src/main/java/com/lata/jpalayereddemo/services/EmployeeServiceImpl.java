package com.lata.jpalayereddemo.services;

import java.time.LocalDate;
import java.util.List;

import com.lata.jpalayereddemo.dao.EmployeeDaoImpl;
import com.lata.jpalayereddemo.dao.IEmployeeDao;
import com.lata.jpalayereddemo.dto.EmployeeDto;

public class EmployeeServiceImpl implements IEmployeeService{

	IEmployeeDao ed;
	public EmployeeServiceImpl()
	{
		ed=new EmployeeDaoImpl();
	}

	public boolean saveEmployee(EmployeeDto employee) {
		return ed.saveEmployee(employee);
	}
	public EmployeeDto getEmployeeByName(String name) {
		return ed.getEmployeeByName(name);
	}
	public List<EmployeeDto> getEmployeesInRange(LocalDate startDate, LocalDate endDate) {
		return ed.getEmployeesInRange(startDate, endDate);
	}
	public List<EmployeeDto> getAllEmployees() {
		System.out.println("Service passed");
		return ed.getAllEmployees();
	}

}
