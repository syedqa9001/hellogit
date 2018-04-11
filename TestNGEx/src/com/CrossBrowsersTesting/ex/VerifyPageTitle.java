package com.CrossBrowsersTesting.ex;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class VerifyPageTitle {
	
	WebDriver dr;
	
	@Test
	@Parameters("browser")
	public void verifyTitle(String browsername)
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Ayub\\browsers\\chromedriver.exe");
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Ayub\\browsers\\geckodriver.exe");
			
			dr = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Ayub\\browsers\\chromedriver.exe");
			
			dr = new ChromeDriver();
		}
		
		dr.manage().window().maximize();
		
		dr.get("https://www.google.co.in/");
				
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		String getTitle = dr.getTitle();
		
		System.out.println("The Title of the Page is : " +getTitle);
		
	
	}
	

	@AfterMethod
	public void tearDown()
	{
		dr.quit();
	}
	
}
