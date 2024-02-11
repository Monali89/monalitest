package Basics;

public class Employee  extends Project
{
	String name="Monali";
	int id= 001;
	String gender;
	String address;
	byte DOB;
	Employee()
	{
		System.out.println("Default constructor");
	}
	Employee(String a, int b, String c, String d )
	{
		name=a;
		id=b;
		gender=c;
		address=d;
		 
		System.out.println("Employee Details");
	}
	static void e_details()
	{
		System.out.println("Employee details");
	}
	void e_display()
	{
		int id=67;
	System.out.println("Employee display" +id);
	}
	static
	{
		System.out.println("SIB");
	}
	{
		System.out.println("IIB");
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Employee e2=new Employee("Monali", 001, "female","XYZ");
		System.out.println(e1.name+ " "+e1.id+"  " +e1.gender +"    " +e1.address);
		e_details();
		e1.e_display();
	}		 
		
	public class Project  
	{
		int projectno;//global
		String name;
		String location;
		static void e_details() 
		{
			System.out.println("project details");
			int wohrs=9;
		System.out.println(wohrs);
		 
		}
	
	}
}
