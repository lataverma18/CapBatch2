
class A
{
	static int count=0;
	
	A()		//Default Constructor
	{
		count++;
	}

}


public class ConstructorDemo
{
	public static void main(String []args)
	{
		A a1=new A();
		A a2=new A();
		A a3=new A();
		
		System.out.println(A.count);
	}
}