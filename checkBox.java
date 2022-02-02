
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
public class checkBox {
	
	public static void main(String[] args) throws InterruptedException {
		
	       
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//. ------> use isSelected function to know the status of checkbox 
		
		// Before the test--> check the status of checkbox 
		System.out.println("Status of checkbox:"+ driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		// selecting or checking the checkbox 
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		//--------> After the test------check the status of checkbox 
		System.out.println("Status of checkbox:"+ driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		// count the number of checkbox present in the webpage 
		//-----step 1= find the common locator among all the checkbox 
		// ---use "" .size "" method to get the number of checkbox in the consule pannel 
		/*
		 * Size() method is used to get the list size of the elements
			Here getsize is used to get the webelement size like height and Width of that particular element
			(8,20) is height and width of the element
			here you have use ''''''driver.findElements''''''' ---plural version of findelemeent 
		 * 
		 * */
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
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println("Number of person chose after the test performed:"+ driver.findElement(By.id("divpaxinfo")).getText());
		
	}

	}
