package com.lata.onetooneunidemo.dao;

import javax.persistence.EntityManager;

import com.lata.onetooneunidemo.entities.Address;

public class AddressDaoImpl implements IAddressDao {
	EntityManager em;
	public AddressDaoImpl()
	{
		em=JPAUtil.getEMF().createEntityManager();
	}
	public void insert(Address address) {
		em.getTransaction().begin();
    	
		em.persist(address);
		
		em.getTransaction().commit();
		
		System.out.println("Inserted Successfully!!!");
		
	}

}
