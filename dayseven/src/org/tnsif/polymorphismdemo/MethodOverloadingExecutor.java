package org.tnsif.polymorphismdemo;

import java.util.Scanner;

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartphone s =  new Smartphone();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter resolution and slottype");
		int resolution = sc.nextInt();
		String slottype = sc.next();
		
		s.setResolution(resolution);
		s.setSlottype(slottype);
		s.display(resolution);
		s.display(resolution, slottype);

	}

}
