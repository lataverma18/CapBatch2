package com.lata.capdemos.client;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
	Date d=new Date();
	System.out.println(d);
	System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());
	}
}
