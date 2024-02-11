package Package1;
//Methods:what happen within the class 
public class Operator
{
	static private void add()
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
	

	public static void main(String[] args) 
	{
		add();
		Operator o1=new Operator();
		o1.sub();
		o1.div();
		o1.mul();
		
	}

}
