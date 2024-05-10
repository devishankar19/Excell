package webdriver;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frameExample {
	static WebDriver driver;
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// open the browser with the url
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		driver.switchTo().frame("mce_0_ifr");
		WebElement editor = driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p"));
		editor.clear();
		
		editor.sendKeys("Content sent from script!");
		
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		
		
		
	}

}