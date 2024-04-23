package org.example.class26;
/*
Using loop to read all the rows in exel file
 */
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {
        //Location of the file
        String path = "/Users/karina/IdeaProjects/SDETJavaBatch19/Files/Batch19TestData (2).xlsx";
        FileInputStream fis = new FileInputStream(path);
        XSSFWorkbook excel = new XSSFWorkbook(fis);
        // XSSFWorkbook class - only for excel files
        Sheet sheet = excel.getSheet("Sheet1");

        for(int i = 1; i < sheet.getPhysicalNumberOfRows(); i++){
            Row row = sheet.getRow(i);
            for(int j = 0; j < row.getPhysicalNumberOfCells(); j++){
                Cell cell = row.getCell(j);
                System.out.println(cell+" ");
            }
            System.out.println();
        }
    }
}
