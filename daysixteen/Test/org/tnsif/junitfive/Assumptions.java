package org.tnsif.junitfive;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
//program to demonstrate on assumptions
class Assumptions {

	@Test
	void test() {
		assumeTrue(45<30);
		//assumes true
	}
	
	@Test
	void test1() {
		assumeFalse(45<50);
		//assumes false
	}

}
