package org.tnsif.queuedemo;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		
		Deque <String> d = new ArrayDeque<>();
		d.add("Pratik");
		d.add("Manoj");
		d.add("Sahil");
		
		System.out.println("Elements in Array Deque :"+ d);
		

		d.addFirst("Saurav"); //Adds element to first
		d.addLast("Vrush"); //Adds element to Last
		
		System.out.println("Elements in Array Deque :"+ d);
		
		
		d.remove(); //deletes from first element
		d.removeFirst(); //deletes first element
		d.removeLast(); //deletes last element
		
		System.out.println("Elements in Array Deque :"+ d);
	}

}
