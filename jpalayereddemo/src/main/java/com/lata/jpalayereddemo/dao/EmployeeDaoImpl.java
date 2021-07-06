package com.lata.jpalayereddemo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.lata.jpalayereddemo.dto.EmployeeDto;
import com.lata.jpalayereddemo.entities.Employee;
import com.lata.jpalayereddemo.mappers.EmployeeMapper;

public class EmployeeDaoImpl implements IEmployeeDao {

	EntityManager em;
	public EmployeeDaoImpl()
	{
		em=JPAUtil.getEMF().createEntityManager();
	}
	public boolean saveEmployee(EmployeeDto employee) {
	em.getTransaction().begin();
	Employee emp=new Employee();
	emp.setEmpname(employee.getEmpname());
	em.persist(emp);
	em.getTransaction().commit();
	return true;
	}
	public EmployeeDto getEmployeeByName(String name) {
		TypedQuery<Employee> tq=em.createQuery("select employee from Employee employee where employee.empname=:ename",Employee.class);
		tq.setParameter("ename", name);
		Employee emp=tq.getSingleResult();
		return EmployeeMapper.toEmployeeDtoMapping(emp);
	}
	public List<EmployeeDto> getEmployeesInRange(LocalDate startDate, LocalDate endDate) {
		TypedQuery<Employee> tq=em.createQuery("select employees from Employee employees where employees.empdoj between :stDate and :edDate",Employee.class);
		tq.setParameter("stDate",startDate);
		tq.setParameter("edDate",endDate);
		List<Employee> empl=tq.getResultList();
		List<EmployeeDto> l2=new ArrayList<>();
		for(Employee temp:empl)
		{
			l2.add(EmployeeMapper.toEmployeeDtoMapping(temp));
		}
		return l2;
	}
	public List<EmployeeDto> getAllEmployees() {
		TypedQuery<Employee> q=em.createNamedQuery("getAllEmployees", Employee.class);
		List<Employee> l1=q.getResultList();
		List<EmployeeDto> l2=new ArrayList<>();
		for(Employee temp:l1)
		{
			l2.add(EmployeeMapper.toEmployeeDtoMapping(temp));
		}
		
		System.out.println("Dao Passed");
		return l2;
	}
}
