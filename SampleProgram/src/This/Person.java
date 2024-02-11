package This;
//Java Program to implement
//Java this reference
public class Person {
	String name="qwe";
	int age=12;
	Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	 public String get_name()
	{
		return name;
	}
	 public void change_name(String name)
	 {
		 this.name=name;
	 }
	 void display()
	 {
		 System.out.println("name" +name);
		 System.out.println("age" +age);
	 }
	 public static void main(String[] args) {
		Person p1=new Person("Monali",23);
		Person p2=new Person("sapna", 24);
		p1.get_name();
		p1.display();
		p2.get_name();
		p2.display();
		p1.change_name("trisha");
		System.out.println("name has to be changed="+p1.get_name());
		}

}
