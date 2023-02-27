package org.tnsif.junitfive;
//program to demonstrate on first junit5 test case
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FirstJavaProgram {
	
//@Test indicates the test block
	
	@DisplayName("Simple Junit Testing Method")
	
	@Test
	void test() {
		System.out.println("First Junit test case");
		
		//fail("Not yet implemented");
	}
	
	@Test
	void display() {
		System.out.println("Welcome to Junit test");
		
		
	}

}
