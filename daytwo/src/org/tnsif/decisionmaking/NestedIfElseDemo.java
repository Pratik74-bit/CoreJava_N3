package org.tnsif.decisionmaking;

import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter age : ");
		int age = sc.nextInt();
		System.out.println("Enter weight : ");
		int weight = sc.nextInt();
		
		//Nested if statement
		if (age >= 12) {
			if (weight >= 40) {
				if(weight <= 120) {
					System.out.println("You are eligible for bunjee jumping");
				}
				else{
					System.out.println("Extra Ropes will be added");
				}
			}
			else {
					System.out.println("Not Eligible for Bujnee jumping");
			}
			
		}
		else {
			System.out.println("Not Eligible for Bujnee jumping");
		}

	}

}
