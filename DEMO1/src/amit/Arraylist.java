package amit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	
static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<String> a=new ArrayList<String>();
		
		int n=a.size();
		System.out.println(n);
		
		a.add("Virat");
		a.add("ABD");
		
		int n2=a.size();
		System.out.println(n2);
		
		String st=a.get(0);
		System.out.println(st);
		
		for(int i=0;i<n2;i++) {
			
			String s2=a.get(i);
		System.out.println(s2);
		}
		
		Collections.sort(a);
		int sorted=a.size();
		System.out.println(sorted);
		
		System.out.println("after sorting");
		for(String b:a) {
			System.out.println(b);
		}
		}
		
		

}
