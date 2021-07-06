package com.lata.onetooneunidemo.dao;

import javax.persistence.EntityManager;


import com.lata.onetooneunidemo.entities.Employee;

public class EmployeeDaoImpl implements IEmployeeDao{

	EntityManager em;
	public EmployeeDaoImpl()
	{
		em=JPAUtil.getEMF().createEntityManager();
	}
	public void insert(Employee emp) {
		em.getTransaction().begin();
    	
		em.persist(emp);
		
		em.getTransaction().commit();
		
		System.out.println("Inserted Successfully!!!");
	}

}
