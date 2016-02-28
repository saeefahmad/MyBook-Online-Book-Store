package com.mybook.server;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	LookupServiceTest.class,
	OrderServiceTest.class,
	RecordsTest.class,
	XmlParserTest.class,
	SearchTitleServiceTest.class,
	MyBookServerTest.class,
	MyBookTest.class,
	MyBookInterfaceTest.class,
	ServiceThreadTest.class,
	BookListTest.class,
	SearchServiceTest.class,
})
public class TestProject {

	public static void main(String[] args) {
		JUnitCore.runClasses(new Class[] { TestProject.class });
	}
}
