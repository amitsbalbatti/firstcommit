package amit;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cntxtClick {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		WebElement f = driver.findElement(By.xpath("(//img[@class='sizer'])[4]"));
		
		Actions action=new Actions(driver);
		action.moveToElement(f).perform();
		f.click();
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(200,300)");
		
		WebElement p = driver.findElement(By.xpath("//div[@class='notemsg']"));
		Thread.sleep(2000);
		action.doubleClick(p).perform();

	}

}
