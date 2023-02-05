package org.tnsif.jumping;

public class ContinueDemo {

	public static void main(String[] args) {
		
		
		//continue statement will skip number 5 and print numbers 1 to 9
		for (int i = 0; i < 10; i++) {
			  if (i == 5) {
			    continue;
			  }
			  System.out.println(i);
			}

		
		

	}

}
