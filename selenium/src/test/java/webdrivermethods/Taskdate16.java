package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import relativelocator.Relative;

public class Taskdate16 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn25']")).sendKeys("titan watches");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	driver.findElement(RelativeLocator.with(By.xpath("//div[@class='ybaCDx'][3]")).
			        toRightOf(driver.findElement(By.xpath("//div[@class='buvtMR'][3]"))));
//		WebElement element = driver.findElement(
//			    RelativeLocator.with(By.xpath("(//div[@class='ybaCDx'])[3]"))
//			                   .toRightOf(driver.findElement(By.xpath("(//div[@class='buvtMR'])[3]")))
//			);

	}

}
