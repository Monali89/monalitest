package This;
//Using ‘this’ keyword to return the current class instance 
public class Test2 
{
	  	int a;
	    int b;
	 
	    // Default constructor
	    Test2()
	    {
	        a = 10;
	        b = 20;
	    }
	 
	    // Method that returns current class instance
	    Test2 get()
	    { 
	    	return this; 
	    }
	 
	    // Displaying value of variables a and b
	    void display()
	    {
	        System.out.println("a = " + a + "  b = " + b);
	    }
	 
	    public static void main(String[] args)
	    {
	        Test2 t2 = new Test2();
	        t2.get().display();
	        t2.display();
	    }
	}

