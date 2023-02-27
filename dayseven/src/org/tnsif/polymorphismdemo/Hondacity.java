package org.tnsif.polymorphismdemo;

public class Hondacity {
	
	private String colour;
	private int speed;
	
	
	//constructor with no arguments
	public Hondacity() {
		System.out.println("This is Hondacity");
	}


	//constructor with arguments
	public Hondacity(String colour, int speed) {
		super();
		this.colour = colour;
		this.speed = speed;
		System.out.println("Colour: "+ colour+ " speed: "+ speed);
	}
	
	
}
