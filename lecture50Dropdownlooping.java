//  Updated lecture on latest Dropdown looping UI
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;


public class lecture50Dropdownlooping {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// find the element in page source code 
	
	
	driver.findElement(By.id("divpaxinfo")).click();
	
	Thread.sleep(2000L);
	driver.findElement(By.id("hrefIncAdt")).click();//2 adults 
	driver.findElement(By.id("hrefIncAdt")).click();
	driver.findElement(By.id("hrefIncAdt")).click();
	driver.findElement(By.id("hrefIncAdt")).click();
	driver.findElement(By.id("hrefIncAdt")).click();
	
	
	

	
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	
	
	}

}
