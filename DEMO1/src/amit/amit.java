package amit;

import org.openqa.selenium.chrome.ChromeDriver;

class amit {
	// public static void knit() {
		// System.setProperty("webdriver.chrome.driver","./driver/ChromeDriver.exe");
	// }
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/ChromeDriver.exe");
	}
	

	public static void main(String[] args) {
		//amit.init();
		
		ChromeDriver driver= new ChromeDriver();
		driver.close();
		
	}

}
