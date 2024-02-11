package StringFunctions;

public class Palindrome_string1 
{
	    public static boolean isPalindrome(String str)
	    {
	        String rev = "";// Initializing an empty string to store the reverse of the original str
	        boolean ans = false;// Initializing a new boolean variable for the answer
	        for (int i = str.length() - 1; i >= 0; i--)
	        {
	            rev = rev + str.charAt(i);
	        }
	        if (str.equals(rev))// Checking if both the strings are equal
	        {
	            ans = true;
	        }
	        return ans;
	    }
	    public static void main(String[] args)
	    {
	        String str = "Madam"; // Input string
	        str = str.toLowerCase(); // Convert the string to lowercase
	        boolean A = isPalindrome(str);
	        System.out.println(A);
	    }
	}
	


