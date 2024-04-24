package april1st;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAllRows {

	public static void main(String[] args) throws Throwable {
		//Read path of file
				FileInputStream fi = new FileInputStream("D:/TestExcelData.xlsx");
				//get wb from file
				XSSFWorkbook wb = new XSSFWorkbook(fi);
				//get sheet from wb
				XSSFSheet ws =wb.getSheet("TestData");
				//coun t no of rows in Test Data sheet
				int rc = ws.getLastRowNum();
				System.out.println(rc);
				//iterate all rows in TestData sheet
				for(int i=1; i<=rc;i++)
				{
				//read all rows each cell data
					String fname = ws.getRow(i).getCell(0).getStringCellValue();
					String mname = ws.getRow(i).getCell(1).getStringCellValue();
					String lname = ws.getRow(i).getCell(2).getStringCellValue();
					int eid =(int)ws.getRow(i).getCell(3).getNumericCellValue();
					System.out.println(fname+"   "+mname+"    "+lname+"    "+eid);
					//write as pass into status cell
					ws.getRow(i).createCell(4).setCellValue("pass");
				}
				//close file
				fi.close();
				FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
				wb.write(fo);
				fo.close();
				wb.close();


	}

}
