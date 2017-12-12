package amit;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowser {

	

	static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do;jsessionid=3oisg4vbn4mj0");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[@id='licenseLink']")).click();
		Set<String> handels = driver.getWindowHandles();
		//handels.remove(parent);
		
		
		
		for(String str:handels)
			
		{
			String v = driver.switchTo().window(str).getTitle();
			System.out.println(v);
		}
}
}
