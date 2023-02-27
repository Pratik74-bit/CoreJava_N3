package org.tnsif.listdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		//Stack follows first in first out
		Stack <String> obj = new Stack<>();
		obj.push("Pratik");
		obj.push("Sahil");
		obj.push("Manoj");
		obj.push("Amey");
		
		System.out.println("The Elements inside of stack are :" + obj);
		obj.pop();
		System.out.println("The Elements inside of stack are :" + obj);
	}

}
