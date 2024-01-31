package com.dataflex.excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis= new FileInputStream(".\\dataFiles\\Countries.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		

	}

}
