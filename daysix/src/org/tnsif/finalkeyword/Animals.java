package org.tnsif.finalkeyword;

public class Animals {
	protected String name;
	
	//using final keyword to display()
	//display cannot be overridden
	//override - same name same parameters
	final void display(String name) {
		System.out.println("Animal type is "+ name);
	}

	public String getName() {
		return name;
	}

	public void setName(String type) {
		this.name = type;
	}
	
	

}
