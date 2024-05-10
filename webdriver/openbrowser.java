package webdriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class openbrowser {

	static WebDriver driver;
	
	
		
		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
					
			System.setProperty("webdriver.chrome.driver","static WebDriver driver;\r\n"
					+ "	\r\n"
					+ "	@SuppressWarnings(\"deprecation\")\r\n"
					+ "	public static void main(String[] args) {\r\n"
					+ "				\r\n"
					+ "		System.setProperty(\"webdriver.chrome.driver\",\"C:\\\\C:\\Users\\Administrator\\eclipse-workspace\\mavenexcel\\chromedriver-win64\");\r\n"
					+ "				\r\n"
					+ "		ChromeOptions options = new ChromeOptions();\r\n"
					+ "	    options.setBrowserVersion(\"124\");\r\n"
					+ "	    driver = new ChromeDriver(options);\r\n"
					+ "	    \r\n"
					+ "	    //global wait- implicit wait \r\n"
					+ "	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);\r\n"
					+ "		\r\n"
					+ "		driver.get(\"https://the-internet.herokuapp.com/login\");\r\n"
					+ "		\r\n"
					+ "		String actual_title = driver.getTitle();\r\n"
					+ "		String expected_title = \"The Internet\";\r\n"
					+ "		\r\n"
					+ "		\r\n"
					+ "		if (actual_title.equals(expected_title))\r\n"
					+ "		{\r\n"
					+ "			System.out.println(\"Title test case Passed\");\r\n"
					+ "		}\r\n"
					+ "		else\r\n"
					+ "		{\r\n"
					+ "			System.out.println(\"Failed\");\r\n"
					+ "		}	\r\n"
					+ "		\r\n"
					+ "		\r\n"
					+ "		//check if Login button is present\r\n"
					+ "		\r\n"
					+ "		WebElement submitbtn = driver.findElement(By.cssSelector(\"#login > button\"));\r\n"
					+ "		\r\n"
					+ "		String typeOfBtn = submitbtn.getAttribute(\"type\");\r\n"
					+ "		\r\n"
					+ "		System.out.println(\"The type of button is \" + typeOfBtn);\r\n"
					+ "		\r\n"
					+ "		//Check if password input is not exposing the typed passwords\r\n"
					+ "		WebElement passwordtext = driver.findElement(By.id(\"password\"));\r\n"
					+ "		\r\n"
					+ "		\r\n"
					+ "		String typeOfText = passwordtext.getAttribute(\"type\");\r\n"
					+ "		\r\n"
					+ "		System.out.println(\"Password field is of type \" + typeOfText);\r\n"
					+ "\r\n"
					+ "		\r\n"
					+ "		//Check if footer has a link \"Elemental Selenium\"\r\n"
					+ "		String expectedFooter = \"Elemental Selenium\";\r\n"
					+ "		try {\r\n"
					+ "		\r\n"
					+ "			driver.findElement(By.partialLinkText(\"Elemental\"));\r\n"
					+ "			System.out.println(\"Link \" + expectedFooter+ \" present in page. Page fully loaded.\");\r\n"
					+ "			\r\n"
					+ "		}\r\n"
					+ "		catch (NoSuchElementException e)\r\n"
					+ "		{\r\n"
					+ "			System.out.println(\"Link \" + expectedFooter+ \" not present in page\");\r\n"
					+ "		}\r\n"
					+ "		\r\n"
					+ "	    driver.close();\r\n"
					+ "	    \r\n"
					+ "	}\r\n"
					+ "\r\n"
					+ "	\r\n"
					+ "}");
					
			ChromeOptions options = new ChromeOptions();
		    options.setBrowserVersion("124");
		    driver = new ChromeDriver(options);
		    
		    //global wait- implicit wait 
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get("https://the-internet.herokuapp.com/login");
			
			String actual_title = driver.getTitle();
			String expected_title = "The Internet";
			
			
			if (actual_title.equals(expected_title))
			{
				System.out.println("Title test case Passed");
			}
			else
			{
				System.out.println("Failed");
			}	
			
			
			//check if Login button is present
			
			WebElement submitbtn = driver.findElement(By.cssSelector("#login > button"));
			
			String typeOfBtn = submitbtn.getAttribute("type");
			
			System.out.println("The type of button is " + typeOfBtn);
			
			//Check if password input is not exposing the typed passwords
			WebElement passwordtext = driver.findElement(By.id("password"));
			
			
			String typeOfText = passwordtext.getAttribute("type");
			
			System.out.println("Password field is of type " + typeOfText);

			
			//Check if footer has a link "Elemental Selenium"
			String expectedFooter = "Elemental Selenium";
			try {
			
				driver.findElement(By.partialLinkText("Elemental"));
				System.out.println("Link " + expectedFooter+ " present in page. Page fully loaded.");
				
			}
			catch (NoSuchElementException e)
			{
				System.out.println("Link " + expectedFooter+ " not present in page");
			}
			
		    driver.close();
		    
		}

		
	
	}


