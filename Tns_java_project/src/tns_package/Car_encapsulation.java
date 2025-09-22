package tns_package;

public class Car_encapsulation {

	public static void main(String[] args) {
		
		CarExample c = new CarExample();
		
		System.out.println("Car Details:");
		System.out.println("Car Color: " + c.color);
		System.out.println("Car Model: " + c.model);
		System.out.println("Car Company: " + c.company);
		
		c.Move();
		c.Stop();
		c.Drift();
		
	}

}

class CarExample {
	
	
	String color = "Red";
	String model = "Nexon";
	String company = "Tata";
	
	public void Move() {
		System.out.println("The car moves when the light is green.");
	}
	public void Stop() {
		System.out.println("The car stops when the light is red.");
	}
	public void Drift() {
		System.out.println("It’s often used in motorsports and car shows as a driving skill and style.");
	}
}


