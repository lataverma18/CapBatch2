package com.lata.capdemos.threads;

import java.time.LocalTime;

public class LifeCycleDemo {

	public static void main(String[] args) throws InterruptedException {
		Runnable th1=()->{
			for(int i=1;i<=10;i++)
			{
				System.out.println(LocalTime.now());
				try {
					Thread.sleep(1000);
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};

		Thread th=new Thread(th1);
		System.out.println(th.getState());	//NEW
		th.start();
		System.out.println(th.getState());	//RUNNABLE
		//th.join();
		for(int i=1;i<=5;i++)
			System.out.println(i);
		System.out.println(th.getState());	//TERMINATED
		
	}
}
