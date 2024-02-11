package StringFunctions;

public class Casesensitive {

	public static void main(String[] args) {
		 String a=" I am MONALI ";
		 String b="I am Good";
		  System.out.println(a.length());// 13 Returns the number of characters in the String.
		  System.out.println("monali".length());//6
		  System.out.println(a.charAt(3));// a Returns the character at ith index.
		  System.out.println(a.charAt(2));//space
		  System.out.println(a.substring(2));// am Monali Return the substring from the ith  index character to end.
		  System.out.println(a.substring(5, 9));//Mon//Returns the substring from i to j-1 index.
		  System.out.println(a.concat(b));//I am MonaliI am Good
		  System.out.println(a.indexOf("MONALI"));//6
		  String s = "Learn Share Learn";
		  System.out.println(s.indexOf("Share"));// 6
		  System.out.println(a.contains(b));//Returns true if string contains contains the given string
		  System.out.println(a.replace('M', 'S'));// I am Sonali
		  System.out.println(a.trim());//I am Monali
		  System.out.println(a.equals(b));//falsa
		  System.out.println(a.equalsIgnoreCase(b));//false
		  System.out.println(a.indexOf('M'));//6s
	}

}
