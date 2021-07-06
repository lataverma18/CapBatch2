package com.lata.jpalayereddemo.dao;

import java.time.LocalDate;
import java.util.List;

import com.lata.jpalayereddemo.dto.EmployeeDto;

public interface IEmployeeDao {
	EmployeeDto getEmployeeByName(String name);
	boolean saveEmployee(EmployeeDto employee);
	List<EmployeeDto> getEmployeesInRange(LocalDate startDate,LocalDate endDate);
	List<EmployeeDto> getAllEmployees();
}
