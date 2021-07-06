package com.lata.onetomany.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA-PU");
	
	public static EntityManagerFactory getEMF()
	{
		return emf;
	}
	public static void closeEMF()
	{
		if(emf!=null && emf.isOpen())
			emf.close();
	}

}
