//static and non static variable in main method 
package Basics;

public class Third
{
	static int a=10;
	double b=20;
	
	void dumb()
	{
		System.out.println("you are in dumb");
	}
	
	static void deaf()
	{
		System.out.println("you are in deaf");
	}
     
	public static void main(String[] args) 
	{
		System.out.println("you are in main");
		deaf();
		Third t1=new Third();
		t1.dumb();
		//t1.a=50;
		System.out.println(a);
		System.out.println(t1.b);
		t1.b=30;
		System.out.println(t1.b);

	}

}
