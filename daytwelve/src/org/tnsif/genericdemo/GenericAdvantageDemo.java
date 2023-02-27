package org.tnsif.genericdemo;

import java.util.ArrayList;

public class GenericAdvantageDemo {

	public static void main(String[] args) {
		
		ArrayList <Integer> obj = new ArrayList<>();
		obj.add(15);
		System.out.println(obj);
		
		ArrayList obj2 = new ArrayList<>();
		obj2.add("MET");
		String str = (String) obj2.get(0);
		System.out.println(str);
		
		ArrayList<String> obj3 = new ArrayList<>();
		obj3.add("MET");
		String str1 = (String) obj3.get(0);
		System.out.println(str1);
		
		

	}

}
