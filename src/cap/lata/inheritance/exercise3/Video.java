package cap.lata.inheritance.exercise3;

import java.time.LocalTime;

public class Video extends MediaItem{
	private String director,genre,yearReleased;

	public Video(int identificationNumber, String title, int noOfCopies, int runtime, String director, String genre,
			String yearReleased) {
		super(identificationNumber, title, noOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(String yearReleased) {
		this.yearReleased = yearReleased;
	}

	@Override
	void print() {
		System.out.println(toString());
		System.out.println(getRuntime());
		System.out.println(director);
		System.out.println(genre);
		System.out.println(yearReleased);
	}
	@Override
	void checkOut() {
		//User input for total time to spend in library
		
		System.out.println("Checkout time would be: "+(LocalTime.now().getHour())+2);
	}
}
