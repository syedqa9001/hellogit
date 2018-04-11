package com.failedTC.ex;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunns {

	public static void main(String[] args) {
		
		TestNG test = new TestNG();
		
		List<String> list = new ArrayList<String>();
		
		list.add("D:\\workspace\\TestNGEx\\test-output\\Suite\\testng-failed.xml");
		
		test.setTestSuites(list);
		
		test.run();

	}

}
