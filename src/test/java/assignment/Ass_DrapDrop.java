package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Ass_DrapDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriver driver = new ChromeDriver();
			
			driver.get("https://jqueryui.com/droppable/");
			
			//Locate searching her locate id
			
			driver.manage().window().maximize();
			
			//wait 15 seconds
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			
			//driver switch to frame 
			driver.switchTo().frame(0);
			
			//source element drag
			WebElement source =driver.findElement(By.id("draggable"));
			
			//source element drop
			WebElement target =driver.findElement(By.id("droppable"));
			
			//Action object class
			
			Actions mouse =new Actions(driver);
			
			mouse.dragAndDrop(source, target).perform();
			driver.quit();

	}

}
