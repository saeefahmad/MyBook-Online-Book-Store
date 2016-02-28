package com.mybook.server;

import org.junit.*;
import static org.junit.Assert.*;


public class SearchServiceTest {

	public SearchServiceTest(String name) {
	}

	@Test
	public void testSearchService_1()
		throws Exception {
		SearchService result = new SearchService();
		assertNotNull(result);
		// add additional test code here
	}

	@Test
	public void testSearch_1()
		throws Exception {
		SearchService fixture = new SearchService();
		fixture.matchCount = 1;

		fixture.search();

		// add additional test code here
	}

	@Test
	public void testSearch_2()
		throws Exception {
		SearchService fixture = new SearchService();
		fixture.matchCount = 1;

		fixture.search();

		// add additional test code here
	}


	@Test
	public void testSearch_3()
		throws Exception {
		SearchService fixture = new SearchService();
		fixture.matchCount = 1;

		fixture.search();

		// add additional test code here
	}


	@Test
	public void testSearch_4()
		throws Exception {
		SearchService fixture = new SearchService();
		fixture.matchCount = 1;

		fixture.search();

		// add additional test code here
	}


	@Test
	public void testSearch_5()
		throws Exception {
		SearchService fixture = new SearchService();
		fixture.matchCount = 1;

		fixture.search();

		// add additional test code here
	}

	@Test
	public void testSearch_6()
		throws Exception {
		SearchService fixture = new SearchService();
		fixture.matchCount = 1;

		fixture.search();

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
		new org.junit.runner.JUnitCore().run(SearchServiceTest.class);
	}
}