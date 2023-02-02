package org.tnsif.intro;

public class DataTypesDemo {
	
	public static void main(String[] args) {
		
		//byte	
			byte a = 127; 	//	byte b = 128; will give error
			
		// integer	
			int num = 128;
			long l = 23545123542245l; //mention l after long
			
		// float
			float x = 12/5;
			float y = 5/2.5f;
			
		// double	
			double p = 12/5;
			double q = 12d/5d;
			
		// character
			char c = 'a';		
		// string
			String s = "MET College";
			
		// integer ASCII value
			int as1 = 'c';
			int as2 = '4';
			

			
			System.out.println("byte a = "+ a);
			System.out.println("int num = "+ num);	
			System.out.println("long l =" + l);
			System.out.println("x = "+ x);		
			System.out.println("y = "+ y);
			System.out.println("p = "+ p);
			System.out.println("q = "+ q);
			System.out.println("char c = "+ c);
			
			System.out.println("value of Ascii as1 ="+ as1);
			System.out.println("value of Ascii as2 ="+ as2);
			
		}

}
