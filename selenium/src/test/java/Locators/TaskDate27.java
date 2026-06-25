package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskDate27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[id^=two]")).sendKeys("Poco mobile");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[class*='nav-input'][type='submit']")).click();
		driver.findElement(By.cssSelector("[class*='flex overflow-x-scroll'] [title='RCB: All Access']")).click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
