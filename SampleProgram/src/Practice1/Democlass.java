package Practice1;
interface First_Interface
{
	void mymethod();
	
}
interface Second_Interface
{
	void myothermethod();
}

public class Democlass implements Second_Interface,First_Interface
{

	public static void main(String[] args) 
	{
		Democlass d1=new Democlass();
		d1.mymethod();
		d1.myothermethod();
	}

	@Override
	public void mymethod() {
	System.out.println("some text");	 
		
	}

	@Override
	public void myothermethod() {
		 
	System.out.println("some other text");	
	}

}
