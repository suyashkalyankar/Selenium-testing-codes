package Lynda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author suyashkalyankar
 *
 * Testing Website courses.ultimateqa.com Sign Up via Linkedin
 *
 */

public class Test4 {

	public static void main(String[]args) {
		
		WebDriver driver;
		
		//set  web.driver.chrome property to its executable's location
				System.setProperty("webdriver.chrome.driver", "/Users/suyashkalyankar/Documents/Softwares/eclipse/chromedriver");
				
			//Instantiate Chrome Driver
				
				driver=new ChromeDriver();
				
			//Get Website URL	
				driver.get("https://courses.ultimateqa.com/users/sign_in");
				
			//Sign up Via Linkedin
				driver.findElement(By.className("user-sign-up__alt-logins")).click();
				
			//Enter Email to access Linkedin
				driver.findElement(By.id("session_key-oauthAuthorizeForm")).sendKeys("John.Smith@email.com");
				
			//Enter Password to acess Linkedin
				driver.findElement(By.id("session_password-oauthAuthorizeForm")).sendKeys("password");
				
			// Click on Access button
				
				driver.findElement(By.className("actions")).click();			
		
	}
}
