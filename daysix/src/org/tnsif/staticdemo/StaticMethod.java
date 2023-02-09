package org.tnsif.staticdemo;

public class StaticMethod {
	
	private double salary;
	
	public void display() {
		System.out.println("Salary is: " + salary);
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	public StaticMethod() {
		super();
	}

	public StaticMethod(double salary) {
		super();
		this.salary = salary;
	}
	
	
}
