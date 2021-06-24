abstract class Inf1
{
	abstract void get();
}
public class AnonymousClassDemo {
public static void main(String ...args)
{
	Inf1 i1=new Inf1() {
		public void get()
		{
			System.out.println("get of A");
		}
	};								 //Upcasting
	
	i1.get();
}
}
