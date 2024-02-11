package This;

class Test4 
{
	void show()
	{
		this.display();
		System.out.println("inside show");
	}
	void display()
	{
		//this.show();
		System.out.println("ouside show");
		}
	public static void main(String[] args) {
		Test4 t4=new Test4();
		//t4.display();
		t4.show();
	}
}
