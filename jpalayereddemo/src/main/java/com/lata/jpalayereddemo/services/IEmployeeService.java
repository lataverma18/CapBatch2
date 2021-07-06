package com.lata.jpalayereddemo.services;

import java.time.LocalDate;
import java.util.List;

import com.lata.jpalayereddemo.dto.EmployeeDto;

public interface IEmployeeService {
	EmployeeDto getEmployeeByName(String name);
	boolean saveEmployee(EmployeeDto employee);
	List<EmployeeDto> getEmployeesInRange(LocalDate startDate,LocalDate endDate);
	List<EmployeeDto> getAllEmployees();
}
