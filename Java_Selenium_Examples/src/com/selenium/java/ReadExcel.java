package com.selenium.java;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\Madhi\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		System.out.println("The Cell Data is :"+sh1.getRow(1).getCell(0));
		
		int count = sh1.getLastRowNum();
		
		System.out.println("The Total Rows are in the excel is: " +count);
		
		wb.close();
		
		

	}

}
