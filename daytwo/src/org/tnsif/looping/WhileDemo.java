package org.tnsif.looping;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num : ");
		int n = sc.nextInt();
		int i = 1;
		
		//print 1 to nth number
		while (i <= n) {
			System.out.println(i);
			i++;
		}
		
		//for reverse order
		System.out.println("Reverse order");
		i = n;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		
		}

	}


