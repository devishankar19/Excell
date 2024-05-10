package general;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import io.github.bonigarcia.wdm.WebDriverManager;
public class testExtentReports {
  
//creating driver object
 private static WebDriver driver = null;
 //setting expected title from the ebay.com
 static String expectedTitleebay ="Electronics, Cars, Fashion, Collectibles & More | eBay";
  
public static void main(String[] args) throws InterruptedException {
  
//create the htmlReporter object 
  ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
//create ExtentReports and attach reporter(s)
  ExtentReports extent = new ExtentReports();
  extent.attachReporter(htmlReporter);
//creates a toggle for the given test, add all log events under it
  ExtentTest test1 = extent.createTest("ebay Search Test", "Test to validate search box ");
  
//initializing and starting the browser
  //WebDriverManager.chromedriver().setup();
  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
  driver = new ChromeDriver();
  test1.log(Status.INFO, "Starting test case");
//maximize the window 
  driver.manage().window().maximize();
  test1.pass("maximized the window");
  
//Navigate to Ebay.com
  driver.get("https://www.ebay.com");
  Thread.sleep(1000);
  test1.pass("Navigated to Ebay.com");
  
//compare whether the title id matching
  String actualTitle = driver.getTitle();
  Assert.assertEquals(actualTitle, expectedTitleebay);
  test1.pass("Title is correct as expected.");
  
//enter in the TextBox
  driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Mobile");
  test1.pass("Searched for Mobile");
  
  //hit enter
  driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).sendKeys(Keys.RETURN); 
  test1.pass("Pressed keyboard Enter key");
  
  driver.close();
  
  test1.pass("Closed the browser");
  test1.info("Test Completed");
   
  //write results into the file
  extent.flush();
 }
}