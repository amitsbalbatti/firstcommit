package pom;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class cartexLogin {
	
	/*AndroidDriver<MobileElement>*/WebDriver driver;
	
	
		public cartexLogin(WebDriver driver) 
		{
		
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how=How.XPATH,using="//android.widget.EditText[@text='Mobile Number']")
		private WebElement LoginNumber;
		public void LoginNumber() {
			
			LoginNumber.click();
			LoginNumber.sendKeys("8884894555");
		}
		
		
		
		@FindBy(how=How.XPATH,using="//android.widget.Button[@text='OK']") 
		private WebElement okbutton;
		public void ClickOKButton() {	
			try {
				
				if(okbutton.isDisplayed()) {
					okbutton.click();
					ClickRegisterBttn();
					Thread.sleep(2000);
				}
				}catch(Exception e) {
					e.getStackTrace();
				}
	         
		}
		 
		//CLICK ON THE REGISTER BUTTON
		@FindBy(how=How.XPATH,using="//android.view.View[@index='1']") 
		private WebElement regstr;
		public void ClickRegisterBttn()
		{
			
			regstr.click();
		}
		
		@FindBy(how=How.XPATH,using="//android.widget.Button[@text='OK']") 
		private WebElement AlertOkbutton;
		public void AlertOKButton() {	
			try {
				
				if(okbutton.isDisplayed()) {
					okbutton.click();
				}
				}catch(Exception e) {
					e.getStackTrace();
				}
	         
		}
	
}
		
	

