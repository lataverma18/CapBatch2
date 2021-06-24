package cap.lata.inheritance.exercise3;

public class JournalPaper extends WrittenItem {
private int yearPublished;
public JournalPaper(int identificationNumber, String title, int noOfCopies, String author) {
	super(identificationNumber, title, noOfCopies, author);
}
public int getYearPublished() {
	return yearPublished;
}
public void setYearPublished(int yearPublished) {
	this.yearPublished = yearPublished;
}
@Override
void print() {
	// TODO Auto-generated method stub
	
}
@Override
void checkIn() {
	// TODO Auto-generated method stub
	
}
@Override
void checkOut() {
	// TODO Auto-generated method stub
	
}
@Override
void addItem() {
	// TODO Auto-generated method stub
	
}

}
