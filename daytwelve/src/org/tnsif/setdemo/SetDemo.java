package org.tnsif.setdemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		//HashSet will print unordered/ random elements
		Set <Object> s = new HashSet<>();
		s.add(11);
		s.add(54);
		s.add("Manoj");
		s.add(25.5f);
		System.out.println("Elements in Set s: "+ s);
		
		
		//LinkedHashSet will print ordered elements
		//the order in which elements are added
		Set <Object> s1 = new LinkedHashSet<>();
		s1.add(11);
		s1.add(54);
		s1.add("Manoj");
		s1.add(25.5f);
		System.out.println("Elements in Set s1: "+ s1);
		
		//checks sets are equal or not
		System.out.println("Sets have same elements? :"+s.equals(s1)); 
	}

}
