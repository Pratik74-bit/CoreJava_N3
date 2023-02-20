package org.tnsif.threadlifecycle;
//Program to demonstrate example of thread life cycle
public class Tech extends Thread{
	
	synchronized public void run() {
		
		System.out.println("Java FullStack Training");
		
		for (int i=1; i<=5; i++) {
			System.out.println(i + " ");
			
			try
			{
				Thread.sleep(2000);
			}
			catch (InterruptedException e)
			{
				System.out.println(e);
			}
		}
		System.out.println("Technical Training");
	}
}
