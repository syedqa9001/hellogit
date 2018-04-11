package com.IListeneres.ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//Code has been added to Git
@Listeners(com.IListeneres.ex.IlisternerEx.class)

public class MyFirstTestCase {
	
	WebDriver dr;
	
	@Test
	public void googleTitleVerify()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Ayub\\browsers\\geckodriver.exe");
		
		dr = new FirefoxDriver();
		
		dr.manage().window().maximize();
		
		dr.get("https://www.google.co.in/");
				
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String getTitle = dr.getTitle();
		
		System.out.println("The Title of the Page is : " +getTitle);
		
		dr.quit();
		
	}
	
	@Test
	public void ItestMatch()
	{

		Assert.assertTrue(false);
		
		System.out.println("This is to check the failed test cases!!!!!");
		
	}
}
