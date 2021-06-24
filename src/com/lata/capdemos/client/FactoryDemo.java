package com.lata.capdemos.client;

//Factory Pattern
class A1
{
	private A1()
	{
		
	}
	public static A1 get()
	{
		A1 a1=new A1();
		return a1;
	}
}
public class FactoryDemo {

	public static void main(String[] args) {
		
	A1 a1=A1.get();
	
	}
}
