package cap.lata.inheritance.exercise3;

public class Executor {

	public static void main(String[] args) {
		Book b1;
		CD cd;
		JournalPaper jp;
		Book b;
		
		b1.addItem();
		cd.addItem();
		jp.addItem();
		b.addItem();
		
		for(Item temp: Item.items)
		{
			temp.checkIn();
			temp.print();
			temp.checkOut();
		}
	}
}
