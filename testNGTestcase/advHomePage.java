package testNGTestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class advHomePage {
	
	boolean res;
	static WebDriver driver;
	//Constructor
	public advHomePage(WebDriver driver) {
	
		this.driver=driver;
	}
	
	//Element reference
	By Icon = By.id("menuSearch");
	By Searchbar = By.id("autoComplete");
	By Items = By.xpath("//*[contains(@class,\"titleItemsCount\")]//parent::p");
	//By footer = By.partialLinkText("Selenium");
	
	//methods
	
	public boolean checkboxispresent()
	{
		try {
			WebElement searchbox=driver.findElement(Searchbar);
			System.out.println(searchbox);
			res=true;
		}
		catch(NoSuchElementException e) {
			System.out.println("Search box not found");
			res=false;
		}
		return res;
		
	}
	
	public void clickLense()
	{
		driver.findElement(Icon).click();
	}
	
	public void entersearchword(String s)
	{
		driver.findElement(Searchbar).sendKeys(s + Keys.ENTER);
		System.out.print(s + "-");
		
	}
	
	public boolean checkSearchResult() {
		try {
			String Howmany=driver.findElement(Items).getText();
			System.out.println(Howmany);
			res=true;
		}
		catch(NoSuchElementException e) {
			System.out.println("No results found for" );
			res=false;
		}
		
		return res;
		}
		
		}
	
	



