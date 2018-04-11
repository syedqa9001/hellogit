package com.dataProvider.testNG;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class DataProvideMulMethods {
	
	
	@DataProvider(name="mydata1")
	public static Object[][] getData(Method name)
	{
		Object[][] obj = null;
		
		if(name.getName().equalsIgnoreCase("TestCase2"))
			
		{
			obj = new Object[3][2];
			
			obj[0][0] = "Ayub";
			obj[0][1]= 007;
			
			obj[1][0] = "Basha";
			obj[1][1]= 143;
			
			obj[2][0] = "Ismail";
			obj[2][1]= 7777;
		}
		
		if(name.getName().equalsIgnoreCase("TestCase3"))
		{
			
			obj = new Object[2][2];
			
			obj[0][0] = "Syed";
			obj[0][1]= 777;
			
			obj[1][0] = "Ishaq";
			obj[1][1]= 444;
		}
			
				
		return obj;
		
	}
	
	
	@Test(dataProvider = "mydata1")
	public void TestCase2(String a, int b){
		System.out.println("Argument :" +a+ "Argument :" +b);
		
	}
	

	@Test(dataProvider = "mydata1")
	public void TestCase3(String a, int b){
		System.out.println("Argument :" +a+ "Argument :" +b);

}

}