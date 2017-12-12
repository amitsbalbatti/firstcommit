package amit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class setprop {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		Dimension d=new Dimension(600, 400);
		driver.manage().window().setSize(d);
		
		driver.get("http://google.com");
		String url=driver.getCurrentUrl();
		
		Thread.sleep(1000);
		
		Point p=new Point(1000,300);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(1000);
		
		driver.close();
		
		
	}

}
