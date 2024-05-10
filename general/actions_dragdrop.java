package general;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actions_dragdrop {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {		
	
		
		driver = new ChromeDriver();
		 
		String URL = "https://demoqa.com/droppable/";
		 
		driver.get(URL);
		 
		// It is always advisable to Maximize the window before performing DragNDrop action		 
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Actions class method to drag and drop		
		Actions builder = new Actions(driver);
		 
		WebElement from = driver.findElement(By.id("draggable"));
		 
		WebElement to = driver.findElement(By.id("droppable"));	 
		//Perform drag and drop
		builder.dragAndDrop(from, to).perform();
		
		builder.contextClick(from);
		
		//verify text changed in to 'Drop here' box 
		String textTo = to.getText();

		if(textTo.equals("Dropped!")) {
			System.out.println("PASS: Source is dropped to target as expected");
		}else {
			System.out.println("FAIL: Source couldn't be dropped to target as expected");
		}
	
		driver.close();

	}	
 
}
