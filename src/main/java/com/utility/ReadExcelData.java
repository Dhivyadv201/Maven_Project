package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	
	public static String readParticularCellData(String sheetName,int rows,int columns) throws InvalidFormatException, IOException {
		
		File file=new File("C:\\Users\\dhivy\\OneDrive\\Desktop\\DataDriven.xlsx");
		Workbook book=new XSSFWorkbook(file);
		Sheet sheet =book.getSheet(sheetName);
		Row row=sheet.getRow(rows);
		Cell cell=row.getCell(columns);
		DataFormatter dataFormat=new DataFormatter();
		String data=dataFormat.formatCellValue(cell);
		return data;
		
	}
private static void  readAllCellData(String sheetName,int rows,int columns) throws InvalidFormatException, IOException {
		
		File file=new File("C:\\Users\\dhivy\\OneDrive\\Desktop\\DataDriven.xlsx");
		Workbook book=new XSSFWorkbook(file);
		Sheet sheet =book.getSheet("Sheet1");
		int lastRowNo=sheet.getLastRowNum();
		short lastCellNo=sheet.getRow(0).getLastCellNum();
		Row row=sheet.getRow(0);
		for (int i = 0; i < lastCellNo; i++) {
			Cell cell = row.getCell(i);
			DataFormatter dataFormat = new DataFormatter();
			String data = dataFormat.formatCellValue(cell);
			System.out.println(data);
		}
}
		
		

		
		private static void  readAllData() throws InvalidFormatException, IOException {
			
			File file=new File("C:\\Users\\dhivy\\OneDrive\\Desktop\\DataDriven.xlsx");
			Workbook book=new XSSFWorkbook(file);
			Sheet sheet =book.getSheet("Sheet1");
			int lastRowNo=sheet.getLastRowNum();
			short lastCellNo=sheet.getRow(0).getLastCellNum();
			for (int i = 0; i < lastRowNo; i++) {
				Row row = sheet.getRow(i);
				for (int j = 0; j < lastCellNo; j++) {
					Cell cell = row.getCell(j);
					DataFormatter dataFormat = new DataFormatter();
					String data = dataFormat.formatCellValue(cell);
					System.out.println(data);
				} 
			}
	}
			
			public static void main(String[] args) throws InvalidFormatException, IOException {
				readAllData();
	}

	}
		
	


