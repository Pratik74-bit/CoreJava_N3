package org.tnsif.abstractiondemo;

public abstract class Menu {
	// Program to demonstrate example on abstract class and abstract method
	//Abstract class 
	
	//Abstract Class cannot be final

		//Using Abstract keyword to Method
		abstract void recipe();
		abstract void foodtype();
		// Concrete Method
		void menuType() {
			System.out.println("Veg and Non Veg");
		}

	}
