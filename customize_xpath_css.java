import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class customize_xpath_css {

		public static void main(String[] args) {
			
		       
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("http://facebook.com");
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			// find the element in page source code 
			

			
		
			
			// ----normal taken xpath from the browser 
			//driver.findElement(By.cssSelector("#email")).sendKeys("rimu111");
			//driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("dfdfdfdf");
			//driver.findElement(By.xpath(" //*[@id=\'u_0_h_eo\']")).click();
			//driver.findElement(By.xpath(" /html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a      ")).click();
			
			
			// ---generate own customize xpath
			//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("rimu111");
			
			//driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("rimu111");
			
			//driver.findElement(By.xpath("//button[@value='1']")).click();
			
			
			
			//----generate own customize css selector 
			
			driver.findElement(By.cssSelector("input[id='email']")).sendKeys("adbfkdsbfj");
			
			driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("adbfkdsbfj");
			
			
			driver.findElement(By.cssSelector("button[name='login']")).click();
			
			System.out.println(driver.findElement(By.cssSelector("div._9ay7")).getText());
			
			//driver.close();
			
		}

	}



	
/*	How to make customize xpath 
 * Syntax for xpath ----> //tagName[@attributes='value']
 * 
 * 
 * Login button code 
 * 
 * <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_h_4U">…</button>
 *      //button[@name='login']
 *   
 *      
 *      
 *      //button[@value='1']
 * <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" name="login" data-testid="royal_login_button" type="submit" id="u_0_d_j/">Log In</button>
 * 
 * another way to write the syntax
 * ------->//*[@value='1']
 * 
 * How to make customize CSS
 * 
 * Syntax for CSS----> tagName[attributes='value']
 * 
 * In CSS short form 
 * 
 *Short form CSS-----> [attributes='value']
 *
 *
 *another short form CSS--------> tagname#id
 * another short form CSS-------> tagname.class
 * 
 * 
 * 
 * ----------Regular expression ----------------------
 * it contain the part where the value are changing 
 * 
 * xpath------> //tagName[contains@attributes,'value')]
 * 
 * 
 * CSS ---> tagName[attributes*='value']
 * 
 * 
 * 
 * 
 * 
 * */
