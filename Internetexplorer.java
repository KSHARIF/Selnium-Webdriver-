
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;



public class Internetexplorer {

	public static void main(String[] args) {
		
	       
		// create driver objects for firefox  browser 
		// we will strictly implement methods of webbdriver 
	
	 

		
		
		
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		WebDriver driver =new InternetExplorerDriver ();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
       
	}
	

}

