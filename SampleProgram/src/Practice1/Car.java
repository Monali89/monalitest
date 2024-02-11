package Practice1;
//Superkeyword
class Vehicle
{
	int maxspeed=120;
	
}
public class Car extends Vehicle
{
	int maxspeed=180;
 void display()
 {
	 System.out.println("Vehicle speed =" +super.maxspeed);//120
	 System.out.println("car speed =" +maxspeed);//180
 }

	public static void main(String[] args) 
	{
	Car c1=new Car();
	c1.display();

	}

}
/*The super keyword in Java is a reference variable that
 *  is used to refer parent class objects. */
super can be used to call parent class’ variables and methods.
The variables and methods to be called through super keyword can be done at any time,
If one does not explicitly invoke a superclass variables or methods, 
by using super keyword, then nothing happens
*/