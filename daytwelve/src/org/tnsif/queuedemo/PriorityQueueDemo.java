package org.tnsif.queuedemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
		//Queue follows First IN Last Out
		Queue <Integer> q = new PriorityQueue<>();
		
		//add() and Offer() methods adds the elements
		q.offer(10);
		q.offer(66);
		q.add(50);
		q.add(11);
		q.add(25);
		
		//priority of the numbers are set by the JVM in PriorityQueue
		System.out.println("Elements in Queue q :"+ q);
		
		q.remove(); //removes last element but gives exception on empty queue
		System.out.println("Elements in Queue q :"+ q);
		
		q.poll(); //removes last elements  does not give exception for empty queue
		System.out.println("Elements in Queue q :"+ q);
		
		//peek() selects the first element of queue
		System.out.println("Peek/Head Element :"+ q.peek());
		
		

	}

}
