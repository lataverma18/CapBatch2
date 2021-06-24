package cap.lata.inheritance.exercise3;

abstract public class MediaItem extends Item{
private int runtime;

public MediaItem(int identificationNumber, String title, int noOfCopies, int runtime) {
	super(identificationNumber, title, noOfCopies);
	this.runtime = runtime;
}

public int getRuntime() {
	return runtime;
}

public void setRuntime(int runtime) {
	this.runtime = runtime;
}


}
