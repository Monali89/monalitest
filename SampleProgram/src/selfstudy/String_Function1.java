package selfstudy;

public class String_Function1 {

	public static void main(String[] args) 
	{
		 String a = "Java is an object oriented language and some concepts may be new. Take breaks when needed, and go over the examples as many times as needed."; 
		 String b = "Java is an object oriented language and some concepts may be new. Take breaks when needed, and go over the examples as many times as needed."; 

		 System.out.println(a.toUpperCase());
		 System.out.println(a.toLowerCase());
		 System.out.println(a.equals(b));
		 System.out.println(a.equalsIgnoreCase(b));
		 System.out.println(a.charAt(15));
		 System.out.println(a.compareTo(b));
		 System.out.println(a.compareToIgnoreCase(b));
		 System.out.println(a.contains(b));
		 System.out.println(a.contentEquals(b));
		 System.out.println(a.endsWith("needed."));
		 System.out.println(a.indexOf('a'));
		 System.out.println(a.lastIndexOf('d'));
		 System.out.println(a.length());
		 System.out.println(a.matches(b));
		 System.out.println(a.split(b));
		 System.out.println(a.replaceAll("is", "was"));
		 System.out.println(a.startsWith("Java"));
		 System.out.println(a.substring(5));
		 System.out.println(a.trim());
	}

}
