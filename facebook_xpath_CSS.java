import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;





public class facebook_xpath_CSS {
	public static void main(String[] args) {
		
	       
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// find the element in page source code 
		

/*		Change normal xpath to java xpath 
		--- remove the double semicolon, convert into single xpath
		xpath------------> //*[@id="Login"]
		java xpath-------> //*[@id='Login']

*/

		
		// do the same thing by using xpath and css 
		
		
		driver.findElement(By.cssSelector("#email")).sendKeys("rimu111");
		driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("dfdfdfdf");
		//driver.findElement(By.xpath(" //*[@id=\'u_0_h_eo\']")).click();
		driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a      ")).click();
		
	}

}


// 	note for validing or checking perfect xpath and Css selector 
// 	go the consule tab after entering inspect method of a page 
//  type ----> $x(" xpath     ")
//  type-----> $x(" Css selector ")