package amit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wWebframeswitch {
	
static {
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {

		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/SELENIUM%20PROGRAMS/page2.html");
		//switch to frame using index
		driver.switchTo().frame(0);
		WebElement un = driver.findElement(By.id("t1"));
		un.sendKeys("1234");
		un.clear();
	    driver.switchTo().defaultContent();
		WebElement un1 = driver.findElement(By.id("t2"));
		un1.sendKeys("abcd");
		un1.clear();
		Thread.sleep(2000);
		
		
		//switch to frame using id
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t1")).sendKeys("t1t1t1");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("tt2t2t2");
		Thread.sleep(2000);
		
		//switch using name
		driver.switchTo().frame("n1");
		driver.findElement(By.id("t1")).sendKeys("3333");
		driver.switchTo().parentFrame();//it will switch to the previous/parent frame
		driver.findElement(By.id("t2")).sendKeys("4444");
		Thread.sleep(2000);
		
		WebElement frame = driver.findElement(By.xpath("//iframe"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("t1")).sendKeys("444");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		driver.close();

}
}
