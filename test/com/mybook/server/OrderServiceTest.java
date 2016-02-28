package com.mybook.server;

import org.junit.*;
import static org.junit.Assert.*;

public class OrderServiceTest {

	public OrderServiceTest(String name) {
	}

	@Test
	public void testOrderService_1()
		throws Exception {
		BookList booklist = new BookList();

		OrderService result = new OrderService(booklist);

		// add additional test code here
		assertNotNull(result);
	}

	@Test
	public void testOrder_1()
		throws Exception {
		OrderService fixture = new OrderService(new BookList());

		fixture.order();

		// add additional test code here
	}


	@Test
	public void testOrder_2()
		throws Exception {
		OrderService fixture = new OrderService(new BookList());

		fixture.order();

		// add additional test code here
	}

	@Test
	public void testOrder_3()
		throws Exception {
		OrderService fixture = new OrderService(new BookList());

		fixture.order();

		// add additional test code here
	}

	@Test
	public void testOrder_4()
		throws Exception {
		OrderService fixture = new OrderService(new BookList());

		fixture.order();

		// add additional test code here
	}


	@Test
	public void testOrder_5()
		throws Exception {
		OrderService fixture = new OrderService(new BookList());

		fixture.order();

		// add additional test code here
	}


	@Test
	public void testOrder_6()
		throws Exception {
		OrderService fixture = new OrderService(new BookList());

		fixture.order();

		// add additional test code here
	}


	@Test
	public void testOrder_7()
		throws Exception {
		OrderService fixture = new OrderService(new BookList());

		fixture.order();

		// add additional test code here
	}

	@Test
	public void testOrder_8()
		throws Exception {
		OrderService fixture = new OrderService(new BookList());

		fixture.order();

		// add additional test code here
	}


	@Test
	public void testOrder_9()
		throws Exception {
		OrderService fixture = new OrderService(new BookList());

		fixture.order();

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
		new org.junit.runner.JUnitCore().run(OrderServiceTest.class);
	}
}