package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11062026 {
	public static void main(String[] args) {
		try {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("9121498105");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Msri@9121");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Search']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@aria-label='Search input']")).sendKeys("Bhanu Masanam");
		Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
