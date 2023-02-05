package org.tnsif.AssignmentFunctionRecursion;

import java.util.Scanner;

public class FactorialRecursionFunction {
	
	public static  int rec_factorial(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n*rec_factorial(n-1);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		sc.close();
		
		System.out.println("factorial is "+ rec_factorial(n));

	}

}
