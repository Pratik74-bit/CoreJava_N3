package org.tnsif.MultilevelInheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPhone s1 = new IPhone();
		IPhone s2 = new IPhone(456,"Two slots","Version 10");
		System.out.println(s2);
		s2.getModelno();
	}

}
