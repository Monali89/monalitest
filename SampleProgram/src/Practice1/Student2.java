package Practice1;
//this keyword

 class Student2
{
int age=23;
String name="monali";
//int age;
//String name;

void add(int age, String name)
{
	this.age=age;
	this.name=name;
}
void display()
{
	System.out.println(+age);
	System.out.println(name);
}
	public static void main(String[] args)
	{
	Student2 s2=new Student2( );
	//s2.add(12,"trisha");
	s2.display();
	}

}
