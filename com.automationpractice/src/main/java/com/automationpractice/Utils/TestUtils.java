package com.automationpractice.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;

import com.automationpractice.TestBase.Base;

public class TestUtils extends Base{
	
	public TestUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	static Workbook book;
	static Sheet sheet;
	//static String Sheetname="createaccount";
	static Double doubleObj;
	static String TestSheetPath = "C:\\Users\\harsh\\eclipse-workspace\\com.automationpractice\\src\\main\\java\\com\\automationpractice\\testdata\\AutomationPracticeTestData.xlsx";
	
	public static Object[][] getTestdata(String Sheetname) {
	//public static void main(String[] args) {
		FileInputStream file = null;
		
		 try {
			file = new FileInputStream(TestSheetPath);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		 try {
			book = WorkbookFactory.create(file);
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 sheet = book.getSheet(Sheetname);
		 
		 Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		 
		 for(int i=0; i<sheet.getLastRowNum(); i++) {
			 
			 for(int k=0; k<sheet.getRow(0).getLastCellNum(); k++)
			 {
				 if(sheet.getRow(i+1).getCell(k).getCellType()==1) {
					 //System.out.println("Its string");
					 data[i][k] = sheet.getRow(i+1).getCell(k).getStringCellValue();
				 }
				 else if(sheet.getRow(i+1).getCell(k).getCellType()==0)
					 {
					 
					 	//System.out.println("Its numeric");
					 	doubleObj = new Double((Double) sheet.getRow(i+1).getCell(k).getNumericCellValue());
					 	String s = Integer.toString(doubleObj.intValue());
					 	data[i][k] = s;
					 }
				 //data[i][k] = sheet.getRow(i+1).getCell(k).toString();
				 
				 //System.out.println(data[i][k]);
			 }
			 
		 }
		 	
		return data;
	}
	
	

}
