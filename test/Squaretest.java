package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Squaretest {

	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=test.square(5);
		assertNotEquals(26, output);
	   // assertNotEquals(26, output);
	}

}
