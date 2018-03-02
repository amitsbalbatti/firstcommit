package tests;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;




	public class BasicSetup {
	protected static AndroidDriver<MobileElement> driver;


	public static void swipeDown(String loc) {
	
	MobileElement topCharts11 =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator(loc);
	Point point111 = topCharts11.getLocation();
	int startX111 = point111.x;
	int endX111 = point111.x;
	 
	int startY111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
	int endY111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
	 
	TouchAction actions111 = new TouchAction(driver);
	actions111.press(startX111, startY111).waitAction().moveTo(endX111, endY111).release().perform();
}

public static void takeScreenShot(String name) {
TakesScreenshot tes=(TakesScreenshot)driver;
File source=tes.getScreenshotAs(OutputType.FILE);
File dest=new File(name); {
try
{
FileUtils.copyFile(source, dest);
}
catch(Exception e)
{

}
}
}
}


