package com.lata.capdemos.inheritance;

public class Manager extends Employee  {
	int i=20;
private String departmentName;
Manager(int id,String name,String dept)
{
	super(id,name);
	this.departmentName=dept;
	System.out.println("Manager Class Constructor");
}
Manager()
{
	super(0,null);
	System.out.println("MAnager");
}

void getOldGet()
{
	super.get();
	System.out.println(i+"\t"+super.i);
}
@Override
public B get()
{
	System.out.println("get of Manager Class ");
	return null;
}

public String getDepartmentName() {
	return departmentName;
}

public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}

}
