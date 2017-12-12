package amit;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import org.testng.Reporter;

public class ExcelExtraction {
	
	
	@Test
	public void getvalfromEcxel() throws Exception {
		
		String path="./Excel/book1.xlsx";
		 
		FileInputStream file=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(file);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c = r.getCell(0);
		String val = c.getStringCellValue();
		Reporter.log(val,true);
		
		Row r1 = s.getRow(0);
		Cell c1 = r1.getCell(1);
		String val1 = c1.getStringCellValue();
		Reporter.log(val1,true);	
	}

}
