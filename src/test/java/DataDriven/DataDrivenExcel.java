package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenExcel {
		public static void main(String[] args) throws IOException {
		String excelFilePath=".\\resource\\samplefile.xlsx";
		FileInputStream file = new FileInputStream(excelFilePath);
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		
		//Using for loop
		/*int rows=sheet.getLastRowNum();
		int clo=sheet.getRow(1).getLastCellNum();
		
		for (int  r= 0; r<= rows ; r++) {
			XSSFRow row = sheet.getRow(r);
			for (int c = 0; c <=clo ; c++)
			{
				XSSFCell cell=row.getCell(c);
				switch(cell.getCellType())
				{
				case STRING: System.out.println(cell.getStringCellValue());break;
				case NUMERIC : System.out.println(cell.getNumericCellValue());break;
				case BOOLEAN : System.out.println(cell.getBooleanCellValue());break;
				}
			}
			System.out.println();
		}*/
		Iterator iterator = sheet.iterator();
		while (iterator.hasNext()) {
			XSSFRow row=(XSSFRow) iterator.next();
			
			
			Iterator celliterator = row.cellIterator();
			
			while (celliterator.hasNext()) {
			 Object cell = celliterator.next();
			}
		}
		
	}
}
