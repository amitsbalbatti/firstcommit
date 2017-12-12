package amit;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.configuration.JavaScriptConfiguration;

public class wWebjscript {

	
		static {
			
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws IOException, InterruptedException {
			
			WebDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/User/Desktop/SELENIUM%20PROGRAMS/jsdiabled.html");
			WebElement un = driver.findElement(By.id("t1"));
			String str=un.getAttribute("value");
			System.out.println(str);
			Thread.sleep(3000);
			un.sendKeys("iders");
			Thread.sleep(3000);
			un.clear();
			
			WebElement un1 = driver.findElement(By.id("t2"));
			String str1=un.getAttribute("value");
			System.out.println(str1);
			Thread.sleep(2000);
			JavascriptExecutor j=(JavascriptExecutor)driver;
			j.executeScript("document.getElementById('t2').value='gsg'");
			Thread.sleep(2000);
			j.executeScript("document.getElementById('t2').value=''");
			Thread.sleep(2000);
			
			
			
	}

}
