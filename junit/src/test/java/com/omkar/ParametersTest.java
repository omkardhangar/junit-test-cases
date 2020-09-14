package com.omkar;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class ParametersTest {

	String input;
	String output;

	StringAppender app = new StringAppender();

	public ParametersTest(String input, String output) {
		super();
		this.input = input;
		this.output = output;
	}

	@Parameters
	public static Collection<String[]> parameters() {
		String paras[][] = { { " k", "omkar k" }, { " java", "omkar java" }, { " python", "omkar python" } };
		return Arrays.asList(paras);
	}

	@Test
	public void test() {
		assertEquals(output, app.appender(input));

	}

}
