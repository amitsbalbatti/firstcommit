package generic;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Lib {
	
	
	public String getValue(String path,String sheet,int row,int cell) {
		
		String value = "";
		try {
			 Workbook wb = WorkbookFactory.create(new FileInputStream(path));
			Sheet s = wb.getSheet(sheet);
			Row r = s.getRow(row);
			Cell c = r.getCell(cell);
			value = c.getStringCellValue();	
		}
		catch(Exception e) {
			
		}
		return value;

		}
	
	public String getProperty(String path,String key) {
		
		String value="";
		try {
		
		
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		
		value = p.getProperty(key);
		
			}
		catch(Exception e)
		{
			
		}
		return value;
		}
	
	public void getScreen(String URL,String path) {
		
	try {
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		TakesScreenshot screen=(TakesScreenshot)driver;
		File scrFile = screen.getScreenshotAs(OutputType.FILE);
		File destFile = new File(path);
		
		FileUtils.copyFile(scrFile, destFile);
	
	}
	catch(Exception e) {
	}
}
}
