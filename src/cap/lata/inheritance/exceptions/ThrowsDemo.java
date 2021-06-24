package cap.lata.inheritance.exceptions;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsDemo {

	static void get() throws SQLException
	{
		int a=10;
		int b=2;
		int c=a/b;
		System.out.println(c);
			throw new SQLException();
	}
	public static void main(String[] args) throws SQLException {
		System.out.println("Starting of Main");
			get();
		System.out.println("Ending of Main");
	}
}
