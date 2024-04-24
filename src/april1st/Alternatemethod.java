package april1st;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Alternatemethod {

	public static void main(String[] args) throws Throwable {
		// read path of file
				FileInputStream fi = new FileInputStream("D:/TestExcelData.xlsx");
				//get wb from file
				XSSFWorkbook wb = new XSSFWorkbook(fi);
				//get sheet from wb
				XSSFSheet ws = wb.getSheet("TestData");
				int rc = ws.getLastRowNum();
				System.out.println("No of rows are ::"+rc);
				//read specific row cell data'
				String fname = ws.getRow(2).getCell(0).getStringCellValue();
				String mname = ws.getRow(3).getCell(1).getStringCellValue();
				String lname = ws.getRow(10).getCell(2).getStringCellValue();
				int eid =(int) ws.getRow(10).getCell(3).getNumericCellValue();
				System.out.println(fname+"   "+mname+"    "+lname+"    "+eid);
				fi.close();
				wb.close();

	}

}
