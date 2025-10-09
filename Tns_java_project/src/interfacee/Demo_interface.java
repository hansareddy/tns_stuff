package interfacee;

public interface Demo_interface {
	int a=10; //final and static
	void display();  //abstract method
}
class imple implements Demo_interface{
	public void display()
	{
		System.out.println("this is implemeting class of Interface");
	}
}
