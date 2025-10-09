package Multithreading;


public class Run_interface implements java.lang.Runnable{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				System.out.println("Hello");
				Thread.sleep(2000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}