package com.lata.capdemos.threads;


public class ThreadDemo1 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread mth=new MyThread();
		mth.setName("ForLoopThread");
		mth.setPriority(10);
		mth.start();
		
		try {
			mth.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(mth);
		System.out.println("Active No of Thread-"+Thread.activeCount());
	}
}
