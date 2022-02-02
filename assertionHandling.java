

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

// import the libraries while using assertion 
import org.testng.Assert;

public class assertionHandling {
	public static void main(String[] args) throws InterruptedException {
		
	       
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		// using assertion process or method to check the required status of checkbox 
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
	
	
	
		System.out.println("Status of checkbox:"+ driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		// implementing the click function 
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		// using assertion process or method to check the required status of checkbox 
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		System.out.println("Status of checkbox:"+ driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		
		System.out.println("Number of checkbox: "+ driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		System.out.println("Number of person chose before the test performed:"+ driver.findElement(By.id("divpaxinfo")).getText());
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
		/*result for the wrong assertion 
		 * Exception in thread "main" java.lang.AssertionError: expected [ 5 Adult] but found [4 Adult]
		 * 
		 * */
		driver.findElement(By.id("btnclosepaxoption")).click();
	//	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), " 5 Adult");
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText()," 5 Adult");
		System.out.println("Number of person chose after the test performed:"+ driver.findElement(By.id("divpaxinfo")).getText());
		
	}

	}
