package april1st;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ConvertInteger {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/TestExcelData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("TestData");
		int rc= ws.getLastRowNum();
		System.out.println(rc);
		for(int i=1;i<=rc;i++)
		{
			if(wb.getSheet("TestData").getRow(i).getCell(3).getCellType()==CellType.NUMERIC)
			{
				//read eid cell
				int celldata =(int)wb.getSheet("TestData").getRow(i).getCell(3).getNumericCellValue();
				//convert cell data cell into string type
				String eid = String.valueOf(celldata);
				System.out.println(eid);
				//write a s fail into status cell
				ws.getRow(i).createCell(4).setCellValue("Iam so lazy to attend class");
			}
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();


	}

}
