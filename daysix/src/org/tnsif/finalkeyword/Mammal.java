package org.tnsif.finalkeyword;

public class Mammal extends Animals {
	
	protected int age;
	
	
//	void display() {
//		System.out.println();
//	}
	
	//we used int datatype of the parameter age
	//using String will give error
	void display(int age) {
		System.out.println("Age is "+ age);
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	

}
