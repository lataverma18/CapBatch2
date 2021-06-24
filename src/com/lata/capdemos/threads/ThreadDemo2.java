package com.lata.capdemos.threads;

public class ThreadDemo2 {

	public static void main(String[] args) {
		Runnable th1=()->{
			for(int i=1;i<=10;i++)
				System.out.println(i);
		};
		
	Thread th=new Thread(th1);
	th.start();
	
	}

}
