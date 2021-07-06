package com.lata.jpalayereddemo;

import java.time.LocalDate;
import java.util.List;

import com.lata.jpalayereddemo.dto.EmployeeDto;
import com.lata.jpalayereddemo.services.EmployeeServiceImpl;
import com.lata.jpalayereddemo.services.IEmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      EmployeeDto ed=new EmployeeDto();
      
      IEmployeeService es=new EmployeeServiceImpl();
     /* boolean isSaved=es.saveEmployee(ed);
    if(isSaved)
    	  System.out.println("Employee inserted successfully");
      else
    	  System.out.println("Failed to insert employee");*/
      
      List<EmployeeDto> emps=es.getAllEmployees();
      System.out.println("Fetched");
      emps.forEach(System.out::println);
      System.out.println(es.getEmployeeByName("Rita"));
      System.out.println("Employees Joined last month are:");
      List<EmployeeDto> ledto=es.getEmployeesInRange( LocalDate.of(2021,06,01), LocalDate.now());
      ledto.forEach(System.out::println);
      
    }
}
