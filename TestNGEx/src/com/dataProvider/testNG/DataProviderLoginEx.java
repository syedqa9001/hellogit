package com.dataProvider.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLoginEx {
	
	WebDriver dr;
	
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Ayub\\browsers\\geckodriver.exe");
		
		dr = new FirefoxDriver();

		dr.get("https://poly.google.com");
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		
		
		
	}

	@DataProvider(name="mydata")
	public Object[][] getData()
	{
		Object[][] obj = new Object[3][2];
		
		obj[0][0] = "testpoly3";
		obj[0][1]= "Password@3";
		
		obj[1][0] = "testpoly1";
		obj[1][1]= "Password@3";
		
		obj[2][0] = "syedqa9001";
		obj[2][1]= "Winter@2016";
		
		return obj;
		
	}
	
	
	@Test(dataProvider="mydata")
	public void Test1(String username, String password)
	{
		WebDriverWait wait = new WebDriverWait(dr, 50);
		
		dr.findElement(By.xpath("//*[contains(text(),'Sign in')]")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='identifier']")));
				
		dr.findElement(By.xpath("//input[@name='identifier']")).sendKeys(username);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='RveJvd snByac'][text()='Next']")));
				
		dr.findElement(By.xpath("//span[@class='RveJvd snByac'][text()='Next']")).click();
		

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']")));
				
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='RveJvd snByac'][text()='Next']")));
		
		dr.findElement(By.xpath("//span[@class='RveJvd snByac'][text()='Next']")).click();
		
		System.out.println("This is the Title of the Page:" +dr.getTitle());
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		dr.quit();
	}
	
	
}
