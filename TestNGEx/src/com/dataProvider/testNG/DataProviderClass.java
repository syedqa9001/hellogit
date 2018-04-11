package com.dataProvider.testNG;

import org.testng.annotations.Test;

public class DataProviderClass {
	
	@Test(dataProvider = "mydata1",dataProviderClass=DataProvideMulMethods.class)
	public void TestCase3(String a, int b){
		System.out.println("Argument :" +a+ "Argument :" +b);
		
	}
	
	@Test(dataProvider = "mydata1",dataProviderClass=DataProvideMulMethods.class)
	public void TestCase2(String a, int b){
		System.out.println("Argument :" +a+ "Argument :" +b);
		
	}

}
