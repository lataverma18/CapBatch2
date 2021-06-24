package com.lata.capdemos.threads;

public class Producer implements Runnable {
	Buffer b;
	Producer(Buffer b)
	{
		this.b=b;
	}
	public void run()
	{
		synchronized(b)
		{
		for(int i=1;i<=10;i++)
		{
		if(b.isFull())
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("Producer producing bit"+i);
		b.setFull(true);
		b.notify();
		}
		}
	}
}
