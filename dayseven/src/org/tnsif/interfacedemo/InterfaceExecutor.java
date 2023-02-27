package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	public static void main(String[] args) {

		//we can't instantiate interface
		//Bike b = new Bike;
		Avenger a = new Avenger();
		//calling method
		a.engine();
		a.milage(55);

	}

}
