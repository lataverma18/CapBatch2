package com.lata.capdemos.util;
import static java.lang.Math.*;
import java.util.*;
import java.util.concurrent.*;

public class MathUtility {
	enum color { red, green, blue }
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int number=sc.nextInt();
		System.out.println(PI);
		System.out.println(abs(-35));
		System.out.println(random());
		System.out.println(pow(2, 3));
		System.out.println(sqrt(2));
		
		final int i;
		
		i=10;
		 
		color c; 
		c = color.blue;
		System.out.println(c);


	}
}
