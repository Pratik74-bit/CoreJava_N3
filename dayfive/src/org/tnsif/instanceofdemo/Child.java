package org.tnsif.instanceofdemo;

public class Child extends Person{
	private int age;

	
	//Getters and Setters
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Child() {
		super();
		System.out.println("Child Class");
	}

	public Child(String name, String address, int age) {
		super(name, address);
		this.age = age;
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	
	
	
}
