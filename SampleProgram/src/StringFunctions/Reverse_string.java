package StringFunctions;

public class Reverse_string {

	public static void main(String[] args) {
		 String input="Software";
		 String output="";
		 for(int i=input.length()-1; i>=0;i--)
		 {
			 //System.out.print(input.charAt(i));
			 output=output+input.charAt(i);
			  
		 }
		 System.out.println(output);
	}

}
