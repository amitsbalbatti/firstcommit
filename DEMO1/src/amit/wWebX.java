package amit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wWebX {
	
static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-cfkotvr/login.do");
		WebElement un = driver.findElement(By.name("username"));
		int x1 =un.getLocation().getX();
		System.out.println(x1);
		
		WebElement un1 = driver.findElement(By.name("pwd"));
		int x=un1.getLocation().getX();
		System.out.println(x);
		
		if(x1==x){   
			
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		driver.close();
	}

}
