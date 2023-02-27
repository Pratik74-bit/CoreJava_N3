package org.tnsif.junitfive;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestDemo {

	//@Test no need to use @Test
	@RepeatedTest(5)
	void test() {
		System.out.println("Repeated Test Annotation");
	}

}
