package com.lata.onetomany;


import java.util.LinkedHashSet;
import java.util.Set;

import com.lata.onetomany.dao.EmployeeDaoImpl;
import com.lata.onetomany.dao.IEmployeeDao;
import com.lata.onetomany.entities.Department;
import com.lata.onetomany.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Department d1=new Department();
        d1.setDname("Prod");
        d1.setDmanager("Lalit");
        
        Employee emp1=new Employee();
        emp1.setName("Ronit");
        emp1.setSalary(56000);
        
        Employee emp2=new Employee();
        emp2.setName("Rohit");
        emp2.setSalary(45000);
        
        Set<Employee> s=new LinkedHashSet<>();
        s.add(emp1);
        s.add(emp2);
        d1.setEmployees(s);
        
        IEmployeeDao ed=new EmployeeDaoImpl();
        ed.insert(d1);
        
    }
}
