package general;

import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import utils.linkChecker;

public class testForBrokenLinksImgLink {

	static WebDriver driver;
	static linkChecker lc;
	boolean result;
	public static int responsecode;
	@BeforeClass
	public void Init()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/broken_images");
	
		lc = new linkChecker();
		
		
	
	}
	
	@Test
	public void brokenImageAndLinkTestCase() throws IOException
	{
	   ////*[self::a or self::img]
		
		
		java.util.List <WebElement> allImagesAndLinks = driver.findElements(By.xpath("//*[self::a or self::img]"));
		 
		
		System.out.println("No of images and Links: " + allImagesAndLinks.size() );
		 
		String url;
		
		/*
		for(int i=0;i < allImagesAndLinks.size();i++)
		{
			  System.out.println(allImagesAndLinks.get(i).getTagName());
		}
			*/
		
			
			
		for (WebElement l: allImagesAndLinks) {
			 
			//print the links i.e. http://example.com or https://www.example.com
			//print the links text
			
		//	System.out.println(l.getAttribute("src"));
		
			String tagname=l.getTagName();
			
			if(tagname.equals("img"))
			{
				url = l.getAttribute("src");
				tagname="Image!";
				responsecode = linkChecker.verifyLink(url);
			}
			else
			{
				 url = l.getAttribute("href");
				tagname="Link!";	
				responsecode = linkChecker.verifyLink(url);
			    
			}
			result = (responsecode==200) ? true : false;
			
			Reporter.log(" Tagname:" + tagname + "--- "  + url + " " +  responsecode + "<br/>" );
			
			
			
		    Assert.assertEquals(true, result);
			
		}

	}

}
