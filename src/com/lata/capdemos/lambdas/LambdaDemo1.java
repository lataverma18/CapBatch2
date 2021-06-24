package com.lata.capdemos.lambdas;

@FunctionalInterface
interface Inf1					// Supplier Functional Interface
{
	double getPI();
}

@FunctionalInterface
interface Inf2					// Consumer Functional Interface
{
	void getInc(int val);
}

@FunctionalInterface
interface Inf3					// Predicate Functional Interface
{
	boolean checkGreaterThan10(int val);
}

@FunctionalInterface
interface Inf4					// Function Functional Interface
{
	String transform(int val);
}

public class LambdaDemo1 {
	public static void main(String[] args) {
		Inf1 i1=()->Math.PI;
		System.out.println(i1.getPI());
		
		Inf2 i2=val->System.out.println(++val);
		i2.getInc(10);

		Inf3 i3=val->val>10;
		System.out.println(i3.checkGreaterThan10(2));
		
		Inf4 i4=val->"Value is:"+val;
		System.out.println(i4.transform(20));
	}
}
