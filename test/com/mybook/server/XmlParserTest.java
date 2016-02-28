package com.mybook.server;

import org.junit.*;
import static org.junit.Assert.*;

public class XmlParserTest {

	public XmlParserTest(String name) {
	}

	@Test
	public void testGetAvailable_1()
		throws Exception {
		XmlParser fixture = new XmlParser();
		fixture.setTitle("");
		fixture.setCost(1);
		fixture.setTopic("");
		fixture.setItem(1);
		fixture.setAvailable(1);

		int result = fixture.getAvailable();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setCost
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
	public void testGetCost_1()
		throws Exception {
		XmlParser fixture = new XmlParser();
		fixture.setTitle("");
		fixture.setCost(1);
		fixture.setTopic("");
		fixture.setItem(1);
		fixture.setAvailable(1);

		int result = fixture.getCost();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setCost
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
	public void testGetItem_1()
		throws Exception {
		XmlParser fixture = new XmlParser();
		fixture.setTitle("");
		fixture.setCost(1);
		fixture.setTopic("");
		fixture.setItem(1);
		fixture.setAvailable(1);

		int result = fixture.getItem();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setCost
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
	public void testGetTitle_1()
		throws Exception {
		XmlParser fixture = new XmlParser();
		fixture.setTitle("");
		fixture.setCost(1);
		fixture.setTopic("");
		fixture.setItem(1);
		fixture.setAvailable(1);

		String result = fixture.getTitle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setCost
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	@Test
	public void testGetTopic_1()
		throws Exception {
		XmlParser fixture = new XmlParser();
		fixture.setTitle("");
		fixture.setCost(1);
		fixture.setTopic("");
		fixture.setItem(1);
		fixture.setAvailable(1);

		String result = fixture.getTopic();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setCost
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
		assertNotNull(result);
	}

	@Test
	public void testSetAvailable_1()
		throws Exception {
		XmlParser fixture = new XmlParser();
		fixture.setTitle("");
		fixture.setCost(1);
		fixture.setTopic("");
		fixture.setItem(1);
		fixture.setAvailable(1);
		int available = 1;

		fixture.setAvailable(available);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setCost
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}

	@Test
	public void testSetCost_1()
		throws Exception {
		XmlParser fixture = new XmlParser();
		fixture.setTitle("");
		fixture.setCost(1);
		fixture.setTopic("");
		fixture.setItem(1);
		fixture.setAvailable(1);
		int cost = 1;

		fixture.setCost(cost);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setCost
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}

	@Test
	public void testSetItem_1()
		throws Exception {
		XmlParser fixture = new XmlParser();
		fixture.setTitle("");
		fixture.setCost(1);
		fixture.setTopic("");
		fixture.setItem(1);
		fixture.setAvailable(1);
		int item = 1;

		fixture.setItem(item);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setCost
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}


	@Test
	public void testSetTitle_1()
		throws Exception {
		XmlParser fixture = new XmlParser();
		fixture.setTitle("");
		fixture.setCost(1);
		fixture.setTopic("");
		fixture.setItem(1);
		fixture.setAvailable(1);
		String title = "";

		fixture.setTitle(title);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setCost
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.findMethod(MethodInvocationExpression.java:711)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:571)
		//       at com.instantiations.eclipse.analysis.expression.model.ExpressionSequence.execute(ExpressionSequence.java:316)
		//       at com.instantiations.eclipse.analysis.expression.model.MethodInvocationExpression.execute(MethodInvocationExpression.java:550)
		//       at com.instantiations.assist.eclipse.junit.execution.core.ExecutionRequest.execute(ExecutionRequest.java:286)
		//       at com.instantiations.assist.eclipse.junit.execution.communication.LocalExecutionClient$1.run(LocalExecutionClient.java:158)
		//       at java.lang.Thread.run(Unknown Source)
	}


	@Test
	public void testSetTopic_1()
		throws Exception {
		XmlParser fixture = new XmlParser();
		fixture.setTitle("");
		fixture.setCost(1);
		fixture.setTopic("");
		fixture.setItem(1);
		fixture.setAvailable(1);
		String topic = "";

		fixture.setTopic(topic);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoSuchMethodException: setCost
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
		new org.junit.runner.JUnitCore().run(XmlParserTest.class);
	}
}