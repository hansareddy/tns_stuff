package inheritance_types;

public class SingleInheritance {
	void start() {
        System.out.println("Vehicle starts");
    }
}
class Car extends SingleInheritance {
    void drive() {
        System.out.println("Car drives");
    }
}
