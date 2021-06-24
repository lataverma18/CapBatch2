package com.lata.capdemos.client;


import com.lata.capdemos.beans.Employee;
import com.lata.capdemos.enums.Department;

public class Executor {
	public static void main(String []args)
	{
		Employee emp=new Employee();
		emp.setEmployeeId(101);
		emp.setEmployeeName("Ronit");
		emp.setEmployeeDept(Department.TRAINING);
		
		System.out.println(emp.getEmployeeId()+"\t"+emp.getEmployeeName()+"\t"+emp.getEmployeeDept());
	}
}
