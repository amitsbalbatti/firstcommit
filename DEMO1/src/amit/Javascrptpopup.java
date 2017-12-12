package amit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

public class Javascrptpopup {
	static {
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.duplichecker.com/");
	WebElement browse = driver.findElement(By.xpath("//input[@name='file_source']"));
	browse.sendKeys("C:\\Users\\User\\Desktop\\resume\\amit.txt");
	
	
	
	

	}

}
