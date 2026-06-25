package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Waits2 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration. ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.withTimeout(Duration.ofSeconds(20));
		wait.ignoring(Exception.class);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loginBtn']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Email']"))).sendKeys("test123@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Password']"))).sendKeys("test@123");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='Login']"))).click();
//		
	}

}
