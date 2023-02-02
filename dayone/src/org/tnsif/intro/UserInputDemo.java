package org.tnsif.intro;
import java.util.Scanner;

public class UserInputDemo {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for int a ");
		int a = sc.nextInt();
		
		System.out.println("Enter value for float f ");
		float f = sc.nextFloat();
		
		System.out.println("Enter value for char c ");
		char c = sc.next().charAt(0);
		
		System.out.println("Enter value for String n ");
		String n = sc.next();
		
		//System.out.println("Enter value for String name ");
		//String name = sc.nextLine();
		
		System.out.println("Enter value for double d ");
		double d = sc.nextDouble();
		
		System.out.println("value of a is " + a);
		System.out.println("value of f is " + f);
		System.out.println("value of c is " + c);
		System.out.println("value of n is " + n);
		//System.out.println("value of name is " + name);
		System.out.println("value of d is " + d);
		
	}

}
