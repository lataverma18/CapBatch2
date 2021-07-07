package com.lata.springdemo.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee implements InitializingBean,DisposableBean 
{
	private int eid;
	private String ename;
	private double esalary;
						
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	
	@Autowired
	@Qualifier("add1")
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getEid() {
		return eid;
	}
	@Value("101")
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	@Value("Ronit")
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsalary() {
		return esalary;
	}
	@Value("56000")
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
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary ;
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
