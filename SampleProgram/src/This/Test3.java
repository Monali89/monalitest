package This;
// Using ‘this’ keyword as a method parameter
public class Test3 
{
	 int a;
	    int b;
	 
	    // Default constructor
	    Test3()
	    {
	        a = 10;
	        b = 20;
	    }
	    void display(Test3 t3)// Method that receives 'this' keyword as parameter
	    {
	    	System.out.println("a = " + t3.a  + " b = " + t3.b);
	 
	    }
	    // Method that returns current class instance
	    void get() 
	    {
	    	display(this);
	    }
	 
	    // main function
	    public static void main(String[] args)
	    {
	        Test3 tt = new Test3();
	        tt.get();
	    }
	}

