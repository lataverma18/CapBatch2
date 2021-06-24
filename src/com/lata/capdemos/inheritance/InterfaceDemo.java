package com.lata.capdemos.inheritance;
@FunctionalInterface
interface Inffff
{
	void get();
	//void put();
}
interface Marker
{
}
interface Button
{
	int i=10;
	void on();
	void off();
}

interface ButtonFrame extends Button
{
	void typeOfFrame();
}
class Desktop implements ButtonFrame
{

	@Override
	public void on() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void off() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void typeOfFrame() {
		// TODO Auto-generated method stub
		
	}
	
}
class Projector implements Button
{
	public void on()
	{
		System.out.println("Projector gets switch on");
	}
	public void off()
	{
		System.out.println("Projector gets switch off");
	}
}
public class InterfaceDemo {

	public static void main(String[] args) {
	Button btn=new Projector();  //Upcasting
	btn.on();
	btn.off();
	System.out.println(Button.i);
	}
}
