package com.selenium.java;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\Madhi\\Desktop\\TestData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		int rownum = sh1.getLastRowNum();
		
		System.out.println("The Total Rows are in the Excel Sheet is :" +rownum);
		
		for(int i=0;i<rownum+1;i++)
		{
			String data0 = sh1.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println("The Test Data from row" +i+ " is :" +data0);
		}
		
		wb.close();

	}

}
