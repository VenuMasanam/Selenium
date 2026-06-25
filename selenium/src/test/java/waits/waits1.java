package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class waits1 {
	public static void main(String[] args) {
		try {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("input.email")).sendKeys("rank123@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("rank@123");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Electronics')])[1]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Camera, photo')])[4]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Digital SLR Camera 12.2 Mpixel')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add your review')]")).click();
		driver.findElement(By.xpath("//input[@id='AddProductReview_Title']")).sendKeys("Good pixel Quality");
		driver.findElement(By.xpath("//textarea[@id='AddProductReview_ReviewText']")).sendKeys("Need to Improve some more things");
		driver.findElement(By.xpath("//input[@value='3']")).click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
