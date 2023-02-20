package org.tnsif.usingrunnable;

//To demonstrate Runnable Interface Example
public class Marathon implements Runnable{
	
	//private date members
	private int speed;
	private String city;

	//implemented method (Auto-generated)
	@Override
	public void run() {
		//printing data members
		System.out.println("Speed of a participant: "+ speed
				+ "\nThe City is: "+ city);
	}

	
	//getters and setters
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
