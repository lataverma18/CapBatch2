package com.lata.capdemos.client;

import java.util.Scanner;

public class StringDemo3 {

	public static void main(String[] args) {
		String str="1A2345";
		Scanner sc=new Scanner(str);
		if(sc.hasNextInt())
			System.out.println(Integer.parseInt(str));
		
	}
}
