package com.omkar;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {

	@Test(timeout = 1000)
	public void performance() {
		int k = 0;
		for (int i = 0; i < 100000; i++) {
			for (int j = 0; j < 100000; j++) {
				k = i + j;
			}
		}
		System.out.println("k=" + k);

	}

	@Test
	public void forArrays() {
		int[] actual = { 2, 1, 3 };
		int[] expected = { 1, 2, 3 };

		Arrays.parallelSort(actual);
		assertArrayEquals(expected, actual);

	}

}