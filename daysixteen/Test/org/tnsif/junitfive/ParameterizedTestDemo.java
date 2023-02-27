package org.tnsif.junitfive;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
//program to demonstrate the Parameterized Test
class ParameterizedTestDemo {

	@ParameterizedTest
	@ValueSource(strings = {"Dia", "Nia"})
	//we can pass any parameters like int, float, string, ect
	
	void test() {
		System.out.println("Hello");
		//prints Hello for both parameters {"Dia", "Nia"}
	}
	
	
	@ParameterizedTest
	@ValueSource(strings = {"Dia", "Nia"})
	void test1() {
		assertNotNull("hey"=="hey");
		//when not Null it will execute
	}

}
