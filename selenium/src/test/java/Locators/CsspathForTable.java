package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CsspathForTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
		List<WebElement> subject=driver.findElements(By.cssSelector(""));
		for(WebElement sub:subject) {
			System.out.println(sub.getText());
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	

}

