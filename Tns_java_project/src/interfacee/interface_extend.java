package interfacee;

interface Net {
	void connect();
	void disconnect();
}

interface AdvancedNetwork extends Net {
	void data();
}

class Airte implements AdvancedNetwork {
	public void connect() {
		System.out.println("Connected to Airtel network");
	}
	public void disconnect() {
		System.out.println("Disconnected from Airtel network");
	}
	public void data() {
		System.out.println("Using Airtel mobile data");
	}
}

class Idea implements AdvancedNetwork {
	public void connect() {
		System.out.println("Connected to Vi network");
	}
	public void disconnect() {
		System.out.println("Disconnected from Vi network");
	}
	public void data() {
		System.out.println("Using Vi mobile data");
	}
}

public class interface_extend {
	public static void main(String[] args) {
		Airte a = new Airte();
		a.connect();
		a.data();
		a.disconnect();

		Idea v = new Idea();
		v.connect();
		v.data();
		v.disconnect();
	}
}

