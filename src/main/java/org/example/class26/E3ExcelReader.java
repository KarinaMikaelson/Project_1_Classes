package org.example.class26;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E3ExcelReader {
    public static void main(String[] args) throws IOException {
        //Location of the file
        String path = "/Users/karina/IdeaProjects/SDETJavaBatch19/Files/Batch19TestData (2).xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        // XSSFWorkbook class - only for excel files
        Sheet sheet = excel.getSheet("Sheet1");
        Row row = sheet.getRow(1);
        Cell cell = row.getCell(3);
        System.out.println(cell);

    }
}
