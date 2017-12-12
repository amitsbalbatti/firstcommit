package amit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class wWebsize {

static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://desktop-cfkotvr/login.do");
		WebElement un = driver.findElement(By.name("username"));
		int w1=un.getSize().getWidth();
		System.out.println(w1);
		int h1=un.getSize().getHeight();
		System.out.println(h1);
		
		WebElement un1 = driver.findElement(By.name("pwd"));
		int w2=un1.getSize().height;
		System.out.println(w2);
		int h2=un1.getSize().getHeight();
		System.out.println(h2);
		
		if(w1==w2 && h1==h2){
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
	}

}
