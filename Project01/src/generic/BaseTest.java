package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements IConstant {
	
	static {
		
		System.setProperty(C_K, C_V);
		System.setProperty(F_K, F_V);
	}
	
	WebDriver driver;
	@BeforeMethod()
	public void OpenBrowser() 
	{
		
		driver=new ChromeDriver();
		Lib b=new Lib();
		String url = b.getProperty(config,"URL");
		driver.get(url);
		
	}
	
	@AfterMethod()
	public void closeBrowser()
	{
		driver.quit();
	
	}

}
