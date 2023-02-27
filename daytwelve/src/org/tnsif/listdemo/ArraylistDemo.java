package org.tnsif.listdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		
		//Collection is an interface so we cant create object for it.
		//Collection obj = new Collection();
		
		Collection <Object> obj = new ArrayList<>();
		obj.add(101);
		obj.add(10.5f);
		obj.add('P');
		System.out.println("First List " + obj);
		
		List <Object> obj1 = new ArrayList<>();
		obj1.add(105);
		obj1.add(17.5f);
		obj1.add('A');
		//obj1.add(obj); 	//addAll copies all elements from obj to obj1 list
		System.out.println("Second List " + obj1);
		
		//using size() method to get size of ArrayList
		System.out.println("First List Size " + obj.size());
		System.out.println("Second List Size " + obj1.size());
		
		
		//obj.remove(101); //-- removes the 101 from obj
		//obj.contains(101); //-- returns true if obj contains 101
		
		//isEmpty() method returns true if list obj is empty
		System.out.println(obj.isEmpty());
		
		System.out.println("Element at index 1 is :"+ obj1.get(1));
		System.out.println("Index of 'z' is: "+ obj1.indexOf('A'));
		
		System.out.println();
		
		List <Integer> obj2 = new ArrayList<Integer>();
		obj2.add(55);
		obj2.add(45);
		obj2.add(77);
		obj2.add(11);
		System.out.println("Third List is: "+ obj2);
		
		//sort list in ascending order
		Collections.sort(obj2);
		System.out.println("Sorted list: "+ obj2);
		
		//reverse the list
		Collections.reverse(obj2);
		System.out.println("reversed list: "+ obj2);

	}

}
