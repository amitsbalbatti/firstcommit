package amit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.WebClient;

public class anchors {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/SELENIUM%20PROGRAMS/demo.html");
		
		
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		
		
		driver.findElement(By.id("a1")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.name("n1")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("ACTITIME")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		
		driver.findElement(By.partialLinkText("TITI")).click();
		driver.navigate().back();
		Thread.sleep(4000);
		driver.close();
		
		
		

	}

}
