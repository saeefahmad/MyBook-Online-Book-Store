package com.mybook.client;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	MyBookClientTest.class,
})
public class TestProject {

	/**
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestProject.class });
	}
}
