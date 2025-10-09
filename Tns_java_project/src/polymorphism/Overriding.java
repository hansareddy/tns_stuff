package polymorphism;

class Animal {
	void sound() {
		System.out.println("Animal makes sound");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog barks");
	}
}

public class Overriding {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.sound();
	}
}
