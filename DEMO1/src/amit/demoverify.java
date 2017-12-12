package amit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoverify {

	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-cfkotvr/login.do");
		WebElement username = driver.findElement(By.name("username"));
		if(username.isDisplayed()) {
			
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		driver.close();
		
		

	}

}
