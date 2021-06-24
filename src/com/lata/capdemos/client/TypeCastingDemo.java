package com.lata.capdemos.client;

class A
{
	
}
class B extends A
{
	
}
public class TypeCastingDemo {
	public static void main(String []args)
	{
		String str="Hello";
		Object obj=str;			//Upcasting  -->Implicitly
		System.out.println(obj);
		
		String str1=(String) obj;		//Downcasting or Backward Typecasting
		System.out.println(str1);
	}
}
