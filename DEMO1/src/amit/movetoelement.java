package amit;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class movetoelement {
	
static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://desktop-cfkotvr/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		WebElement f=driver.findElement(By.xpath("(//img[@src='/img/default/pixel.gif?hash=1692528820' and @height='98'])[6]"));
		
		
		
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(f).perform();
		f.click();
		
		Thread.sleep(3000);
		WebElement x=driver.findElement(By.xpath("//input[@id='saveSettingsButton'] "));
		 int xval = x.getLocation().getX();
		 int yval=x.getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		j.executeScript("window.scrollBy("+xval+","+yval+")");
		Thread.sleep(2000);
			
			
		driver.findElement(By.xpath("//input[@id='saveSettingsButton']")).click();

}
}
