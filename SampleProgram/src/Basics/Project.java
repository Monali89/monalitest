package Basics;

public class Project extends Department
{
	int projectno;//global
	String name;
	String location;
	static void proj_details() 
	{
		System.out.println("project details");
		int wohrs=9;//local
	System.out.println(wohrs);
	display();
	show();
	}

}
