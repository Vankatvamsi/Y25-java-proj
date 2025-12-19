package com.junitframework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AddTest {

	@Test
	void test() 
	{
		JunitFrameworkImpl obj=new JunitFrameworkImpl();
		int result=obj.add(10, 20);
		assertEquals(30, result);
		
	}

}
