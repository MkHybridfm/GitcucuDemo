package com.codecrafter.practice;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelSheet2 {

    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(".\\dataFiles\\Countries.xlsx");

        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");
        DataFormatter format = new DataFormatter();

        // Assume a fixed width for each column (adjust as needed)
        int columnWidth = 15;

        // Print the data with fixed column width
        for (Row row : sheet) {
            for (int j = 0; j < row.getLastCellNum(); j++) {
                String value = format.formatCellValue(row.getCell(j));
                System.out.printf("%-" + columnWidth + "s", value);
            }
            System.out.println();
        }

        // Close the workbook and input stream to release resources
        workbook.close();
        inputStream.close();
    }
}
