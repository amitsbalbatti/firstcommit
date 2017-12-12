package amit;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class wWebActionRobot {
	
static {
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, AWTException  {

		
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-cfkotvr/login.do");
		WebElement link = driver.findElement(By.xpath("//a[.='Actimind Inc.']"));
		
		Actions action=new Actions(driver);
		action.contextClick(link).perform();
		Thread.sleep(2000);
		
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_W);
		robo.keyRelease(KeyEvent.VK_W);
		Thread.sleep(2000);
		driver.close();

}
}
