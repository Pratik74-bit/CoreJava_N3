package org.tnsif.jumping;

import java.util.Scanner;

public class BreakDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num : ");
		int n = sc.nextInt();
		
		for (int i=0; i<=100; i++) {
			System.out.println(i);
			if (i == n) {
				break;
			}
		}

	}

}

