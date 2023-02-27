package org.tnsif.junitfive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//program to demonstrate on assertion annotations
class AssertionDemo {

	@Test
	void test() {
		assertEquals(12,12);
		//assertEquals(12,4);
	}
	
	//test fails when 12 not equal to 4
	
	@Test
	void test1() {
		assertFalse(12==1);
		//assertFalse(12==12);
	}
	
	//test1 fails when 12==12

}
