package org.tnsif.staticdemo;

public class StaticBlockExecuter {

	public static void main(String[] args) {
		
		System.out.println(StaticBlock.getName());
		
		//System.out.println(StaticBlock.getNum());
		//To access Num we need to create instance
		
		StaticBlock s = new StaticBlock();
		s.setNum(45);
		System.out.println(s.getNum());
		
		
	}

}
