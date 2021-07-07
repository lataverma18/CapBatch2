package com.lata.springdemo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lata.springdemo.beans.Address;
import com.lata.springdemo.beans.Employee;
import com.lata.springdemo.config.MyBeanConfig;
import com.lata.springdemo.controller.EmployeeController;
import com.lata.springdemo.services.EmployeeServiceImpl;
import com.lata.springdemo.services.IEmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext ac=new AnnotationConfigApplicationContext(MyBeanConfig.class);
     /* EmployeeController ec=ac.getBean(EmployeeController.class);
      ec.getEmps().forEach(System.out::println);*/
      Address add=ac.getBean(Address.class);
      System.out.println(add);
    }
}
