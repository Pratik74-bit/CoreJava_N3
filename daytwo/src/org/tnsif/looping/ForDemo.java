package org.tnsif.looping;

import java.util.Scanner;

public class ForDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//for demonstrate example on for loop
		for (int i=0; i<=n; i++) {
			System.out.println(i + " Pratik");
		}
		
		//for reverse order
		for (int i=n; i>=0; i--) {
			System.out.println(i + " Pratik");
		}
		

	}

}
