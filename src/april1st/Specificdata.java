package april1st;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Specificdata {

	public static void main(String[] args) throws Throwable {
		// read path of excel file
				FileInputStream fi = new FileInputStream("D:/TestExcelData.xlsx");
				//get wb from file
				XSSFWorkbook wb = new XSSFWorkbook(fi);
				//get sheet from wb
				XSSFSheet ws = wb.getSheet("TestData");
				//count no of rows in Emp sheet
				int rc =ws.getLastRowNum();
				System.out.println("No of rows::"+rc);
				//get six row from sheet
				XSSFRow row =ws.getRow(6);
				//get each cell from sheet
				XSSFCell c1 = row.getCell(0);
				XSSFCell c2 = row.getCell(1);
				XSSFCell c3 = row.getCell(2);
				XSSFCell c4 = row.getCell(3);
				//print each cell six row data
				String fname = c1.getStringCellValue();
				String mname = c2.getStringCellValue();
				String lname = c3.getStringCellValue();
				int eid = (int) c4.getNumericCellValue();
				System.out.println(fname+"   "+mname+"    "+lname+"    "+eid);
				fi.close();
				wb.close();

			}



	}


