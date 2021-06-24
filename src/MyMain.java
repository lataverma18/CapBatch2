class Responsibility
{
	void displayResponsibilities(Employee e)
	{
		//e.mgrTask();  //Error
		
		if(e instanceof Manager)
		{
			Manager m=(Manager)e;		//Backward Downcasting
			m.mgrTask();
		}
		else if(e instanceof Developer)
		{
			Developer d=(Developer)e;		//Backward Downcasting
			d.devTask();
		}
		else 
		{
			e.empTask();
		}
	}
}
class Employee
{
	int id;
	String name;

	Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}

	void empTask()
	{
		System.out.println("General Employee's Responsibilities");	
	}
	
	public String toString()
	{
		return id+"\t"+name;
	}
}

class Manager extends Employee
{
	String dept;
	Manager(int id,String name,String dept)
	{
		super(id,name);
		this.dept=dept;
	}
	
	void mgrTask()
	{
		System.out.println("Responsibility of Manager");
	}
	
	public String toString()
	{
		return super.toString()+"\t"+dept;
	}
}
class Developer extends Employee
{
	String technology;
	Developer(int id,String name,String technology)
	{
		super(id,name);
		this.technology=technology;
	}
	
	void devTask()
	{
		System.out.println("Responsibility of Developer");
	}
	
	public String toString()
	{
		return super.toString()+"\t"+technology;
	}
}
public class MyMain
{
	public static void main(String []args)
	{
		Employee emp1=new Employee(102,"Rohit");
		Manager mgr1=new Manager(101,"Ronit","Prod");
		Developer dev1=new Developer(103,"Rita","J2EE");
		
		
		Responsibility resp=new Responsibility();
		resp.displayResponsibilities(emp1);
		resp.displayResponsibilities(mgr1);
		resp.displayResponsibilities(dev1);
		
		int []arr1= {20,30,40,50,60,70};
		int []arr2=new int[6]; 
		
		System.arraycopy(arr1, 2, arr2, 3, 2);
		for(int temp:arr2)
		System.out.println(temp);
		
		
		/*Manager mgr1=new Manager(101,"Ronit","Prod");
		System.out.println(mgr1);
		
		Employee emp1=new Manager(102,"Rohit","Sales");  //Upcasting   
		//System.out.println(emp1.toString());				//Dynamic Linking or Dynamic Method Dispatching
		
		Manager mgr2=(Manager)emp1;  //Downcasting  Backward Downcasting
		System.out.println(mgr2);*/
	}
}

