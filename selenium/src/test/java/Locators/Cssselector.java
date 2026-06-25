package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//tag-id(here tag is not mandatory) and (#) by using->(#)id-selector representing
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Laptops");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Laptops");
		
		//tag-class->tag.classname tag name is not mandatory
		driver.findElement(By.cssSelector("a.ico-wishlist")).click();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

}
