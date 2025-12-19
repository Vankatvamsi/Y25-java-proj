package com.junitframework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubTest {

	@Test
	void test() 
	{
		JunitFrameworkImpl obj=new JunitFrameworkImpl();
		int result=obj.sub(10, 20);
		assertEquals(-10, result);
	}

}
