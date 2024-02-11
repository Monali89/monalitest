package Practice1;
//super() calling statement constructor
class Student 
{
	Student()
	{
		System.out.println("Student constructor");
	}
}
public class Person extends Student
{
	Person()
	{
		super();
		System.out.println("Person constructor");	
	}

	public static void main(String[] args)
	{
		Person p1=new Person();
		

	}

}
