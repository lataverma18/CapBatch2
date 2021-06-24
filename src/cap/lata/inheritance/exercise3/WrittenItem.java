package cap.lata.inheritance.exercise3;

abstract public class WrittenItem extends Item{
private String author;

public WrittenItem(int identificationNumber, String title, int noOfCopies, String author) {
	super(identificationNumber, title, noOfCopies);
	this.author = author;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}
}
