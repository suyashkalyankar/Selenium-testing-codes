package Lynda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/**
 * 
 * @author suyashkalyankar
 *
 * Testing Website courses.ultimateqa.com sign up Functionality
 *
 */
public class Test3 {

	public static void main (String[]args) {
		
		
		WebDriver driver;
		
		//set  web.driver.chrome property to its executable's location
		System.setProperty("webdriver.chrome.driver", "/Users/suyashkalyankar/Documents/Softwares/eclipse/chromedriver");
		
		
		driver=new ChromeDriver();
		
		//Get link and open website
		driver.get("https://courses.ultimateqa.com/users/sign_in");
		
		
		//click on reference link - Create a new account
		
		driver.findElement(By.linkText("Create a new account")).click();
		
		//Enter First Name to register
		driver.findElement(By.id("user_first_name")).sendKeys("John");
		
		//Enter Last Name to Register
		driver.findElement(By.id("user_last_name")).sendKeys("Smith");
		
		//Enter Email address
		driver.findElement(By.id("user_email")).sendKeys("John.smith@email.com");
		
		//Enter Password
		driver.findElement(By.id("user_password")).sendKeys("password");
		
		//Click on Sign in button
		driver.findElement(By.id("btn-signup")).click();
		
	}
	
}
