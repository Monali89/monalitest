package Basics;
//constructor overloading
public class Fifth {
	Fifth()                            
	{
		System.out.println("default constructor");
	}
	Fifth(int a, char b)                            
	{
		System.out.println("parameterized constructotr");
	}
	Fifth(char c, int a, double d)
    {
		System.out.println("parameterized constructotr");
	}
	Fifth(int a,int b,int c)                            
	{
		System.out.println("parameterized constructotr");
	}
	public static void main(String[] args) 
	{
		System.out.println("main method");
		new Fifth();
		new Fifth(1,'m');
		new Fifth('a',4,9.0);
		new Fifth(1,2,3);
	}
}
