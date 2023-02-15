package org.tnsif.customexception;
//program to demonstrate custom exceptions
//using extends Exception
public class LoginCredentials extends Exception{
	
	private String str;

	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}

	

}
