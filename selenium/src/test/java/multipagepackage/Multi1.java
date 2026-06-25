package multipagepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn25']")).sendKeys("titan watches");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='nZIRY7 yBaAQY'][1]/child::div[4]")).click();
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
