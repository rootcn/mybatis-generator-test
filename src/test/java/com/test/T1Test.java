package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class T1Test {
	private static T1 t1 = new T1();

	@Before
	public void setUp() throws Exception {
		System.out.println(String.format("before, num: %s", t1.getNum()));
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(String.format("after, num: %s", t1.getNum()));
	}

	@Test
	public void testAdd() {
		assertEquals(2, t1.add(1, 1));
	}

}
