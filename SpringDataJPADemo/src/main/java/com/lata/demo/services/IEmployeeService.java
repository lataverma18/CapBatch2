package com.lata.demo.services;



import com.lata.demo.entities.Employee;
public interface IEmployeeService {
	Employee getEmpById(int eid);
	Employee getEmpByName(String ename);
}
