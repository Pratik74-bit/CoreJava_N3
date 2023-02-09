package org.tnsif.finalkeyword;

public class FinalMethodExecuter {

	public static void main(String[] args) {
		
		Mammal e = new Mammal();
		//e.setAge(45);
		e.display("Elephant"); //from parent
		e.display(45);	//from child 
		

	}

}
