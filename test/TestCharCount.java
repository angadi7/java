package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
 
class TestCharCount {
 
	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		int output=test.countA("Janani");
	assertEquals(1, output);
	}
 
}