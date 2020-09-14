package com.omkar;

import org.junit.Test;

public class ExceptionTest {
	 
 @Test(expected = NullPointerException.class)
 public void test() {
	 
	 //some business code to throw nullpointer
	 
	 throw new NullPointerException();
	 
 }
 }
 