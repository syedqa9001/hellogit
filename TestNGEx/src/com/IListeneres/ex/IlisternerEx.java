package com.IListeneres.ex;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class IlisternerEx implements ITestListener{
	
	

	@Override
	public void onFinish(ITestContext result) {
		
		System.out.println("Test Finishd and The Test Case Details are :" +result.getName());
		
	}

	@Override
	public void onStart(ITestContext result) {
		

		System.out.println("Test Started and The Test Case Details are :" +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		

		System.out.println("Test Failed and The Test Case Details are :" +result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		

		System.out.println("Test Failure and The Test Case Details are :" +result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		

		System.out.println("Test Skipped and The Test Case Details are :" +result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		

		System.out.println("Test Start and The Test Case Details are :" +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		

		System.out.println("Test Sucess!!! Hurray and The Test Case Details are :" +result.getName());
		
	}


	

}
