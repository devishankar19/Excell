package webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class alert {
    static WebDriver driver;
   	public static void main(String[] args) {
		driver = new ChromeDriver();
		
		// Put an Implicit wait, 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Launch the URL
		driver.get("file:///C://Users//Administrator//Documents//alert.html");
		
		
		//Click the link to activate the alert
		driver.findElement(By.linkText("Show prompt")).click();
		
		driver.switchTo().alert().accept();
		
		driver.findElement(By.linkText("Show prompt")).click();
		driver.switchTo().alert().dismiss();
		
		
		

		//Wait for the alert to be displayed and store it in a variable
	//	Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		//Store the alert text in a variable
		//String text = alert.getText();

		//Press the OK button
		//alert.accept();
		
   	}
}
		