package org.tnsif.staticdemo;

public class StaticBlock {
	private int num;
	
	//using static keyword
	//name can be accessed without creating instance/object
	private static String name;
	
	//static block
	static {
		name = "Manoj";
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		StaticBlock.name = name;
	}
	
	
	
}
