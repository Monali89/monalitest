package This;
// Using ‘this’ keyword to refer to current class instance variables
public class Test {
	int a,b;
	Test(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("a = " + a + "  b = " + b);
	}
	public static void main(String[] args)
	{
		 Test t1=new Test(10,20);
		 t1.display();
	}
}