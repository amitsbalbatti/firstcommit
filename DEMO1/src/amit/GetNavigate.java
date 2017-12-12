package amit;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetNavigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//ENTER URL USING GET()
		driver.get("http://desktop-cfkotvr/login.do");
		
		//ENTER URL USING NAVIGATE().TO()
		driver.navigate().to("http://desktop-cfkotvr/license.jsp");
		Thread.sleep(2000);
		//CLICK BACK BUTTON
		driver.navigate().back();
		Thread.sleep(2000);
		//CLICK FORWARD BUTTON
		driver.navigate().forward();
		Thread.sleep(2000);
		//CLICK REFRESH BUTTON
		driver.navigate().refresh();
		
		//GET THE TITEL FROM THE BROWSER
		String titel = driver.getTitle();
		System.out.println(titel);
		
	    //GET THE URL FROM THE ADDRESS BAR
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//CLOSE THE BRORSER
		driver.quit();
		// TODO Auto-generated method stub

	}

}
