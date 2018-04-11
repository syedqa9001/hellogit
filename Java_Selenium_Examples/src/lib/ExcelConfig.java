package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {
	
	XSSFWorkbook wb;
	
	XSSFSheet sh1;
	
	
	public ExcelConfig(String filepath)
	{
		

		try {
			File src = new File(filepath);
			
			FileInputStream fis = new FileInputStream(src);
			
			wb = new XSSFWorkbook(fis);
			
			
			
		} catch (Exception e) 
		
		{
			System.out.println(e.getMessage());			
		} 		
		
	}
	
	/*public String getData(int sheet, int row, int col)
	
	{
		sh1 = wb.getSheetAt(sheet);
		
		String data = sh1.getRow(row).getCell(col).getStringCellValue();
		
		return data;
		
	}
		*/
	
	public void getData(int sheet)
	{
		

		sh1 = wb.getSheetAt(sheet);
		
		int rownum = sh1.getLastRowNum();
		
		System.out.println("The Total Rows in the Excel sheet is:" +rownum);
		
		
		for(int i=0;i<rownum+1;i++)
		{
			String data0 = sh1.getRow(i).getCell(0).getStringCellValue();
			
			String data1 = sh1.getRow(i).getCell(1).getStringCellValue();
			
			System.out.println("The Data from rows : "+i+" :"+data0+"||" +data1);
			
						
		}
		
	}
	
	}

