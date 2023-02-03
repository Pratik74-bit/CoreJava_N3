package org.tnsif.decisionmaking;

import java.util.Scanner;

public class CascadedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int om = sc.nextInt();
		int sahil = sc.nextInt();
		int manoj = sc.nextInt();
		
		//Cascaded If-Else statement
		if (om>sahil && om>manoj) {
			System.out.println("om is taller");	
		}
		else if (sahil>om && sahil>manoj) {
			System.out.println("sahil is taller");
		}
		else {
			System.out.println("manoj is tallest");
		}
	}

}
