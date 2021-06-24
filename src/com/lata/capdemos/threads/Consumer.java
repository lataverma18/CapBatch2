package com.lata.capdemos.threads;

public class Consumer implements Runnable{
	Buffer b;
	Consumer(Buffer b)
	{
		this.b=b;
	}
	@Override
	public void run() {
	synchronized(b)
	{
		for(int i=1;i<=10;i++)
		{
			if(!b.isFull())
				try {
					b.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println("Consumer consuming bit:"+i);
			b.setFull(false);
			b.notify();
		}
	}	
	}
}
