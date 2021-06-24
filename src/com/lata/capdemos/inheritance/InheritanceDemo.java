package com.lata.capdemos.inheritance;

public class InheritanceDemo {
	public static void main(String[] args) {
		/*Employee mgr=new Manager(101,"Ronit","Prod");  //Constructor of Manager and Employee 
		mgr.get();
		mgr=new Developer(102,"Rohit");
		mgr.get();
		//mgr.getOldGet();
		System.out.println(mgr.getEmployeeId()+"\t"+mgr.getEmployeeName()+"\t");//+mgr.getDepartmentName());
		*/
		Student s=new Student(101,"Geeta",new Address("E-12/3","New Delhi","Delhi",110011));
		System.out.println(s);
		
		/*
		 * System.out.println(s.getStuId()+"\t"+s.getStuName()+"\t"+s.getAddress());
		System.out.println(s.toString());*/
		}
}
