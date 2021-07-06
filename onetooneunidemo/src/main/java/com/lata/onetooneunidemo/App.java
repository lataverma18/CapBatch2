package com.lata.onetooneunidemo;

import com.lata.onetooneunidemo.dao.AddressDaoImpl;
import com.lata.onetooneunidemo.dao.EmployeeDaoImpl;
import com.lata.onetooneunidemo.dao.IAddressDao;
import com.lata.onetooneunidemo.dao.IEmployeeDao;
import com.lata.onetooneunidemo.entities.Address;
import com.lata.onetooneunidemo.entities.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		
		Employee emp=new Employee();
		emp.setEmpName("Ronit");
		emp.setEmpSalary(45000);
		
		Address ad=new Address();
		ad.setAddress("e-1407/49");
		ad.setCity("Fbd");
		ad.setState("Delhi/NCR");
		ad.setZipcode(121001);
		ad.setEmployee(emp);

		IAddressDao ed=new AddressDaoImpl();
		ed.insert(ad);
		System.out.println("Ending of the Program!!!");
	}
}
