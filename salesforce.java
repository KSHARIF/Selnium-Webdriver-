import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {
	public static void main(String[] args) {
		
	       
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://login.salesforce.com");
	//	System.out.println(driver.getTitle());
	
		
		
		
		
		driver.findElement(By.id("username")).sendKeys("rimu");
		driver.findElement(By.id("password")).sendKeys("rimu");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		//driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
		
		
		
		
		// print the output into console 
		
		System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
		
		
		
		
		System.out.println(driver.getCurrentUrl());
		// find the element in page source code 
		
		
		//--------xpath -> //*[@id="Login"]
		
		//----NOTES FOR JAVA IN CONVERTING THE XPATH INTO SELENIUM PROGRAM
		/* in java, So double code inside the double coding will have a syntax.
		So that's the reason we are changing this double into single.
		And now this ad here that will be gone.
		Let me try it here just to Nordon it.
		To recap, double code inside double chord is not accepted.

		Change normal xpath to java xpath 
		--- remove the double semicolon, convert into single xpath
		xpath------------> //*[@id="Login"]
		java xpath-------> //*[@id='Login']

          div#error.loginError

		 */
		// do the same thing by using xpath and css 
		
		/*
		driver.findElement(By.cssSelector("#email")).sendKeys("rimu111");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("dfdfdfdf");
		driver.findElement(By.xpath(" //*[@id=\'u_0_d_RK\']")).click();
		*/
		
	}
}
