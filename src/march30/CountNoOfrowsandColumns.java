package march30;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountNoOfrowsandColumns {

	public static void main(String[] args) throws Throwable {
		//read path of file
		FileInputStream fi = new FileInputStream("D:/TestExcelData.xlsx");
		//get wb from file
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		//get sheet from wb
		XSSFSheet ws =wb.getSheet("TestData");
		//get row from sheet
		XSSFRow row = ws.getRow(0);
		//count no of rows in Test Data sheet
		int rc = ws.getLastRowNum();
		//count no of cells in Test Data sheet
	    int cc = row.getLastCellNum();
	    System.out.println("No. of rows in the sheet::"+rc+" "+ "No. of cells in the row::"+cc);
	    fi.close();
	    wb.close();
	    
	}

}
