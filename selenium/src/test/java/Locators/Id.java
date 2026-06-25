package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id {
	public static void main(String args[]) throws Exception {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.youtube.com/");
		WebElement ele=driver.findElement(By.name("search_query"));
		ele.sendKeys("Telugumovies");
		WebElement sea=driver.findElement(By.className("ytIconWrapperHost"));
		
	}

}
