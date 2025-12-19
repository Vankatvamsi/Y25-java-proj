package com.junitframework;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
@Suite
@SelectClasses({ AddTest.class, MulTest.class, SubTest.class })
public class AllTests 
{
	
}
