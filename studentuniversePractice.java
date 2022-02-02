// jubo practice 


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class studentuniversePractice {

	public static void main(String[] args) throws InterruptedException  {
		
	       
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.studentuniverse.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.findElement(By.xpath("(//*[@type='text'])[1]")).sendKeys("OkC");
	//	driver.findElement(By.xpath("(//*[@type='text'])[1]")).click();
		//System.out.println(driver.findElement(By.xpath("(//*[@type='text'])[1]")).getText());
		driver.findElement(By.xpath("(//*[@type='text'])[2]")).sendKeys("JFK");
		
		
		driver.findElement(By.className("form-control ng-pristine ng-empty ng-invalid ng-invalid-required ng-touched")).click();
		
		
		
		driver.findElement(By.xpath("//*[@id=\"flightSearchTemplateScope\"]/div[1]/su-one-way-search/section/div/div[3]/su-flight-datepicker/su-datepicker-popup/section/div/div/aside/su-datepicker-range-default/div/div[1]/div/su-datepicker-month-default/su-datepicker-month/table/tbody/tr[3]/td[3]/su-datepicker-day/button")).click();
		driver.findElement(By.className("btn-block btn btn-primary btn-spin")).click();
	
	}
	
}