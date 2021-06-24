package com.lata.capdemos.beans;

class A
{
	void get()
	{
		System.out.println("get() of A");
	}
	public void finalize()
	{
		System.out.println("Clean up Operations");
	}
}
class B
{
	void put()
	{
		System.out.println("put() of B");
	}
}
public class MyBeans {
	public static void main(String []args)
	{
			A a1=new A();
			B b1=new B();
			a1.get();
			a1=null;
			System.gc();
			b1.put();
			System.out.println("End of the Program!!!");
	}
}
