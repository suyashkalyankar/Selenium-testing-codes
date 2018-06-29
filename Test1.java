package Lynda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author suyashkalyankar
 *
 * Testing selenium blog Website Log In functionality
 *
 */


public class Test1 {
	
	public static void main (String[]args) {
		WebDriver web;
		
		
		//set  web.driver.chrome property to its executable's location
		System.setProperty("webdriver.chrome.driver", "/Users/suyashkalyankar/Documents/Softwares/eclipse/chromedriver");

		web= new ChromeDriver();
		
		// Start Web page and Locate elements of signup
		
		//To get URL 
		web.get("http://selenium-blog.herokuapp.com/signup");
		
		//Find Element for username and enter username
		
		web.findElement(By.id("user_username")).sendKeys("Username");
		
		//Find Element for email and enter mail
		
		web.findElement(By.id("user_email")).sendKeys("test@email.com");
		
		//Find Element for password and enter password
		
		web.findElement(By.id("user_password")).sendKeys("password");
		
		//Find Submit button and click submit button after entering details
		
		web.findElement(By.id("submit")).click();

		
	}

}
