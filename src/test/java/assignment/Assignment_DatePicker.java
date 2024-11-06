package assignment;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        
        try {
       
		
		driver.get("https://jqueryui.com/datepicker/");
		
		//Locate searching her locate id
		
		driver.manage().window().maximize();
		
		//switch to main frame
	  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
	
	   //select the date picker calender
		WebElement datepicker =driver.findElement(By.id("datepicker"));
		datepicker.click();
		Thread.sleep(2000);
		
		//select the next month
		WebElement nextButton =driver.findElement(By.xpath("//a[@title='Next']"));
		nextButton.click();
		Thread.sleep(6000);
		
		
		//select the date
		 WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='22']"));
         dateToSelect.click();
		
		 System.out.println("Date picked by 22");
		 Thread.sleep(6000);
        }
       
       
        catch (Exception e){
        	e.getStackTrace();
        }
		
		finally{
			driver.quit();
			
		}
		

	}
}



