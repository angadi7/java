package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
 
class TestNullCheck {
 
	@Test
	void test() {
		JunitTesting test=new JunitTesting();
		String nullString=null;
		String notNullString="Maria";
		assertNull(nullString);
		//assertNotNull(notNullString);
	}
 
}
