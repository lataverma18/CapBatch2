package com.lata.capdemos.threads;

public class Printer {
	void printing()
	{
		System.out.println("Printing Started for Machine"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Printing Ended for Machine"+Thread.currentThread().getName());
	}
}
