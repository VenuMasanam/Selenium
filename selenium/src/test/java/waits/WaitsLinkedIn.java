package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitsLinkedIn {
	public static void main(String[] args)throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com/feed/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//label[.='Email or phone']/following::input[@type='email'][1]")).sendKeys("venu@gmail.com");
	}

}
