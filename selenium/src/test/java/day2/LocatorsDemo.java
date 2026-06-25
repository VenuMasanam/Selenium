package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class LocatorsDemo {
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.findElement(By.className("btn")).click();
		driver.findElement(By.linkText("Login")).click();
		
		
		
		
//		//Find Element By name and Send Keys
//	WebElement searchBox=driver.findElement(By.name("search_query"));
//	searchBox.sendKeys("Selenium Tutorials");
		//driver.findElement(By.name("search_query")).sendKeys("Movies");
//		
//
//		//Find element by id and isDisplayed
//	WebElement ele=driver.findElement(By.id("logo-icon"));
//	boolean status=ele.isDisplayed();
//		
//		boolean status=driver.findElement(By.id("logo-icon")).isDisplayed();
//		System.out.println(status);
//		System.out.println(driver.findElement(By.id("logo-icon")).isDisplayed());
//		
//		//Link Text
//		driver.findElement(By.linkText("Home")).click();
//		driver.findElement(By.linkText("Shorts")).click();
	
		//partial-Link Text
//		
//		driver.findElement(By.partialLinkText("Sho")).click();
		
	//Class Name
		//driver.findElement(By.className("btn btn-link navbar-btn")).click();
		//System.out.println(headerLink.size());
		
	
	}

}
