package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day1906 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//a[contains(text(),'Camera, photo')])[4]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital SLR Camera 12.2 Mpixel')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[contains(text(),'Add your review')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='AddProductReview_Title']")).sendKeys("Good pixel Quality");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//textarea[@id='AddProductReview_ReviewText']")).sendKeys("Need to Improve some more things");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@value='3']")).click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
