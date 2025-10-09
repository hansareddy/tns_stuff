package polymorphism;

class Calculator {
	void add(int a, int b) {
		System.out.println(a + b);
	}
	void add(double a, double b) {
		System.out.println(a + b);
	}
}

public class Over_loading {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(5, 10);
		c.add(2.5, 3.5);
	}
}

