package com.lata.onetomany.dao;

import javax.persistence.EntityManager;

import com.lata.onetomany.entities.Department;
import com.lata.onetomany.entities.Employee;

public class EmployeeDaoImpl implements IEmployeeDao{

	EntityManager em;
	public EmployeeDaoImpl()
	{
		em=JPAUtil.getEMF().createEntityManager();
	}
	public void insert(Department dept) {
		em.getTransaction().begin();
    	
		em.persist(dept);
		
		em.getTransaction().commit();
		
		System.out.println("Inserted Successfully!!!");
	}

}
