package amit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssselector {
	
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/User/Desktop/demo.html");
		driver.findElement(By.linkText("ACTITIME")).click();

		driver.findElement(By.cssSelector("a[id='a1']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name=\"n1\"]")).click();
		driver.findElement(By.cssSelector("a[class='c1']")).click();
	}

}
