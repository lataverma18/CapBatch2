package com.lata.capdemos.threads;

public class InterThComm {
	public static void main(String []args)
	{
		Buffer b=new Buffer();
		
		Thread producer=new Thread(new Producer(b));
		
		Thread consumer=new Thread(new Consumer(b));
		
		producer.start();
		consumer.start();
	}
}
