package Threads;

public class Thread_create {

	public static void main(String[] args) {
		Runnnableinf rn = new Runnnableinf();
		Thread t1 = new Thread(rn);
		t1.start();

	}

}