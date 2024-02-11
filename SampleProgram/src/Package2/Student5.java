package Package2;
//what happen outside the package by becoming a subclass
import Package1.Mentor;

public class Student5 extends Mentor
{

	public static void main(String[] args)
	{
		Student5 s1=new Student5();
		//s1. add();//private not accessible
		s1.div();// public accessible
		//s1.mul();//package/default not accessible
		s1.sub();//protected accessible
		 
	}

}
