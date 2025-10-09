package interfacee;

interface Network {
	void connect();
	void disconnect();
}

class Airtel implements Network {
	public void connect() {
		System.out.println("Connected to Airtel network");
	}
	public void disconnect() {
		System.out.println("Disconnected from Airtel network");
	}
}

class Vi implements Network {
	public void connect() {
		System.out.println("Connected to Vi network");
	}
	public void disconnect() {
		System.out.println("Disconnected from Vi network");
	}
}

public class InterfaceExample {
	
	
	public static void main(String[] args) {
		Airtel a = new Airtel();
		a.connect();
		a.disconnect();

		Vi v = new Vi();
		v.connect();
		v.disconnect();
	}
}
