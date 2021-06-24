package com.lata.capdemos.inheritance;
class CertainOperation
{
	void performCertainOps(Object obj)
	{
		if(obj instanceof MarkerInf)
			System.out.println("Operation is performed on obj"+ obj);
		else
			System.out.println("Operation cannot be performed as it is not Marked");
	}
}
class A1 implements MarkerInf
{
	
}
class B1
{
	
}
class C1 extends B1 implements Inf1,Inf2 
{
	
}


public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		CertainOperation co=new CertainOperation();
		A1 a1=new A1();
		co.performCertainOps(a1);
		B1 b1=new B1();
		co.performCertainOps(b1);
		C1 c1=new C1();
		co.performCertainOps(c1);
		
		System.out.println(InterfaceForConstants.IDERRORMSG);
	}
}
