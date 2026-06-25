package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	static WebDriver driver=new ChromeDriver();

public static void login() {
	try {
	driver.get("https://demo.nopcommerce.com/");
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("Jon123@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("Jon123@gmail.com");
	driver.findElement(By.className("button.button-1")).click();

	
	
	}
	catch(Exception e){
		e.printStackTrace();
		
	}
}
public static void registration() {
	try {
		//WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.id("gender-male")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Venu");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("sai");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("Jampe123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("test123@");
		Thread.sleep(2000);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("test123@");
		Thread.sleep(2000);
		driver.findElement(By.id("register-button")).click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
}

}
