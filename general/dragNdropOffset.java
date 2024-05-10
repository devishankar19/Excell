package general;

import java.net.SocketException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragNdropOffset {
    static WebDriver driver;
	public static void main(String[] args) throws Exception {		
	
		
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        
        Actions action=new Actions(driver);
        
        WebElement drag = driver.findElement(By.id("draggable")); 
       
        action.dragAndDropBy(drag,150,50).build().perform();
			   driver.close();   
	
}
}