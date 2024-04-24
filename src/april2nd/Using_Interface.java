package april2nd;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Using_Interface {

	public static void main(String[] args) throws Throwable {
		// read path of file
				FileInputStream fi = new FileInputStream("D:/TestExcelData.xlsx");
				//get wb from file
				Workbook wb = WorkbookFactory.create(fi);
				//get sheet from wb
				Sheet ws = wb.getSheet("TestData");
				int rc = ws.getLastRowNum();
				System.out.println(rc);
				for(int i=1;i<=rc;i++)
				{
					String fname =ws.getRow(i).getCell(0).getStringCellValue();
					String mname =ws.getRow(i).getCell(1).getStringCellValue();
					String lname =ws.getRow(i).getCell(2).getStringCellValue();
					int eid =(int) ws.getRow(i).getCell(3).getNumericCellValue();
					System.out.println(fname+"    "+mname+"   "+lname+"     "+eid);
					ws.getRow(i).createCell(4).setCellValue("I want job with 20L package");
					
					
				}
				fi.close();
				FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
				wb.write(fo);
				fo.close();
				wb.close();
	}

}
