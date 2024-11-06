package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass_SignandLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
		
		
		try {
			
			driver.get(" https://www.guvi.in/");
			
			WebElement Signuplink = driver.findElement(By.xpath("//a[contains(text(),'Sign up')]"));
			Signuplink.click();
			
			//enter th name
			driver.findElement(By.id("name")).sendKeys("Sivakumar");
			
			//enter the email
			driver.findElement(By.id("email")).sendKeys("siva95@gmail.com");
			//enter the pasdword
			driver.findElement(By.id("password")).sendKeys("siva24");
			//enter the mobile number
			driver.findElement(By.id("mobileNumber")).sendKeys("2415632155");
			
			Thread.sleep(1000);
			
			//click the signup button
			WebElement SignupButton = driver.findElement(By.id("signup-btn"));
			SignupButton.click();
			
			Thread.sleep(1000);
			//click the may be later
			WebElement ButtonMaybeLater = driver.findElement(By.id("laterBtn"));
			ButtonMaybeLater.click();
			
			Thread.sleep(3000); // Wait for 3 seconds (use WebDriverWait in production)
            String signupPageTitle = driver.getTitle();
            if (signupPageTitle.contains("Welcome")) {
                System.out.println("User registered successfully.");
            }

            // Step 6: Locate and click the Login button
            WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
            loginButton.click();

            // Step 7: Fill in the login form
            driver.findElement(By.name("email")).sendKeys("dummyuser@example.com");
            driver.findElement(By.name("password")).sendKeys("DummyPassword123");

            // Step 8: Click on the Login button to submit the form
            WebElement submitLoginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
            submitLoginButton.click();

            // Step 9: Wait for the page to load and verify login
            Thread.sleep(3000); // Wait for 3 seconds (use WebDriverWait in production)
            String loginPageTitle = driver.getTitle();
            if (loginPageTitle.contains("Dashboard")) {
                System.out.println("User logged in successfully.");
            }
			
//			driver.get(" https://www.guvi.in/");
//			WebElement LoginupLink = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
//			LoginupLink.click();
//			
//			//Enter the register Email id
//			driver.findElement(By.id("email")).sendKeys("siva95@gmail.com");
//			//Enter the Register password
//			driver.findElement(By.id("password")).sendKeys("siva24");
//			//Click the login button
//			WebElement LoginButton = driver.findElement(By.id("login-btn"));
//			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			driver.quit();
			
		}
		

	}

}
