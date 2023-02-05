package org.tnsif.AssignmentFunctionRecursion;

import java.util.Scanner;

public class PrintDigitsOfNum {
	
	public static int countdigits(int n) {
		
		if (n == 0) {
			return 0;
		}
		int count = 0;
		
		while (n!=0) {
			n /= 10;
			count++;
			
		}
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		System.out.println("Digits are :" + countdigits(n) );

	}

}
