package com.lata.capdemos.threads;

public class Machine implements Runnable{
	Printer p;
	Machine(Printer p)
	{
		this.p=p;
	}
	@Override
	public void run() {
		synchronized(p)
		{
			p.printing();
		}
	}
}
