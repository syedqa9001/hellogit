package com.selenium.java;

import lib.ExcelConfig;

public class ReadExcelLIB {

	public static void main(String[] args) {
		
		ExcelConfig obj = new ExcelConfig("C:\\Users\\Madhi\\Desktop\\TestData.xlsx");
		
		obj.getData(1);

	}

}
