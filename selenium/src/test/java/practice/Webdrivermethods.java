package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethods {
	public void getMethod() {
		try {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
		public void getCurrentUrl() {
			try {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
			System.out.println(driver.getCurrentUrl());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
		public void getTitle() {
			try {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
			System.out.println(driver.getTitle());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}
		public void getPageSource() {
			try {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
			System.out.println(driver.getPageSource());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
	}

}
