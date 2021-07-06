package com.lata.manytomanydemo.dao;

import javax.persistence.EntityManager;

import com.lata.manytomanydemo.entities.Customer;


public class CustomerDaoImpl implements ICustomerDao{

	EntityManager em;
	public CustomerDaoImpl()
	{
		em=JPAUtil.getEMF().createEntityManager();
	}
	public void insert(Customer cust) {
		em.getTransaction().begin();
    	
		em.persist(cust);
		
		em.getTransaction().commit();
		
		System.out.println("Inserted Successfully!!!");
	}

}
