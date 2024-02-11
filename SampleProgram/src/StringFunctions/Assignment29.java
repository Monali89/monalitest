package StringFunctions;
//Input is "world".It should be printed vertically and should appear as dlrow (Vertically)
public class Assignment29 
{
public static void main(String[] args) 
{
	String a="World";
	System.out.println(a.indexOf('d'));
	for(int i=a.length()-1;i>=0;i--)
	{
		System.out.print(a.charAt(i));
		 
	}
	}

}
