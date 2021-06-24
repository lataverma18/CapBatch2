package cap.lata.inheritance.exceptions;

public class StudentApp {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int age=sc.nextInt();
		//try
		//{
			if(age<0)
				throw new NegativeAgeException("Age cannot be negative");
			System.out.println(age);
		/*}
		catch(NegativeAgeException nae)
		{
			System.out.println(nae);
		}*/
	}
}
