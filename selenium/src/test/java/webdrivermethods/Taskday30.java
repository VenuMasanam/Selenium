package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskday30 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		try {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.cssSelector("input.email")).sendKeys("rank123@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("rank@123");
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			driver.findElement(By.linkText("Books")).click();
			Thread.sleep(6000);
			driver.findElement(By.linkText("Computing and Internet")).click();
			Thread.sleep(9000);
			String price=driver.findElement(By.className("price-value-13")).getText();
			System.out.println(price);
			Thread.sleep(2000);
			driver.findElement(By.cssSelector("input[id=add-to-cart-button-13]")).click();
			Thread.sleep(6000);
			driver.findElement(By.id("topcartlink")).click();
			Thread.sleep(2000);
			String totalprice=driver.findElement(By.className("product-price")).getText();
			System.out.println(totalprice);
			if(price.equals(totalprice)) {
				System.out.println("price matched"+"price: "+price+"Total Price"+totalprice);
			}
			else {
				System.out.println("Price not mathced "+price+"Total Price"+totalprice);;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
