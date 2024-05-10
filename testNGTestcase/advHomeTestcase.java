package testNGTestcase;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import utils.openChromeBrowser;

public class advHomeTestcase {
	
	public WebDriver driver;
	static advHomePage hp;
	boolean res;
	static String s ="mouse";
	
	
	@AfterClass
	public void closeDriver()
	{
		//driver.quit();
	}
	
	@BeforeClass
	public void initDriver()
	{
		openChromeBrowser ob = new openChromeBrowser();
		
		driver = ob.openChrome();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		hp = new advHomePage (driver);	
	}
	
  @Test(priority=3)
  public void checkResult() {
	  Assert.assertEquals(true, hp.checkSearchResult());
	  
  }
  
  @Test(priority=1)
  public void ClickSearchbar() {
	  hp.clickLense();
  }
  
  @Test(priority=1)
  public void enterSearchword() {
	  
	  hp.entersearchword(s + Keys.ENTER);
	   
	  
  }
}