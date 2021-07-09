package com.lata.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.lata.springmvcdemo.entities.Employee;
import com.lata.springmvcdemo.exceptions.IdNotFoundException;
@Repository("ed")
public class EmployeeDaoImpl implements IEmployeeDao {

	private static final String EXP_MESSAGE="Id is not found!!!";

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
	
	@Override
	public Employee getEmployeeById(int id) {
		Optional<Employee> emp=emps.stream().filter(obj->obj.getId()==id).findAny();
		if(emp.isPresent())
			return emp.get();
		else
			throw new IdNotFoundException(EXP_MESSAGE);
	}
	@Override
	public String updateEmp(int id, Employee emp) {
		
		Optional<Employee> result=emps.stream().filter(obj->obj.getId()==id).findAny();
		if(result.isPresent())
		{
			int index=emps.indexOf(result.get());
			emps.set(index, emp);
			return "Updated Successfully!!!";
		}
		else
			throw new IdNotFoundException(EXP_MESSAGE);
	}
	@Override
	public String deleteEmp(int id) {
		Optional<Employee> result=emps.stream().filter(obj->obj.getId()==id).findAny();
		if(result.isPresent())
		{
			emps.remove(result.get());
			return "Deleted";
		}
		else
			throw new IdNotFoundException(EXP_MESSAGE);
	}

}
