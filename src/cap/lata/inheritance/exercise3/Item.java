package cap.lata.inheritance.exercise3;

import java.time.LocalTime;

abstract public class Item {
private int identificationNumber;
private String title;
private int noOfCopies;
static Item[] items=new Item[10];
static int index=0;

public Item(int identificationNumber, String title, int noOfCopies) {
	super();
	this.identificationNumber = identificationNumber;
	this.title = title;
	this.noOfCopies = noOfCopies;
}
public int getIdentificationNumber() {
	return identificationNumber;
}
public void setIdentificationNumber(int identificationNumber) {
	this.identificationNumber = identificationNumber;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getNoOfCopies() {
	return noOfCopies;
}
public void setNoOfCopies(int noOfCopies) {
	this.noOfCopies = noOfCopies;
}
@Override
public String toString() {
	return "Item [identificationNumber=" + identificationNumber + ", title=" + title + ", noOfCopies=" + noOfCopies
			+ "]";
}

public void checkIn() {
	System.out.println("Checking In for Videos at : "+LocalTime.now());
	
}

abstract void print();
abstract void checkOut();

public void addItem() {
	items[index]=this;
	index++;
}
}
