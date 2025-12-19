package com.junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MulTest {

	@Test
	void test() 
	{
		JunitFrameworkImpl obj=new JunitFrameworkImpl();
		int result=obj.mul(10, 20);
		assertEquals(200, result);
	}

}
