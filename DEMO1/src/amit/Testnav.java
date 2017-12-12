package amit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testnav {
	
  static
{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
}

	public static void main(String[] args)
	{
		

		WebDriver driver=new ChromeDriver();
		testBrowser(driver);
		testBrowser(new FirefoxDriver());

	}
	
	public static void testBrowser(WebDriver driver) 
	{
		
		driver.get("http://desktop-cfkotvr/login.do");
		//Thread.sleep(2000);
		driver.navigate().to("http://desktop-cfkotvr/license.jsp;");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
	}

}
