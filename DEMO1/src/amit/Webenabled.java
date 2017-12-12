package amit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webenabled {
	
	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/SELENIUM%20PROGRAMS/demo5.html");
		WebElement tr = driver.findElement(By.name("A"));
		tr.sendKeys("1222222");
		String str=tr.getAttribute("value");
		
		if(str.length()>4) 
		{
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		
		
		
		
		
	}

}
