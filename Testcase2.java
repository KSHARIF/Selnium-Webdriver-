
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


// Testcase - Do the same thing in firefox 

public class Testcase2 {

	public static void main(String[] args) {
		
       
		// create driver objects for firefox  browser 
		// we will strictly implement methods of webbdriver 
// gecko driver 
		// System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
	
		
	}
	

}
