package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDatafromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(".//resource//Data.xlsx");
		String workbook = WorkbookFactory.create(file).getSheet("student").getRow(1).getCell(1).getStringCellValue();
//		 Sheet sheet = workbook.getSheet("student");
//		Row row = sheet.getRow(3);
//		 Cell cell = row.getCell(2);
		 System.out.println(workbook);
		 //System.out.println(cell.getStringCellValue());
	}
}
