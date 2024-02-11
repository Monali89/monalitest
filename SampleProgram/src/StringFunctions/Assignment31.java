package StringFunctions;
//Take any string Example: "Ram Tiwari "and it should display as Tiwari Ram
public class Assignment31 
{
public static void main(String[] args)
{
		String a="Ram Tiwari";
		String b[];
		//System.out.println(a.length());
		for(int i=a.length()-4; i>=0; i=i+1)
		{
			System.out.print(a.charAt(i));
			  
			//System.out.print(a.substring(4, 10));
			//System.out.print(" ");
			//System.out.print(a.substring(1, 4));
			b = a.split(" ");
			//System.out.print(b[1]);
			//System.out.print(b[0]);
		
		}

	}

}
