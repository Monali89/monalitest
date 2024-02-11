package Practice1;

package selfstudy;
class SuperStatement 
{
	SuperStatement()
	{
		this(2.2);
		System.out.println("Super1");
	}
	SuperStatement(int a)
	{
		//this();
		System.out.println("Super2");
	}
	SuperStatement(double a)
	{
		this(1);
		System.out.println("Super3");
	}
}
public class ThisStatement extends SuperStatement
{
	ThisStatement(float i, int e, int f)
	{
		this(2.2);
		System.out.println("Constructor 1");   //1,4,2
	}
	ThisStatement(int a)
	{
		this(2,2);
		System.out.println("Constructor 2");        //2,3
	}
	ThisStatement(int a1, int b)
	{
		this(4.7f,6,7);
		System.out.println("Constructor 3");        //3,
	}
	ThisStatement(double a)
	{
		//super(1);
		System.out.println("Constructor 4");        //4,2,3
	}
	public static void main(String[] args) 
	{
		new ThisStatement(2);  // 2,3
		//new ThisStatement(5);
		//new ThisStatement(2,3);
		//new ThisStatement(2.2);
	}
}