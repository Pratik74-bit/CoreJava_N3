package org.tnsif.exceptionhandlingdemo;

import java.util.Scanner;
//program to demonstrate arithmetic exception handling
public class ArithmeticExceptionDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of x & y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		//try block contains exception
		try {
			int res = x / y;
			System.out.println(res);
		}
		
		//catch block will handle the exception
		catch(Exception e) {
			System.out.println("Exception handled using catch: "+ e);
		}
		
		//finally block
		finally {
			System.out.println("Finally block");
		}
	}

}
