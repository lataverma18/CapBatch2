package cap.lata.inheritance.exceptions;

public class ExceptionDemo1 {
	public static void main(String []args)
	{
		System.out.println("Starting of the Program");
		int a=10;
		int b=2;
		try				//Monitor the Exception
		{
			int c=a/b;
			System.out.println("Output is: "+c);
			throw new ArrayIndexOutOfBoundsException(); 
			//System.out.println(args[0]);
			
		}
		catch(ArrayIndexOutOfBoundsException aie)
		{
			System.out.println("No Command line argument passed!!!");
		}
		/*catch(Throwable e)		//General Catch Block
		{
			System.out.println(e);
		}*/
		finally
		{
			System.out.println("Closing Operations!!!");
		}
		System.out.println("Ending of the Program");
	}
}
