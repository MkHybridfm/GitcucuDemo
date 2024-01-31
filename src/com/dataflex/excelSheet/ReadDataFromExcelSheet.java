package com.dataflex.excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcelSheet {

	public static void main(String[] args) throws IOException {
		
		String excelFilePath=".\\dataFiles\\Countries.xlsx";
		FileInputStream inputstream= new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(inputstream);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		for(Row row:sheet) {
			
			for(Cell cell:row) {
				
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
				
		}
		workbook.close();
		
		

	}

}



