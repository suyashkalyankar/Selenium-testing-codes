package Lynda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * 
 * @author suyashkalyankar
 *
 * Testing login functionality website www.courses.ultimateqa.com
 *
 */
public class Test2 {
	
	public static void main(String[]args) {
		
		WebDriver driver;
		
		//set  web.driver.chrome property to its executable's location
		System.setProperty("webdriver.chrome.driver", "/Users/suyashkalyankar/Documents/Softwares/eclipse/chromedriver");

		
		driver=new ChromeDriver();
		
		//Get  Website
		driver.get("https://courses.ultimateqa.com/users/sign_in");
		
		
		//Inspect Element for Username
		driver.findElement(By.id("user_email")).sendKeys("Test@email.com");
		
		
		//Inspect Element for Password
		driver.findElement(By.id("user_password")).sendKeys("Test@1");
		
		
		//Inspect Element for SignIn Button
		driver.findElement(By.id("btn-signin")).click();
	
		
	}

}
