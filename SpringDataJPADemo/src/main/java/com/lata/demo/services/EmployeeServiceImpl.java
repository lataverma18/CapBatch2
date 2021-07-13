package com.lata.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lata.demo.entities.Employee;
import com.lata.demo.repository.IEmployeeRepository;
@Service("es")
public class EmployeeServiceImpl implements IEmployeeService{

	@Autowired
	IEmployeeRepository er;
	@Override
	public Employee getEmpById(int eid) {
		Optional<Employee> emp=er.findById(eid);
		if(emp.isPresent())
			return emp.get();
		else
			return null;
	}
	@Override
	public Employee getEmpByName(String ename) {
		return er.findByEname(ename);
	}
}
