package com.lata.capdemos.inheritance;

interface MyInf
{
	int i=10;
	void get();
	void put();
	static void set()
	{
		System.out.println("default definition of set()");
	}
}
class A implements MyInf
{
	public void get()
	{
		System.out.println("get of A");
	}
	public void put()
	{
		System.out.println("put of A");
	}
	@Override
	public void set()
	{
		System.out.println("A definition of set()");
	}
}
class B implements MyInf
{
	public void get()
	{
		System.out.println("get of B");
	}
	public void put()
	{
		System.out.println("put of B");
	}
}
public class JDK8InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
