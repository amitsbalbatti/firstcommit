package amit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class wWebjscriptXY {

static {
		
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException  {

		
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-cfkotvr/license.jsp;jsessionid=3j6l1yw6kmnp");
		String xp="//h2[text()='8. Indemnification']";
		int x=driver.findElement(By.xpath(xp)).getLocation().getX();
		System.out.println(x);
		int y=driver.findElement(By.xpath(xp)).getLocation().getY();
		JavascriptExecutor j=(JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		
			j.executeScript("window.scrollBy("+x+","+y+")");
		
		
		Thread.sleep(2000);
		driver.close();
		

}}


