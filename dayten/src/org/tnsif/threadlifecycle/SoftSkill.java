package org.tnsif.threadlifecycle;

public class SoftSkill extends Thread{
	
	synchronized public void run() {
		System.out.println("SoftSkill Training");
		
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
		System.out.println("Softskill Training");

	}
}
