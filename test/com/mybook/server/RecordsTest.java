package com.mybook.server;

import org.junit.*;
import static org.junit.Assert.*;

public class RecordsTest {

	public RecordsTest(String name) {
	}


	@Test
	public void testGetFailedorder_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);

		int result = fixture.getFailedorder();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertEquals(0, result);
	}

	@Test
	public void testGetFindbyitemnumber_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);

		int result = fixture.getFindbyitemnumber();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertEquals(0, result);
	}

	@Test
	public void testGetOrdered_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);

		int result = fixture.getOrdered();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertEquals(0, result);
	}

	@Test
	public void testGetSearchbytitle_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);

		int result = fixture.getSearchbytitle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertEquals(0, result);
	}

	@Test
	public void testGetSearchbytopic_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);

		int result = fixture.getSearchbytopic();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertEquals(0, result);
	}

	@Test
	public void testIncrementFailedorder_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);

		fixture.incrementFailedorder();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}

	@Test
	public void testIncrementFindbyitemnumber_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);

		fixture.incrementFindbyitemnumber();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}

	@Test
	public void testIncrementOrdered_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);

		fixture.incrementOrdered();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}


	@Test
	public void testIncrementSearchbytitle_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);

		fixture.incrementSearchbytitle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}


	@Test
	public void testIncrementSearchbytopic_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);

		fixture.incrementSearchbytopic();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}


	@Test
	public void testSetFailedorder_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);
		int failedorder = 1;

		fixture.setFailedorder(failedorder);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}

	@Test
	public void testSetFindbyitemnumber_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);
		int findbyitemnumber = 1;

		fixture.setFindbyitemnumber(findbyitemnumber);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}

	@Test
	public void testSetOrdered_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);
		int ordered = 1;

		fixture.setOrdered(ordered);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}


	@Test
	public void testSetSearchbytitle_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);
		int searchbytitle = 1;

		fixture.setSearchbytitle(searchbytitle);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}


	@Test
	public void testSetSearchbytopic_1()
		throws Exception {
		Records fixture = new Records();
		fixture.setOrdered(1);
		fixture.setFindbyitemnumber(1);
		fixture.setSearchbytopic(1);
		fixture.setFailedorder(1);
		fixture.setSearchbytitle(1);
		int searchbytopic = 1;

		fixture.setSearchbytopic(searchbytopic);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setSearchbytitle
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
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
		new org.junit.runner.JUnitCore().run(RecordsTest.class);
	}
}