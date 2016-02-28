package com.mybook.server;

import org.junit.*;
import static org.junit.Assert.*;

/**
 */
public class BookListTest {
	/**
	 */
	public BookListTest(String name) {
	}

	/**
	 */
	@Test
	public void testBookList_1()
		throws Exception {

		BookList result = new BookList();

		// add additional test code here
		assertNotNull(result);
	}

	/**
	 */
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
		new org.junit.runner.JUnitCore().run(BookListTest.class);
	}
}