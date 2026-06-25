package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Taskdate03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			driver.findElement(By.xpath("//input[@class='email']")).sendKeys("rank123@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class='password']")).sendKeys("rank@123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//a[normalize-space()='Apparel & Shoes'])[3]")).click();                         
			Thread.sleep(6000);
			driver.findElement(By.xpath("(//a[text()='Blue and green Sneaker'])[2]")).click();
			Thread.sleep(6000);
			driver.findElement(By.xpath("//span[@title='Green']")).click();
			Thread.sleep(4000);
			WebElement ele=driver.findElement(By.xpath("//input[@class='qty-input']"));
			ele.clear();
			ele.sendKeys("1");
			driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
			Thread.sleep(2000);
			driver.quit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
