package com.dataProvider.testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
	
	@DataProvider(name="mydata")
	public Object[][] getData()
	{
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "Abc";
		obj[0][1]= 123;
		
		obj[1][0] = "Cde";
		obj[1][1]= 456;
		
		obj[2][0] = "Fgh";
		obj[2][1]= 789;
		
		return obj;
		
	}
	
	
	
	@Test(dataProvider = "mydata")
	public void TestCase1(String a, int b){
		System.out.println("Argument :" +a+ "Argument :" +b);
		
	}
}
