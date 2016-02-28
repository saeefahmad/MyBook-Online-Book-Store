package com.mybook;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
	com.mybook.client.TestProject.class,
	com.mybook.server.TestProject.class,
})
public class TestProject {

	/**
	 */
	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestProject.class });
	}
}
