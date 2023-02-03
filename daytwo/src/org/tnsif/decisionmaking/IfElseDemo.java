package org.tnsif.decisionmaking;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter height of om :");
		int om = sc.nextInt();
		
		System.out.println("Enter height of Sahil :");
		int sahil = sc.nextInt();
		
		//if-Else statement
		if (om>sahil) {
			System.out.println("om is heavier than sahil");	
		}
		else {
			System.out.println("om is not heavier than sahil");
		}

	}

}
