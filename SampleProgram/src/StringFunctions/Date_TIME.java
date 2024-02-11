package StringFunctions;

import java.util.Date;

public class Date_TIME
{
	public static void main(String[] args) 
	{
		Date d1= new Date();// Present day date HH:MM:SS IST Year
		System.out.println("Present day, date HH:MM:SS IST Year");
		System.out.println(d1);// Present day date HH:MM:SS IST Year
		
		System.out.println(" ");
		System.out.println("Epoch Time");
		System.out.println(d1.getTime());// Epoch Time
		
		System.out.println(" ");
		System.out.println("Present day, date HH:MM:SS IST Year ");
		Date d2= new Date(d1.getTime()); // Present day date HH:MM:SS IST Year
		System.out.println(d2);// Present day date HH:MM:SS IST Year
		
		
		// 1 to  2 days from now, future date & time
		System.out.println("  ");
		System.out.println("Present day + 1 day ");
		Date d3= new Date(d1.getTime()+(1000*60*60*24*1));// 1 stands for 1 day
		System.out.println(d3);
		
		System.out.println("  ");
		System.out.println("Present day + 2 day ");
		Date d4=new Date(d1.getTime()+(1000*60*60*24*2));// 2 stands for 2 days
	}
}