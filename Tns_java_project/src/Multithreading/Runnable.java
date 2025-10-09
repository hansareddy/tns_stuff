package Multithreading;

import Threads.Runnnableinf;

public class Runnable {

	public static void main(String[] args) {
		Runnnableinf ri = new Runnnableinf();
		Thread t1 = new Thread(ri);
		t1.start();
		

	}

}