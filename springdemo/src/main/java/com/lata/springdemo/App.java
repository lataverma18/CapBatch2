package com.lata.springdemo;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lata.springdemo.beans.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      AbstractApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
      Employee emp=ac.getBean(Employee.class);
      Employee emp1=ac.getBean(Employee.class,102,"Farida",12000,null);
      emp.display();
      emp1.display();
    /*  CollectionBean cb=ac.getBean(CollectionBean.class);
      System.out.println(cb.getProperties());*/
      ac.registerShutdownHook();
    }
}
