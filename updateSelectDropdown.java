
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class updateSelectDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
	       
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	//	driver.findElement(By.id("hrefIncAdt")).click();// select one = 2 adults 
		// calculating into seven times. 
	/*	
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		driver.findElement(By.id("hrefIncAdt")).click();
		*/
		
		
		
		/*
		 * using while loop we can skip the required step
		 * 
		 
		// setting the condition 
		int i =1;
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();//4 times 
			i++;
			
		}
		*/
		
		/*
		 * using the for loop instead of while loop 
		 */
		
		
		
		for(int i=1; i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();//4 times 
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
	}

	}

		
	/*	
		
		// find the element in page source code 	
		
		// Dropdown with the select tag 
		
		// all this method is applicable when we have a select tag
		WebElement staticdropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		// this only support single option select
		Select dropdown= new Select(staticdropdown);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());`
		
		*/
		
	

