package inheritance_types;

class Hansa{
	void read()
	{
		System.out.println("ananya is reading");
	}
}
class Harshitha extends Hansa{
	void write()
	{
		System.out.println("arifa is writing");
	}
}
class Maha extends Hansa{
	void listen()
	{
		System.out.println("ankitha is listening");
	}
}
public class Hierarchial {

	public static void main(String[] args) {
		Harshitha ar=new Harshitha();
		ar.write();
		ar.read();
	    
		Maha an=new Maha();
		an.listen();
		an.read();
		
		
		

	}

}