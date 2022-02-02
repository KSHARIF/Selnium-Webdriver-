


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class dynamicDropDown {

	public static void main(String[] args) throws InterruptedException  {
		
	       
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

	
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		//	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).click();
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).getText());

		
		driver.findElement(By.name("ctl00$mainContent$ddl_originStation1")).click();
		System.out.println(driver.findElement(By.name("ctl00$mainContent$ddl_originStation1")).getText());
		driver.findElement(By.xpath("//a[@text='Chennai (MAA)']")).click();

		//Thread.sleep(2000L);

		driver.findElement(By.xpath("(//a[@text='Bengaluru (BLR)'])[2]")).click();

}
}