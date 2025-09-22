package tns_package;

public class Typecast {

	public static void main(String[] args) {
		
		int x=55;
		float y=x;
		
		System.out.println(y);  //55.0
		
		
		double a = 30.97;
		int b= (int)a;
		
		System.out.println(b);//30
		
		
		float f = 123.45f;
		long l = (long) f; 
		
		System.out.println(l); //123

	}

}
