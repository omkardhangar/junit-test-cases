package com.omkar;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

public class StringAppenderTest {
	StringAppender app = new StringAppender();

	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass");
	}

	@Before
	public void before() {
		System.out.println("Before");
	}

	@Test
	public void test1() {
		assertEquals("omkar java", app.appender(" java"));

	}

	@Test
	public void test2() {
		assertEquals("omkar python", app.appender(" python"));

	}

	@After
	public void after() {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}

}