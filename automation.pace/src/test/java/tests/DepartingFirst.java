package tests;

	import io.appium.java_client.MobileBy;

	import io.appium.java_client.MobileElement;
	import io.appium.java_client.TouchAction;
	import io.appium.java_client.android.AndroidDriver;
	import pom.cartexLogin;

	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Point;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.Test;
		
		
		public class DepartingFirst extends BasicSetup {
		private static AndroidDriver<MobileElement> driver;
		
		@Test
		public void test01() throws Exception{      
		 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "My New Phone");
		capabilities.setCapability("udid", "7fb7c8e9");
		capabilities.setCapability("platformVersion", "7.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.carter.app");
		capabilities.setCapability("appActivity", "com.carter.app.MainActivity");
		
		try	 {
				driver=new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			
			}
			catch(MalformedURLException e) {
				System.out.println(e.getMessage());
			}
			
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
				//LOGIN WITH VALID MOBILE NUMBER
				//Find OK button
				Thread.sleep(2000);
				
				cartexLogin reg=new cartexLogin(driver);
				//CLICK ON OK IF POPUP IS AVAILABLE ELSE CLICK ON REGISTER BUTTON
				reg.ClickOKButton();
				Thread.sleep(5000);
				//ENTER VALID MOBILE NUMBER FOR LOGIN
				List<MobileElement> EnterMobile = driver.findElements(By.className("android.widget.EditText"));
				Thread.sleep(2000);
				EnterMobile.get(0).sendKeys("8093157785");
				driver.hideKeyboard();
				
					Thread.sleep(3000);
					//CLICK ON LOGIN BUTTON
					List<MobileElement> login = driver.findElements(By.className("android.widget.Button"));
					Thread.sleep(2000);
					MobileElement clk1 = login.get(0);
					clk1.click();
					Thread.sleep(4000);
				
					//CLICK ON OK BUTTON PRESENT IN OTP POPUP SCREEN
					List<MobileElement> OTPoKButton = driver.findElements(MobileBy.className("android.widget.Button"));
					Thread.sleep(2000);
					MobileElement clk2 = OTPoKButton.get(1);
					clk2.click();
					Thread.sleep(8000);
				
				
					List<MobileElement> entrotp = driver.findElements(By.className("android.widget.EditText"));
					MobileElement okbtn = entrotp.get(0);
					okbtn.sendKeys("1234");
					/*System.out.println(entrotp.size());
					for(int i=0;i<entrotp.size();i++) {
						String val = entrotp.get(i).getText();
						System.out.println(i+""+val);
					}*/
					
					/*Thread.sleep(2000);
					for(int i=0;i<=entrotp.size()-1;i++) {
						String val = entrotp.get(i).getText();
						String valnum="1234";
						
						if(valnum.equalsIgnoreCase(val)) {
							TouchAction tc1 = new TouchAction(driver);
							tc1.tap(entrotp.get(i)).perform();
							entrotp.get(i).sendKeys("1234");
							System.out.println(i+" "+val);
						}
					}*/
						
					
					
					//CLICK ON VERIFY BUTTON
					Thread.sleep(2000);
					List<MobileElement> VerifyButton = driver.findElements(By.className("android.widget.Button"));
					Thread.sleep(2000);
					MobileElement clk3 = VerifyButton.get(0);
					clk3.click();
					Thread.sleep(3000);
					
					//CLICK ON OK BUTTON OTP SUCCESS SCREEN
					List<MobileElement> OTPSuccessoKButton = driver.findElements(By.className("android.widget.Button"));
					Thread.sleep(2000);
					OTPSuccessoKButton.get(1).click();
					Thread.sleep(2000);
					
					//CLICK ON ROUND TRIP
					List<MobileElement> RoundTrip = driver.findElements(By.className("android.view.View"));
					RoundTrip.get(31).click();
					Thread.sleep(2000);
					
					//CLICK ON ARRIVAL BUTTON
					List<MobileElement> Departing= driver.findElements(By.className("android.view.View"));
					Departing.get(22).click();
					Thread.sleep(2000);
					
					List<MobileElement> LuggageCount = driver.findElements(By.className("android.widget.EditText"));
					MobileElement LC = LuggageCount.get(0);
					LC.click();
					LC.sendKeys("1");
					/*for(int i=0;i<LuggageCount.size();i++) {
						String val = LuggageCount.get(i).getText();
						String valnum="Max 8 Items";
						if(valnum.equalsIgnoreCase(val)) {
							TouchAction tc1 = new TouchAction(driver);
							tc1.tap(LuggageCount.get(i)).perform();
							LuggageCount.get(i).sendKeys("1");
							System.out.println(i +" " +val);
							
						}
					}*/
					
							reg.AlertOKButton();
							Thread.sleep(2000);
							driver.hideKeyboard();
					
				
							//ON WORD PICK UP DATE
							List<MobileElement> dateValidation = driver.findElements(By.className("android.view.View"));
							String AT = dateValidation.get(21).getText();
							String h=AT;
							String[] h1=h.split(" ");
							int date=Integer.parseInt(h1[0]);
							String month=h1[2];
							String Y=h1[4];
							String ye = Y.substring(0,4);
							int year=Integer.parseInt(ye);
							System.out.println(date);
							System.out.println(month);
							System.out.println(year);
							
							//RETURN DATE OF SERVICE
							List<MobileElement> dateValidation1 = driver.findElements(By.className("android.view.View"));
							String AT1 = dateValidation1.get(56).getText();
							String n=AT1;
							String[] h11=n.split(" ");
							int date1=Integer.parseInt(h11[0]);
							String month1=h11[2];
							String Y1=h11[4];
							String ye1 = Y1.substring(0,4);
							int year1=Integer.parseInt(ye1);
							System.out.println(date1);
							System.out.println(month1);
							System.out.println(year1);
							Thread.sleep(10000);
							
							//List<String> messages = Arrays.asList("January", "February", "March", "April", "May","June","July","August","September","October","November","December");
							
							
							if(date1>=date && month.equals(month1) && year>=year1) {				
								
								System.out.println("DATE VALIDATION IS CORRECR AS PER THE REQUIRMENTS ");
							}
							else {
								System.out.println("FAIL");
								MobileElement ConformBooking =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\"Select a Drop Time slot\")");
								Point point1 = ConformBooking.getLocation();
								int startX1 = point1.x;
								int endX1 = point1.x;
								 
								int startY1 = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
								int endY1 = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
								 
								TouchAction actions1 = new TouchAction(driver);
								actions1.press(startX1, startY1).waitAction().moveTo(endX1, endY1).release().perform();

								Thread.sleep(1000);
								
								List<MobileElement> clndr = driver.findElements(By.className("android.view.View"));
								clndr.get(56).click();
								
								Thread.sleep(1000);
							
								
								List<MobileElement> calndr = driver.findElements(By.className("android.view.View"));
								for(int i=123;i<150;i++) {
									String val = calndr.get(i).getText();
									int avalDate = Integer.parseInt(val);
									if(avalDate>=date) {
										calndr.get(i+2).click();
										driver.findElement(By.xpath("//android.widget.Button[@text='OK ']")).click();
										break;
										
									}
								}
							}
							
													
												
							List<MobileElement> dateValidation01 = driver.findElements(By.className("android.view.View"));
							String AT01 = dateValidation01.get(56).getText();
							String n1=AT01;
							String[] h01=n1.split(" ");
							int datecHANGED=Integer.parseInt(h01[0]);
							if(datecHANGED>=date && month.equals(month1)) {
								List<MobileElement> PickTimeSlot = driver.findElements(By.className("android.view.View"));
								for(int i=0;i<PickTimeSlot.size();i++) {
									String val = PickTimeSlot.get(i).getText();
									
									String valnum="Next day Delivery between 7 AM - 10 PM ";
									
									if(valnum.equalsIgnoreCase(val)) {
										TouchAction tc1 = new TouchAction(driver);
										tc1.tap(PickTimeSlot.get(i)).perform();
									}
								}
								
								List<MobileElement> DropTimeSlot = driver.findElements(By.className("android.view.View"));
								for(int i=0;i<DropTimeSlot.size();i++) {
									String val = DropTimeSlot.get(i).getText();
									
									String valnum=" Arrival Before 3 PM";
									
									if(valnum.equalsIgnoreCase(val)) {
										TouchAction tc1 = new TouchAction(driver);
										tc1.tap(DropTimeSlot.get(i)).perform();
									}
									Thread.sleep(2000);
									
									driver.findElement(By.xpath("//android.widget.Button[@text='Next ']")).click();
								}
								
								//CLICK ON OK BUTTON
								driver.findElement(By.xpath("//android.widget.Button[@text='Next ']")).click();
								
								//CLOSE THE CURRENT RUNNING APPLICATION
								driver.quit();
								
							}
										
		
		}
		}
		
		
		
								
								
								
		
									
									
										
								
							
							
								
								
									
								
							
					
								
								
									
							
									
								
					
							
								
							
							
						  
						
							
								
								
							
							
						
				

			
	
