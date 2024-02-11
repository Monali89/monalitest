package This;
// Using this() to invoke current class constructor
public class Test1 
{
int a,  b;
Test1()
{
	this(10,12);
	System.out.println("default constructor");
}
Test1(int a,int b)
{
	this.a=a;
	this.b=b;
	System.out.println("parameterized");
}
public static void main(String[] args) {
	Test1 t1=new Test1();
	//Test1 t2=new Test1(12,23);
	
}
}
