package Package1;
//what happen two classeswithin one package 
public class Student4 
{
	static private void add()//can not access private method
	{
		System.out.println("addition");
	}
	public void  sub()
	{
		System.out.println("substraction");
	}
	protected void div()
	{
		System.out.println("division");
	}
	
	void mul()
	{
		System.out.println("multiplication");
	}
}
