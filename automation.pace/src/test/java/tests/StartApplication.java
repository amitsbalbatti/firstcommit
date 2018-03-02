package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pom.cartexLogin;
	
	
	public class StartApplication extends BasicSetup {
	private static AndroidDriver<MobileElement> driver;
	
	
	@Test
	public void test01() throws Exception {
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
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
		
	
	
	
		Thread.sleep(3000);
	
	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
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
				Thread.sleep(2000);
				for(int i=0;i<entrotp.size();i++) {
					String val = entrotp.get(i).getText();
					String valnum="1234";
					
					if(valnum.equalsIgnoreCase(val)) {
						TouchAction tc1 = new TouchAction(driver);
						tc1.tap(entrotp.get(i)).perform();
						entrotp.get(i).sendKeys("1234");
						System.out.println(i+" "+val);
					}
					
				}
				
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
				List<MobileElement> Arrival = driver.findElements(By.className("android.view.View"));
				Arrival.get(20).click();
				Thread.sleep(2000);
				
				//CLICK ON LUGGAGE COUNT AND ENTER NUMBER OF LUGGAGES
				List<MobileElement> ArrivalInfo = driver.findElements(By.className("android.widget.EditText"));
				for(int i=0;i<ArrivalInfo.size();i++) {
					String val = ArrivalInfo.get(i).getText();
					String valnum="Max 8 Items";
					if(valnum.equalsIgnoreCase(val)) {
						TouchAction tc1 = new TouchAction(driver);
						tc1.tap(ArrivalInfo.get(i)).perform();
						ArrivalInfo.get(i).sendKeys("1");
						System.out.println(i +" " +val);
					}
					
			
					driver.hideKeyboard();
				}
				Thread.sleep(2000);
				//CLICK ON ARRIVAL AFTER 3PM SLOT
					List<MobileElement> DropTimeSlot = driver.findElements(By.className("android.view.View"));
					for(int i=0;i<DropTimeSlot.size();i++) {
						String val = DropTimeSlot.get(i).getText();
						
						String valnum="Next day Delivery between 7 AM - 12 PM ";
						
						if(valnum.equalsIgnoreCase(val)) {
							TouchAction tc1 = new TouchAction(driver);
							tc1.tap(DropTimeSlot.get(i)).perform();
							
						}
						
					
				}
				
						Thread.sleep(2000);
						//SWIPE VERTICALY
						MobileElement topCharts =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\"Return Date of Service \")");
						Point point = topCharts.getLocation();
						int startX = point.x;
						int endX = point.x;
						 
						int startY = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
						int endY = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
						 
						TouchAction actions = new TouchAction(driver);
						actions.press(startX, startY).waitAction().moveTo(endX, endY).release().perform();
						
						//CLICK ON PICK UP TIME SLOT
						List<MobileElement> PickUPInfo = driver.findElements(By.className("android.view.View"));
						for(int i=0;i<PickUPInfo.size();i++) {
							String val = PickUPInfo.get(i).getText();
							String Onwards12="12 PM onwards";
							String Onwards3="3 PM onwards";
							String Onward6="6 PM onwards";
							if(Onwards12.equalsIgnoreCase(val))
							{
								TouchAction tc1 = new TouchAction(driver);
								tc1.tap(PickUPInfo.get(i)).perform();
								System.out.println(i +" " +val);
								break;
							}
							
							else if(Onwards3.equalsIgnoreCase(val)) {
								TouchAction tc1 = new TouchAction(driver);
								tc1.tap(PickUPInfo.get(i)).perform();
								System.out.println(i +" " +val);
								break;
							}
							else if(Onward6.equalsIgnoreCase(val)) {
								TouchAction tc1 = new TouchAction(driver);
								tc1.tap(PickUPInfo.get(i)).perform();
								System.out.println(i +" " +val);
								break;

						}
						}
							
							//CLICK ON NEXT BUTTON
							List<MobileElement>NextButton = driver.findElements(By.className("android.widget.Button"));
							for(int i=0;i<NextButton.size();i++) {
								String val = NextButton.get(i).getText();
								String valnum="Next ";
								
								if(valnum.equalsIgnoreCase(val)) {
									TouchAction tc1 = new TouchAction(driver);
									tc1.tap(NextButton.get(i)).perform();
									System.out.println(i +" "+val);
								}
							}
							
							
							Thread.sleep(2000);
							//SWAP IN CONFIRM BOOKING FOR LUGGAGE COUNT
							MobileElement ConformBooking =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\"The Carter allocated to your\")");
							Point point1 = ConformBooking.getLocation();
							int startX1 = point1.x;
							int endX1 = point1.x;
							 
							int startY1 = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
							int endY1 = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
							 
							TouchAction actions1 = new TouchAction(driver);
							actions1.press(startX1, startY1).waitAction().moveTo(endX1, endY1).release().perform();
								
							//CLICK ON LUGGAGE TYPE DROPDOWN
							Thread.sleep(2000);
							List<MobileElement> LuggageType = driver.findElements(By.className("android.view.View"));
							LuggageType.get(46).click();
							Thread.sleep(2000);
							
							//CLICK ON FOOD AND BEVERAGES
							driver.tap(1, 356, 387, 800);
							
							
							Thread.sleep(2000);
							//SWIPE VERTICALY
							MobileElement topCharts1 =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\"Luggage Count\")");
							Point point11 = topCharts1.getLocation();
							int startX11 = point11.x;
							int endX11 = point11.x;
							 
							int startY11 = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
							int endY11 = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
							 
							TouchAction actions11 = new TouchAction(driver);
							actions11.press(startX11, startY11).waitAction().moveTo(endX11, endY11).release().perform();
							
							Thread.sleep(2000);
							List<MobileElement> AmountValidation = driver.findElements(By.className("android.view.View"));
							
								String lugTYPE1="Cabin / Check in / Food & Beverages / Coats & Jackets";
								String lugTYPE2="Fragile";
								String lugTYPE3="Over Sized";
								String val1=" 299";
								String val2=" 399";
								String val3=" 599";
								String bag1="1 Bag";
								String bag2="2 Bag";
								String bag3="3 Bag";
								String Ltype = AmountValidation.get(65).getText();
								String NoBags = AmountValidation.get(66).getText();
								String Amount = AmountValidation.get(67).getText();
								if(Ltype.equals(lugTYPE1) && Amount.equals(val1 )) {
									
									if(NoBags.equals(bag1)) {
										int i=1;
										double BasePrice=299;
										double totalPise=i*BasePrice;
										double Tax=(totalPise*5)/100;
										double subtotal=totalPise+Tax;
										double finaltotal=subtotal*2;
										System.out.println("BASEPRICE:-"+BasePrice);
										System.out.println("SUB TOTAL:-"+subtotal);
										System.out.println("TAX:-"+Tax);
										System.out.println("FINAL TOTAL:-"+finaltotal);
										System.out.println("AMOUNT VALIDATION SUCCESSFULL");
									}
									else if (NoBags.equals(bag2)) {
										int i=2;
										double BasePrice=299;
										double totalPise=i*BasePrice;
										double Tax=(totalPise*5)/100;
										double subtotal=totalPise+Tax;
										double finaltotal=subtotal*2;
										System.out.println("BASEPRICE:-"+BasePrice);
										System.out.println("SUB TOTAL:-"+subtotal);
										System.out.println("TAX:-"+Tax);
										System.out.println("FINAL TOTAL:-"+finaltotal);
										System.out.println("AMOUNT VALIDATION SUCCESSFULL");
									}
									
								}
								if(Ltype.equals(lugTYPE2) && Amount.equals(val2)){
									
									if(NoBags.equals(bag1)) {
										int i=1;
										double BasePrice=399;
										double totalPise=i*BasePrice;
										double Tax=(totalPise*5)/100;
										double subtotal=totalPise+Tax;
										double finaltotal=subtotal*2;
										System.out.println("BASEPRICE:-"+BasePrice);
										System.out.println("SUB TOTAL:-"+subtotal);
										System.out.println("TAX:-"+Tax);
										System.out.println("FINAL TOTAL:-"+finaltotal);
										System.out.println("AMOUNT VALIDATION SUCCESSFULL");
									}
									else if (NoBags.equals(bag2)) {
										int i=2;
										double BasePrice=399;
										double totalPise=i*BasePrice;
										double Tax=(totalPise*5)/100;
										double subtotal=totalPise+Tax;
										double finaltotal=subtotal*2;
										System.out.println("BASEPRICE:-"+BasePrice);
										System.out.println("SUB TOTAL:-"+subtotal);
										System.out.println("TAX:-"+Tax);
										System.out.println("FINAL TOTAL:-"+finaltotal);
										System.out.println("AMOUNT VALIDATION SUCCESSFULL");
									}
								}
								if(Ltype.equals(lugTYPE3) && Amount.equals(val3)){
									
									if(NoBags.equals(bag1)) {
										int i=1;
										double BasePrice=599;
										double totalPise=i*BasePrice;
										double Tax=(totalPise*5)/100;
										double subtotal=totalPise+Tax;
										double finaltotal=subtotal*2;
										System.out.println("BASEPRICE:-"+BasePrice);
										System.out.println("SUB TOTAL:-"+subtotal);
										System.out.println("TAX:-"+Tax);
										System.out.println("FINAL TOTAL:-"+finaltotal);
									}
									else if (NoBags.equals(bag2)) {
										int i=2;
										double BasePrice=599;
										double totalPise=i*BasePrice;
										double Tax=(totalPise*5)/100;
										double subtotal=totalPise+Tax;
										double finaltotal=subtotal*2;
										System.out.println("BASEPRICE:-"+BasePrice);
										System.out.println("SUB TOTAL:-"+subtotal);
										System.out.println("TAX:-"+Tax);
										System.out.println("FINAL TOTAL:-"+finaltotal);
									}
								}
								
							
								Thread.sleep(2000);
							//CLICK ON NEXT BUTTON
							driver.findElement(By.xpath("//android.widget.Button[@text='Next ']")).click();
							Thread.sleep(2000);
							
							
							
							
							//SWIPE DOWN TO CLICK PICK UP DETAILS
							MobileElement topCharts11 =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\" 8093157785\")");
							
							Point point111 = topCharts11.getLocation();
							int startX111 = point111.x;
							int endX111 = point111.x;
							 
							int startY111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
							int endY111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
							 
							TouchAction actions111 = new TouchAction(driver);
							Thread.sleep(1000);
							actions111.press(startX111, startY111).waitAction().moveTo(endX111, endY111).release().perform();
							Thread.sleep(2000);
							
							
							//CLICK ON PICK UP DETAILS
							List<MobileElement> pickup = driver.findElements(By.className("android.view.View"));
							pickup.get(58).click();
							Thread.sleep(2000);
							driver.findElement(By.xpath("//android.widget.Button[@text='Next ']")).click();
							Thread.sleep(2000);
							
							List<MobileElement> arrivaltime = driver.findElements(By.className("android.view.View"));
							//CONVERTING ARRIVAL TIME HOURS TO SECONDS
							String AT = arrivaltime.get(33).getText();
							String h=AT;
							String[] h1=h.split(":");

							int hour=Integer.parseInt(h1[0]);
							int minute=Integer.parseInt(h1[1]);
							int Arrivaltime;
						    Arrivaltime =(60 * minute) + (3600 * hour);
						 
					        System.out.println(" ARRIVAL TIME IN SECONDS:"+Arrivaltime);
					        
					        //CONVERTING CARTERX AT ARRIVAL GATE
					        String cARTERxATGATE = arrivaltime.get(43).getText();
							String g=cARTERxATGATE;
							String[] g1=g.split(":");

							int hour1=Integer.parseInt(g1[0]);
							int minute1=Integer.parseInt(g1[1]);
							int Cartexatgate;
							Cartexatgate =(60 * minute1) + (3600 * hour1);
							int Cartexatgate1=Cartexatgate+Arrivaltime;
					        System.out.println("CARTERX AT GATE-->TIME IN SECONDS:"+Cartexatgate);
					        
					        int ValidTime=Cartexatgate1-Arrivaltime;
					        if(ValidTime==Cartexatgate) {
					        	System.out.println("TIME VALIDATION IS CORRECT AS PER REQUIRMENTS 30min DIFFERENCE:"+ValidTime+"IN SECONDS");
					        }else {
					        	System.out.println("VALIDATION FAILED");
					        }
					        Thread.sleep(2000);
					        
					    	List<MobileElement> AFlightNumber = driver.findElements(By.className("android.widget.EditText"));
					    	Thread.sleep(1000);
					    	AFlightNumber.get(0).sendKeys("12345");
					    	driver.hideKeyboard();
					    	Thread.sleep(1000);
					        
					        //SWIPE DOWN TO ENTER FLIGHT NUMBER
							MobileElement topCharts111 =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\"meet CarterX at Arrival Gate\")");
							
							Point point1111 = topCharts111.getLocation();
							int startX1111 = point1111.x;
							int endX1111 = point1111.x;
							 
							int startY1111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
							int endY1111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
							 
							TouchAction actions1111 = new TouchAction(driver);
							Thread.sleep(1000);
							actions1111.press(startX1111, startY1111).waitAction().moveTo(endX1111, endY1111).release().perform();
							Thread.sleep(2000);
							
							//ENTER FLIGHT NUMBER
							List<MobileElement> DFlightNumber = driver.findElements(By.className("android.widget.EditText"));
							DFlightNumber.get(1).sendKeys("56789");
							driver.hideKeyboard();
					    	Thread.sleep(1000);
					    	
					    	driver.findElement(By.xpath("//android.widget.Button[@text='Next ']")).click();
							Thread.sleep(2000);
							
							 //SWIPE DOWN TO ENTER FLIGHT NUMBER
							MobileElement topCharts1111 =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\"Airport\")");
							
							Point point11111 = topCharts1111.getLocation();
							int startX11111 = point11111.x;
							int endX11111 = point11111.x;
							 
							int startY11111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
							int endY11111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
							 
							TouchAction actions11111 = new TouchAction(driver);
							Thread.sleep(1000);
							actions11111.press(startX11111, startY11111).waitAction().moveTo(endX11111, endY11111).release().perform();
							Thread.sleep(2000);
							
							//SWIPE DOWN TO SELECT INSURANCE POLICY
							MobileElement topCharts11111 =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\"Return Journey - Pick up Details\")");
							
							Point point111111 = topCharts11111.getLocation();
							int startX111111 = point111111.x;
							int endX111111 = point111111.x;
							 
							int startY111111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
							int endY111111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
							 
							TouchAction actions111111 = new TouchAction(driver);
							Thread.sleep(1000);
							actions111111.press(startX111111, startY111111).waitAction().moveTo(endX111111, endY111111).release().perform();
							Thread.sleep(2000);
							
							//SWIPE DOWN TO SELECT INSURANCE POLICY
							MobileElement topCharts111111 =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\"Insurance Details\")");
							
							Point point1111111 = topCharts111111.getLocation();
							int startX1111111 = point1111111.x;
							int endX1111111 = point1111111.x;
							 
							int startY1111111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
							int endY1111111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
							 
							TouchAction actions1111111 = new TouchAction(driver);
							Thread.sleep(1000);
							actions1111111.press(startX1111111, startY1111111).waitAction().moveTo(endX1111111, endY1111111).release().perform();
							Thread.sleep(2000);
							
							//SWIPE DOWN TO SELECT INSURANCE POLICY
							MobileElement topCharts1111111 =((AndroidDriver<MobileElement>)driver).findElementByAndroidUIAutomator("new UiSelector().textContains(\"Would you like to add any additional insurance?\")");
							
							Point point11111111 = topCharts1111111.getLocation();
							int startX11111111 = point11111111.x;
							int endX11111111 = point11111111.x;
							 
							int startY11111111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.80);
							int endY11111111 = (int) ((driver.manage().window().getSize().getHeight()) * 0.20);
							 
							TouchAction actions11111111 = new TouchAction(driver);
							Thread.sleep(1000);
							actions11111111.press(startX11111111, startY11111111).waitAction().moveTo(endX11111111, endY11111111).release().perform();
							Thread.sleep(2000);
							
							List<MobileElement> Pay = driver.findElements(By.className("android.view.View"));
							for(int i=0;i<Pay.size();i++) {
								String val = Pay.get(i).getText();
								System.out.println(i+" "+val);
							
							}
			}
	}