package com.omkar;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArrayTest.class, BooleanTest.class, ExceptionTest.class, ParametersTest.class,
		StringAppenderTest.class })
public class AllTests {

}
