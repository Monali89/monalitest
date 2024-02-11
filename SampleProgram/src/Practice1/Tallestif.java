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

Ramu H M 11:28 PM
package ReviewCode;

import java.util.Scanner;

public class Ramu_01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the value of n1");
        int n1 = s1.nextInt();
        System.out.println("Enter the value of n2");
        int n2 = s1.nextInt();
        System.out.println("Enter the value of n3");
        int n3 = s1.nextInt();
        System.out.println("Enter the value of n4");
        int n4 = s1.nextInt();

        if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
            System.out.println("Student with height: " + n1 + " is the tallest.");
        } else if (n2 >= n1 && n2 >= n3 && n2 >= n4) {
            System.out.println("Student with height: " + n2 + " is the tallest.");
        } else if (n3 >= n1 && n3 >= n2 && n3 >= n4) {
            System.out.println("Student with height: " + n3 + " is the tallest.");
        } else {
            System.out.println("Student with height: " + n4 + " is the tallest.");
        }