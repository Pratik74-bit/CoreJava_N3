package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Menu for callertunes
		System.out.println("Enter 1 for Kesariya");
		System.out.println("Enter 2 for Ved");
		System.out.println("Enter 3 for Shayad");
		System.out.println("Enter 4 for Perfect");
		int opt = sc.nextInt();
		sc.close();
		
		//Switch Case 
		switch(opt){
		
			case 1:
				System.out.println("Kesariya callertune is Activated");
				break;
			case 2:
				System.out.println("Ved callertune is Activated");
				break;
			case 3:
				System.out.println("Shayad callertune is Activated");
				break;
			case 4:
				System.out.println("Perfect callertune is Activated");
				break;
			default:
				System.out.println("Invalid choice !");
			
			
		}

	}

}
