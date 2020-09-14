package com.omkar;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BooleanTest {

	StringAppender app = new StringAppender();

	@Test
	public void check1() {
		assertTrue(app.check());

	}

	@Test
	public void check2() {
		assertTrue("some msg", app.check());

	}
 // below 2 cases will fail
	@Test
	public void check3() {
		assertFalse(app.check());

	}

	@Test
	public void chec4() {
		assertFalse("some msg", app.check());

	}

}