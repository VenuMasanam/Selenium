package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Waitszepto {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration. ofSeconds(30));
		driver.get("https://www.zepto.com/");
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.withTimeout(Duration.ofSeconds(20));
		wait.ignoring(Exception.class);
		driver.manage().window().maximize();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Toys']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href,'/pn/dearjoy-small-cat-with-a-hoodie-blue-22-cm/pvid/bd805a54-2693-4688-9da0-650ab76e1a6d')]"))).click();
	}

}
