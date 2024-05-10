package smoketest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homepage {
	
	static WebDriver driver;

	@Test
	public static void OpenBrowser()
	{
		driver = new ChromeDriver();
		
		driver.get("https://www.redbus.com/");
	}

}
