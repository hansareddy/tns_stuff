package interfacee;

interface Calls {
	void call();
}

interface Messages {
	void sms();
}

class Jio implements Calls, Messages {
	public void call() {
		System.out.println("Calling from Jio");
	}
	public void sms() {
		System.out.println("SMS from Jio");
	}
}

class Air implements Calls, Messages {
	public void call() {
		System.out.println("Calling from Airtel");
	}
	public void sms() {
		System.out.println("SMS from Airtel");
	}
}

public class Multiple_interface {
	public static void main(String[] args) {
		Jio j = new Jio();
		j.call();
		j.sms();

		Air a = new Air();
		a.call();
		a.sms();
	}
}
