package com.mybook.server;

import org.junit.*;
import static org.junit.Assert.*;


public class LookupServiceTest {

	public LookupServiceTest(String name) {
	}


	@Test
	public void testLookupService_1()
		throws Exception {
		LookupService result = new LookupService();
		assertNotNull(result);
		// add additional test code here
	}


	@Test
	public void testLookup_1()
		throws Exception {
		LookupService fixture = new LookupService();
		fixture.matchCount = 1;

		fixture.lookup();

		// add additional test code here
	}


	@Test
	public void testLookup_2()
		throws Exception {
		LookupService fixture = new LookupService();
		fixture.matchCount = 1;

		fixture.lookup();

		// add additional test code here
	}


	@Test
	public void testLookup_3()
		throws Exception {
		LookupService fixture = new LookupService();
		fixture.matchCount = 1;

		fixture.lookup();

		// add additional test code here
	}


	@Test
	public void testLookup_4()
		throws Exception {
		LookupService fixture = new LookupService();
		fixture.matchCount = 1;

		fixture.lookup();

		// add additional test code here
	}


	@Test
	public void testLookup_5()
		throws Exception {
		LookupService fixture = new LookupService();
		fixture.matchCount = 1;

		fixture.lookup();

		// add additional test code here
	}


	@Test
	public void testLookup_6()
		throws Exception {
		LookupService fixture = new LookupService();
		fixture.matchCount = 1;

		fixture.lookup();

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
		new org.junit.runner.JUnitCore().run(LookupServiceTest.class);
	}
}