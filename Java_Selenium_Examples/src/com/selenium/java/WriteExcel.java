package com.selenium.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
	
	public static void main( String[] args) throws Exception
	{
		
		
	File src = new File("C:\\Users\\Madhi\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		System.out.println("The Cell Data is :"+sh1.getRow(1).getCell(0));
		
		int count = sh1.getLastRowNum();
		
		System.out.println("The Total Rows are in the excel is: " +count);
		
		sh1.createRow(count).createCell(0).setCellValue("xyz");
		
		FileOutputStream fout = new FileOutputStream(src);
		
		wb.write(fout);
		
		wb.close();
	}
}
		
		