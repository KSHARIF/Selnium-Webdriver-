import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram {
	public static void main(String[] args) {
		
	       
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://instagram.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// find the element in page source code 
	
	driver.findElement(By.xpath("//*[@id=\'loginForm\']/div/div[1]/div/label/input]")).sendKeys("dfjsdnjfnalf");
	//driver.findElement(By.cssSelector("input[class='_2hvTZ pexuQ zyHYP']")).sendKeys("djanjka");
	

  }
}






//Syntax for xpath ----> //tagName[@attributes='value']
//Syntax for CSS-------> tagName[attributes='value']
/*
 * <input aria-label="Password" aria-required="true" 
 * autocapitalize="off" autocorrect="off" 
 * name="password" type="password" class="_2hvTZpexuQzyHYP" value="">
 * 
 * 
 */