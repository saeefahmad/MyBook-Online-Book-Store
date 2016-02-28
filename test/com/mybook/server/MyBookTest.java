package com.mybook.server;

import org.junit.*;
import static org.junit.Assert.*;


public class MyBookTest {

	public MyBookTest(String name) {
	}


	@Test
	public void testMyBook_1()
		throws Exception {

		MyBook result = new MyBook();

		// add additional test code here
		assertNotNull(result);
		assertEquals(null, result.parse());
		assertEquals(0L, result.getTimerSearchSrvice());
		assertEquals(0L, result.getTimerLookupSrvice());
		assertEquals(0L, result.getTimerOrderSrvice());
		assertEquals(0, result.reportFailedOrders());
		assertEquals(null, result.say());
		assertEquals(0, result.reportGoodOrders());
		assertEquals("MyBook[UnicastServerRef [liveRef: [endpoint:[192.168.0.10:51718](local),objID:[5b6496c:150d5e98455:-7fcf, 1525926085394622323]]]]", result.toString());
	}

	@Test
	public void testFindByItemNumber_1()
		throws Exception {
		MyBook fixture = new MyBook();
		int item = 1;

		String result = fixture.findByItemNumber(item);

		// add additional test code here
		assertEquals("Processing time: 7ms\n", result);
	}

	@Test
	public void testFindByItemNumber_2()
		throws Exception {
		MyBook fixture = new MyBook();
		int item = 1;

		String result = fixture.findByItemNumber(item);

		// add additional test code here
		assertEquals("Processing time: 6ms\n", result);
	}


	@Test
	public void testFindByItemNumber_3()
		throws Exception {
		MyBook fixture = new MyBook();
		int item = 1;

		String result = fixture.findByItemNumber(item);

		// add additional test code here
		assertEquals("Processing time: 6ms\n", result);
	}


	@Test
	public void testGetTimerLookupSrvice_1()
		throws Exception {
		MyBook fixture = new MyBook();

		long result = fixture.getTimerLookupSrvice();

		// add additional test code here
		assertEquals(0L, result);
	}

	@Test
	public void testGetTimerOrderSrvice_1()
		throws Exception {
		MyBook fixture = new MyBook();

		long result = fixture.getTimerOrderSrvice();

		// add additional test code here
		assertEquals(0L, result);
	}

	@Test
	public void testGetTimerSearchSrvice_1()
		throws Exception {
		MyBook fixture = new MyBook();

		long result = fixture.getTimerSearchSrvice();

		// add additional test code here
		assertEquals(0L, result);
	}


	@Test
	public void testGetTimerSearchTlSrvice_1()
		throws Exception {
		MyBook fixture = new MyBook();

		long result = fixture.getTimerSearchTlSrvice();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: getTimerSearchTlSrvice
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertEquals(0L, result);
	}

	@Test
	public void testOrderByItemNumber_1()
		throws Exception {
		MyBook fixture = new MyBook();
		int item = 1;

		String result = fixture.orderByItemNumber(item);

		// add additional test code here
		assertEquals("Processing time: 6ms\n", result);
	}


	@Test
	public void testOrderByItemNumber_2()
		throws Exception {
		MyBook fixture = new MyBook();
		int item = 1;

		String result = fixture.orderByItemNumber(item);

		// add additional test code here
		assertEquals("Processing time: 5ms\n", result);
	}


	@Test
	public void testOrderByItemNumber_3()
		throws Exception {
		MyBook fixture = new MyBook();
		int item = 1;

		String result = fixture.orderByItemNumber(item);

		// add additional test code here
		assertEquals("Processing time: 6ms\n", result);
	}


	@Test
	public void testParse_1()
		throws Exception {
		MyBook fixture = new MyBook();

		BookList result = fixture.parse();

		// add additional test code here
		assertEquals(null, result);
	}


	@Test
	public void testParse_2()
		throws Exception {
		MyBook fixture = new MyBook();

		BookList result = fixture.parse();

		// add additional test code here
		assertEquals(null, result);
	}


	@Test
	public void testParse_3()
		throws Exception {
		MyBook fixture = new MyBook();

		BookList result = fixture.parse();

		// add additional test code here
		assertEquals(null, result);
	}


	@Test
	public void testParse_4()
		throws Exception {
		MyBook fixture = new MyBook();

		BookList result = fixture.parse();

		// add additional test code here
		assertEquals(null, result);
	}


	@Test
	public void testReportFailedOrders_1()
		throws Exception {
		MyBook fixture = new MyBook();

		int result = fixture.reportFailedOrders();

		// add additional test code here
		assertEquals(0, result);
	}


	@Test
	public void testReportFailedOrders_2()
		throws Exception {
		MyBook fixture = new MyBook();

		int result = fixture.reportFailedOrders();

		// add additional test code here
		assertEquals(0, result);
	}

	@Test
	public void testReportFailedOrders_3()
		throws Exception {
		MyBook fixture = new MyBook();

		int result = fixture.reportFailedOrders();

		// add additional test code here
		assertEquals(0, result);
	}


	@Test
	public void testReportGoodOrders_1()
		throws Exception {
		MyBook fixture = new MyBook();

		int result = fixture.reportGoodOrders();

		// add additional test code here
		assertEquals(0, result);
	}

	@Test
	public void testReportGoodOrders_2()
		throws Exception {
		MyBook fixture = new MyBook();

		int result = fixture.reportGoodOrders();

		// add additional test code here
		assertEquals(0, result);
	}


	@Test
	public void testReportGoodOrders_3()
		throws Exception {
		MyBook fixture = new MyBook();

		int result = fixture.reportGoodOrders();

		// add additional test code here
		assertEquals(0, result);
	}


	@Test
	public void testReportRequestsNumber_1()
		throws Exception {
		MyBook fixture = new MyBook();
		int serviceNumber = 1;

		int result = fixture.reportRequestsNumber(serviceNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.mybook.server.MyBook.reportRequestsNumber(MyBook.java:180)
		assertEquals(0, result);
	}

	@Test
	public void testReportRequestsNumber_2()
		throws Exception {
		MyBook fixture = new MyBook();
		int serviceNumber = 2;

		int result = fixture.reportRequestsNumber(serviceNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.mybook.server.MyBook.reportRequestsNumber(MyBook.java:183)
		assertEquals(0, result);
	}


	@Test
	public void testReportRequestsNumber_3()
		throws Exception {
		MyBook fixture = new MyBook();
		int serviceNumber = 3;

		int result = fixture.reportRequestsNumber(serviceNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.mybook.server.MyBook.reportRequestsNumber(MyBook.java:186)
		assertEquals(0, result);
	}


	@Test
	public void testReportRequestsNumber_4()
		throws Exception {
		MyBook fixture = new MyBook();
		int serviceNumber = 4;

		int result = fixture.reportRequestsNumber(serviceNumber);

		// add additional test code here
		assertEquals(0, result);
	}


	@Test
	public void testReportServicePerformance_1()
		throws Exception {
		MyBook fixture = new MyBook();
		int serviceNumber = 1;

		long result = fixture.reportServicePerformance(serviceNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.mybook.server.MyBook.reportServicePerformance(MyBook.java:248)
		assertEquals(0L, result);
	}


	@Test
	public void testReportServicePerformance_2()
		throws Exception {
		MyBook fixture = new MyBook();
		int serviceNumber = 2;

		long result = fixture.reportServicePerformance(serviceNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.mybook.server.MyBook.reportServicePerformance(MyBook.java:251)
		assertEquals(0L, result);
	}


	@Test
	public void testReportServicePerformance_3()
		throws Exception {
		MyBook fixture = new MyBook();
		int serviceNumber = 3;

		long result = fixture.reportServicePerformance(serviceNumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.mybook.server.MyBook.reportServicePerformance(MyBook.java:254)
		assertEquals(0L, result);
	}


	@Test
	public void testReportServicePerformance_4()
		throws Exception {
		MyBook fixture = new MyBook();
		int serviceNumber = 4;

		long result = fixture.reportServicePerformance(serviceNumber);

		// add additional test code here
		assertEquals(0L, result);
	}

	@Test
	public void testSay_1()
		throws Exception {
		MyBook fixture = new MyBook();

		String result = fixture.say();

		// add additional test code here
		assertEquals(null, result);
	}


	@Test
	public void testSearchByTitle_1()
		throws Exception {
		MyBook fixture = new MyBook();
		String words = "";

		String result = fixture.searchByTitle(words);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: searchByTitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	@Test
	public void testSearchByTitle_2()
		throws Exception {
		MyBook fixture = new MyBook();
		String words = "";

		String result = fixture.searchByTitle(words);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: searchByTitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}


	@Test
	public void testSearchByTitle_3()
		throws Exception {
		MyBook fixture = new MyBook();
		String words = "";

		String result = fixture.searchByTitle(words);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: searchByTitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}


	@Test
	public void testSearchByTopic_1()
		throws Exception {
		MyBook fixture = new MyBook();
		String words = "";

		String result = fixture.searchByTopic(words);

		// add additional test code here
		assertEquals("Processing time: 6ms\n", result);
	}

	@Test
	public void testSearchByTopic_2()
		throws Exception {
		MyBook fixture = new MyBook();
		String words = "";

		String result = fixture.searchByTopic(words);

		// add additional test code here
		assertEquals("Processing time: 5ms\n", result);
	}


	@Test
	public void testSearchByTopic_3()
		throws Exception {
		MyBook fixture = new MyBook();
		String words = "";

		String result = fixture.searchByTopic(words);

		// add additional test code here
		assertEquals("Processing time: 5ms\n", result);
	}


	@Test
	public void testSetTimerLookupSrvice_1()
		throws Exception {
		MyBook fixture = new MyBook();
		long value = 1L;

		fixture.setTimerLookupSrvice(value);

		// add additional test code here
	}

	@Test
	public void testSetTimerOrderSrvice_1()
		throws Exception {
		MyBook fixture = new MyBook();
		long value = 1L;

		fixture.setTimerOrderSrvice(value);

		// add additional test code here
	}


	@Test
	public void testSetTimerSearchSrvice_1()
		throws Exception {
		MyBook fixture = new MyBook();
		long value = 1L;

		fixture.setTimerSearchSrvice(value);

		// add additional test code here
	}

	@Test
	public void testSetTimerSearchTlSrvice_1()
		throws Exception {
		MyBook fixture = new MyBook();
		long value = 1L;

		fixture.setTimerSearchTlSrvice(value);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setTimerSearchTlSrvice
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
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
		new org.junit.runner.JUnitCore().run(MyBookTest.class);
	}
}