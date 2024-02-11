//Multiple static methods inside the class
package Basics;

public class Second 
{
	static void one()
	{
		System.out.println("Welcome  you are in one");
	}
	static void two()
	{
		System.out.println("welcome you are in two");
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Main method");
		one();
		two();
		}

}
