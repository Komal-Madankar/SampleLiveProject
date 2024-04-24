package april2nd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Formatecells {

	public static void main(String[] args) throws Throwable {
		//read  path of file
				FileInputStream fi = new FileInputStream("D:/TestExcelData.xlsx");
				//get wb from file
				XSSFWorkbook wb = new XSSFWorkbook(fi);
				//get sheet from wb
				XSSFSheet ws = wb.getSheet("TestData");
				//count no of rows in Emp sheet
				int rc = ws.getLastRowNum();
				System.out.println(rc);
				for(int i=1;i<=rc;i++)
				{
					//write status in status cell
					//ws.getRow(i).createCell(4).setCellValue("pass");
					//ws.getRow(i).createCell(4).setCellValue("Fail");
					ws.getRow(i).createCell(4).setCellValue("Blocked");
					XSSFCellStyle style = wb.createCellStyle();
					XSSFFont font = wb.createFont();
					//bold text
					font.setBold(true);
					//font.setColor(IndexedColors.GREEN.getIndex());
					//font.setColor(IndexedColors.RED.getIndex());
					font.setColor(IndexedColors.BLUE.getIndex());
					style.setFont(font);
					ws.getRow(i).getCell(4).setCellStyle(style);
				}
				fi.close();
				FileOutputStream fo = new FileOutputStream("D:/Results.xlsx");
				wb.write(fo);
				fo.close();
				wb.close();

	}

}
