
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class autoSuggestiveDropDown {
	public static void main(String[] args) throws InterruptedException  {
		
	       
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(3000);
		/*Here we use " findelements" plural version to get all the list from the tab
		 * */
		
		
		List<WebElement> options= driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
	
		for(WebElement option :options) 
			{	
				if(option.getText().equalsIgnoreCase("India"))
				{
					option.click();
					break;
				}
			
			
			}
	
	
	
	
	
	
	}
}
