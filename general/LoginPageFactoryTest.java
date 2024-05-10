package general;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageFactoryTest {
	 WebDriver driver;
	boolean res;
  @Test
  public void CheckSearchResultsTest() {
  	//  throw new RuntimeException("Test not implemented");
	  
	 
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\eclipse-workspace\\mavenexcel\\chromedriver-win64");
		
		ChromeOptions options = new ChromeOptions();
	    options.setBrowserVersion("124");
	    driver = new ChromeDriver(options);
		
		driver.get("https://www.advantageonlineshopping.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String srch = "mouse";
		driver.manage().window().maximize();
		
		driver.findElement(By.id("menuSearch")).click();
		driver.findElement(By.id("autoComplete")).sendKeys(srch + Keys.ENTER);
		
		
		
		
		
		
		try {
		
		String Howmany=driver.findElement(By.xpath("//*[contains@class,\"titleItemsCount\")]//parent::p")).getText();
		System.out.println(Howmany);
		  res=true;
		}
		
		catch(NoSuchElementException e){
			
			System.out.println("noresult fount for "+srch);
			res=false;
		}
		
		Assert.assertEquals(true, res);
				
  
		
	}
	
	
	

  }

