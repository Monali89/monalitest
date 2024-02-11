package StringFunctions;
//Assignmentno 32
public class Palindrome_string 
{
public static void main(String[] args)
	{
		 String input="radar";
		 String output="";
		 for(int i=input.length()-1; i>=0;i--)
		 {
			 //System.out.print(input.charAt(i));
			 output=output+input.charAt(i);
		 }
		 System.out.println(output);
		 if( input.equals(output))
		 {
		System.out.println("String is palindrome");	 
		 }
		 else
		 {
			 System.out.println("String is not palindrome");	 
		 }
		
	}
}
