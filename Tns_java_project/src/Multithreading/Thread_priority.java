package Multithreading;

class MainPriority {

	public static void main(String[] args) {
		Thread_priority p1 = new Thread_priority();
		Thread_priority p2 = new Thread_priority();
		p1.setPriority(1);
		p2.setPriority(10);
		p1.start();
		p2.start();
	}

}

public class Thread_priority extends Thread {
	public void run()
	{
		System.out.println("The running thread is :" +Thread.currentThread().getName());
		System.out.println("The running thread priority is :" +Thread.currentThread().getPriority());
		
	}
}