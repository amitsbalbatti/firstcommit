package amit;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wWebjscript01 {

	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-cfkotvr/login.do");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.getElementById('loginButton').click()");
		Thread.sleep(3000);
		driver.close();
	}
	
}
