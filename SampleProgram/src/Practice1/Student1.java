package Practice1;
//this() calling statement
class Student1
{
Student1(int a)	
{
	System.out.println("integert constructor");
}

 Student1 (String name)
{
	// this(20);
	 System.out.println("String constructor");
}
Student1()
{
	//this("monali");
	System.out.println("default constructor");
}
	public static void main(String[] args) 
	{
		Student1 s1=new Student1(); 
	}

}
