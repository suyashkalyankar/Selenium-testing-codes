package Lynda;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * 
 * @author suyashkalyankar
 *
 * This Scripts contains all the test cases of website courses.ultimateqa.com
 *
 */

public class Test5 {

	public static void main (String[]args) {
		
		//set  web.driver.chrome property to its executable's location
		System.setProperty("webdriver.chrome.driver", "/Users/suyashkalyankar/Documents/Softwares/eclipse/chromedriver");
		
		// Instantiate Driver 
		
		WebDriver driver;
		
		// Instantiate Chrome driver
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Get Website URL and Open it
		
		driver.get("https://courses.ultimateqa.com/users/sign_in");
		
		System.out.println("Website Opened Sucessfully");
		
		//Enter the email in email field
		
		driver.findElement(By.id("user_email")).sendKeys("John.smith@email.com");
		
		System.out.println("Entered email Sucessfully");
		
		//Enter the password in password field
		
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		System.out.println("Entered Password Sucessfully");
		
		//Check Remember me check box
		
		driver.findElement(By.id("user_remember_me")).click();
		
		System.out.println("Checked Remember me Checkbox Sucessfully");
		
		//Click on Sign In button
		
		driver.findElement(By.id("btn-signin")).click();
		
		System.out.println("Signned In Sucessfully");
		
		//Select Course and click on View course "Complete Selenium Webdriver with C#"
		
		driver.findElement(By.className("col-md-12")).click();
		
		System.out.println("Opened selected Course");
		
		//Go Back to the previous page
		
		driver.navigate().back();
		
		//Scroll down and go to the next page
		
		driver.findElement(By.linkText("2")).click();
		
		System.out.println("Moved to the next page sucessfully");
		
		
		// Click on Home on the footer
		
		driver.findElement(By.className("footer-nav__item")).click();
		
		System.out.println("Moved to the Home page");
		
		//Open new page Ultimate QA and open video tutorials
		
		driver.findElement(By.id("menu-item-504")).click();
		
		System.out.println("Sucessfully clicked on video tutorials");
		
		//Click On My Dashboard
		
		driver.findElement(By.linkText("My Dashboard")).click();
		
		System.out.println("Clicked on My Dashboard Sucessfully");
		
		//Go Back to the previous page
			
		driver.navigate().back();
		
		//Click On Drop Down 
		
		driver.findElement(By.className("dropdown-toggle")).click();
		
		System.out.println("Drop down sucessfull");
		
		// Click on My Account for Account details 
		
		driver.findElement(By.linkText("My Account")).click();
		
		System.out.println("Clicked on My Account");
	
		// Check Order history of the account
		
		driver.findElement(By.linkText("Order History")).click();
		
		System.out.println("Opened Order History");
		
		//Go Back to the previous page
		
		driver.navigate().back();
		
		//Enter Company Name
		
		driver.findElement(By.id("user_profile_attributes_company")).sendKeys("XYZ Testing");
		
		System.out.println("Entered Company Name");
		
		

		// Drop down the list of cities and Select city from drop down list
		
		Select dropdown = new Select(driver.findElement(By.id("user_profile_attributes_timezone")));
		
		dropdown.selectByVisibleText("Sydney");

		System.out.println("Drop down is working and city is selected");
		
		driver.findElement(By.className("account-content-footer")).click();
		
		System.out.println("Click on Submit button");
		
		
		//Go Back to the previous page
		
		driver.navigate().back();
		
		System.out.println("Back to Home Page");
		
		//Click On Drop Down 
		
		driver.findElement(By.className("dropdown-toggle")).click();
		
		System.out.println("Drop down sucessfull");
	
		//Sign out from the account
		
		driver.findElement(By.linkText("Sign Out")).click();
		
		System.out.println("Sign out from the account");
		
	}
	
}
