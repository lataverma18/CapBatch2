package com.lata.springdemo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean 
{
	private int eid;
	private String ename;
	private double esalary;
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int eid, String ename, double esalary, Address address) {
		System.out.println("Constructor is called!!!");
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", address=" + address + "]";
	}

	public void display()
	{
		System.out.println(eid+"\t"+ename+"\t"+esalary+"\t"+address);
	}

	void initMethod()
	{
		System.out.println("INIT Method!!!");
	}
	void beforeDestroy()
	{
		System.out.println("Before Destroy Method!!!");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialiizing Bean");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying Bean");
		
	}
}
