package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mail:");
		String id = sc.nextLine();
		System.out.println("Enter password:");
		String password = sc.nextLine();
		try
		{
			//use equals method to compare strings
			if(id.equals("mymail") && password.equals("pass1234")) 
			{
				System.out.println("Credential Matched !");
				
			}
			else
			{
				throw new LoginCredentials("Invalid Credentitial");
			}
		}
		catch (LoginCredentials e)
		{
			System.out.println(e); //exception handled
		}

	}

}
