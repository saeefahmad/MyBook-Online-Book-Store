package com.mybook.server;

import org.junit.*;
import static org.junit.Assert.*;


public class MyBookServerTest {

	public MyBookServerTest(String name) {
	}


	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		MyBookServer.main(args);

		// add additional test code here
	}


	@Test
	public void testMain_2()
		throws Exception {
		String[] args = new String[] {};

		MyBookServer.main(args);

		// add additional test code here
	}


	@Test
	public void testMain_3()
		throws Exception {
		String[] args = new String[] {};

		MyBookServer.main(args);

		// add additional test code here
	}


	@Test
	public void testMain_4()
		throws Exception {
		String[] args = new String[] {};

		MyBookServer.main(args);

		// add additional test code here
	}


	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}


	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}


	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MyBookServerTest.class);
	}
}