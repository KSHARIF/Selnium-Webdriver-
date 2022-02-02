

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
        //ChromeDriver driver =new ChromeDriver();
		
		// test case for selenium java 
		// Selenium code- 
		
		
		
		/* class name = chromedriver ----x
		 * x driver= new X();
		 * 
		 * 
		 * 
		 
		// create driver objects for chrome browser 
		// we will strictly implement methods of webbdriver 
	// webdriver.chrome.driver 	C:\chromedriver.exe 
	 * 
	 */

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	
		System.out.println(driver.getCurrentUrl());
	      
		
		
		// System.out.println(driver.getPageSource());
	       // to get another websites 
			driver.get("http://facebook.com");
			
			
			driver.navigate().back();
			driver.navigate().forward();
			// It closes the current browser
		//	driver.close();
			// to close all the browser opened by selenium script 
		//	driver.quit();
			
	}
	

}
