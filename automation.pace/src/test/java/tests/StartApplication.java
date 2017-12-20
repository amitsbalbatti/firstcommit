package tests;


	
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
	
	
	public class StartApplication {
	private static AndroidDriver<MobileElement> driver;
	@Test
	public void test01() throws Exception{      
	 
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("deviceName", "My New Phone");
	capabilities.setCapability("udid", "LGK3322fc70d5b");
	capabilities.setCapability("platformVersion", "7.0");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("appPackage", "com.carter.app");
	capabilities.setCapability("appActivity", "com.carter.app.MainActivity");
	
	try {
		driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
		}
		catch(MalformedURLException e) {
			System.out.println(e.getMessage());
		}
		
	
		//Thread.sleep(3000);
	
	/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/	
	
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			//Find OK button
			Thread.sleep(2000);
			
			try {
				MobileElement okButton = driver.findElementByAndroidUIAutomator("text(\"OK\")");
			if(okButton.isDisplayed()) {
				okButton.click();
			    MobileElement reg = driver.findElement(By.xpath("//android.view.View[@index='1']"));
			    reg.click();
			}
			}catch(Exception e) {
				e.getStackTrace();
			}
			
				
			MobileElement reg = driver.findElement(By.xpath("//android.view.View[@index='1']"));
			reg.click();
				
 			Thread.sleep(5000);
			driver.quit();
	
	
  }
}
	   
	 
	
	 
	


