
public class WrapperDemo {
public static void main(String []args)
{
	/*int number=678;
	System.out.println(Integer.reverse(number));*/
	int i1=100;
	Integer i2=100;				//AutoBoxing 
	Integer i4=100;
	
	Integer i3=new Integer(100);
	Integer i5=new Integer(10);
	System.out.println(i3.intValue());
	
	System.out.println(i3==i5);
	System.out.println(i2==i4);
	
	System.out.println(i1==i2);				//AutoUnBoxing  (i2--Value)
	System.out.println(i2==i3);
	System.out.println(i3==i1);				//AutoUnBoxing  (i3--Value)
	
	System.out.println(Integer.MIN_VALUE);
	System.out.println(Integer.MAX_VALUE);
	System.out.println(Integer.compare(2, 20));
	System.out.println(i5.compareTo(i3));

}
}
