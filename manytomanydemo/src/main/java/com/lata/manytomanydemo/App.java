package com.lata.manytomanydemo;

import java.util.LinkedHashSet;
import java.util.Set;

import com.lata.manytomanydemo.dao.CustomerDaoImpl;
import com.lata.manytomanydemo.dao.ICustomerDao;
import com.lata.manytomanydemo.entities.Customer;
import com.lata.manytomanydemo.entities.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Product p1=new Product();
    	p1.setPname("Face wash");
    	p1.setPrice(400);
    	
    	Product p2=new Product();
    	p2.setPname("Charger");
    	p2.setPrice(800);
    	
    	Product p3=new Product();
    	p3.setPname("Bed Sheet");
    	p3.setPrice(2000);
    	
    	Customer c1=new Customer();
    	c1.setCustName("Ronit");
    	Set<Product> setP1=new LinkedHashSet<>();
    		setP1.add(p1);
    		setP1.add(p3);
    	c1.setProducts(setP1);
    	
    	Customer c2=new Customer();
    	c2.setCustName("Rohit");
    	Set<Product> setP2=new LinkedHashSet<>();
			setP2.add(p2);
			setP2.add(p3);
		c2.setProducts(setP2);
		
		ICustomerDao cd=new CustomerDaoImpl();
		cd.insert(c1);
		cd.insert(c2);
    	
    }
}
