package march29;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountRowsandColumns {

	public static void main(String[] args) throws Throwable {
			//read path of excel file
			FileInputStream fi = new FileInputStream("D:/TestExcelData.xlsx");
			//get work book
			XSSFWorkbook wb= new XSSFWorkbook(fi);
			//get sheet from wb
			XSSFSheet ws =wb.getSheet("TestData");
			//get first row from sheet
			XSSFRow row = ws.getRow(0);
			//count no of rows in sheet
			int rc =ws.getLastRowNum();
			//count no of cells in first row
			int cc = row.getLastCellNum();
			System.out.println("No of rows in Sheet::"+rc+"   "+"No of cells in first row::"+cc);
			fi.close();
			wb.close();


	}

}
