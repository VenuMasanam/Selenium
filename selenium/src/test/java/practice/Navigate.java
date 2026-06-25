package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
	public void navbackandforward() {
		try {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void refresh() {
		try {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(2000);
		driver.navigate().refresh();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void navApplication() {
		try {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
