package StringFunctions;

import java.util.Arrays;

public class Split_array {

	public static void main(String[] args)
	{
		String s1="india is my country";
		String splitvalue[]=s1.split(" ",5);
		System.out.println(Arrays.toString(splitvalue));
}
}