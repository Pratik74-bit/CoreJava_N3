package org.tnsif.junitfive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
//if we make it static we will not get method name in runner
//to overcome this we use "@TestInstance(Lifecycle.PER_CLASS)"

class JunitAnnotation {
	
	
	
	@BeforeAll
	//BeforeAll will execute the method before all the test cases in the class
	//to run method should be static OR use @TestInstance
	public void display() {
		System.out.println("Using BeforeAll");
		
	}
	
	@AfterAll
	//AfterAll will execute the method after All test cases in class
	//to run method should be static OR use @TestInstance
	public void accepttwo() {
		System.out.println("Using AfterAll");
		
	}
	
	@BeforeEach
	//BeforeEach will execute the method Before each test cases in class
	public void acceptthree() {
		System.out.println("Using BeforeEach");
		
	}
	
	@AfterEach
	//AfterEach will execute the method after each test case in class
	public void accept() {
		System.out.println("Using AfterEach");
		
	}
	
	
	//@Disable
	//disables the method when we don't have to use it
	
	
	
	@Test
	void test() {
		System.out.println("Test method 3");
	}
	
	@Test
	void testing() {
		System.out.println("Test method 2");
	}
	
	@Test
	void testcase() {
		System.out.println("Test method 1");
	}

}
