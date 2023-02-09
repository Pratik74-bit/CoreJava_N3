package org.tnsif.finalkeyword;

public class FinalVariable {
	
	//using final keyword to data members
	final static int x = 7;
	
	//using static keyword
	public static void print() {
		
		//x = 5;  This will give error
		//we cannot change the value of x as x is final
		System.out.println("Value of x: "+  x);
	}

	public static void main(String args[]) {
		
		FinalVariable.print();
		
		
}


}