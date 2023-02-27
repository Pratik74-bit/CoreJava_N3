package org.tnsif.listdemo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List <Object> obj1 = new LinkedList<>();
		obj1.add(105);
		obj1.add(17.5f);
		obj1.add('A');
		
		for (Object itr: obj1) {
			System.out.println(itr + " ");
		}
		
		
		List <Integer> obj2 = new LinkedList<Integer>();
		obj2.add(55);
		obj2.add(45);
		obj2.add(77);
		obj2.add(11);
		System.out.println("obj2 List is: "+ obj2);
		
		//sort list in ascending order
		Collections.sort(obj2);
		System.out.println("Sorted list: "+ obj2);
		
		//reverse the list
		Collections.reverse(obj2);
		System.out.println("reversed list: "+ obj2);

	}

}
