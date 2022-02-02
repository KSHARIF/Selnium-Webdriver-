import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklocator {
	
public static void main(String[] args) {
		
       
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com");
	//	System.out.println(driver.getTitle());
		
	
		System.out.println(driver.getCurrentUrl());
		// find the element in page source code 
		
		
		// enter email and password 
		
		driver.findElement(By.id("email")).sendKeys("THIS ISMY CODE");
		driver.findElement(By.id("pass")).sendKeys("love rimu");
		driver.findElement(By.linkText("Forgot Password?")).click();
		//driver.findElement(By.linkText("Log In")).click();
			
			
	}
	
	

}

