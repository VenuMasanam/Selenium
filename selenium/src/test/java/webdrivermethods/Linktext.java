package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {
	public static void main(String args[]) {
		try {
			WebDriver driver=new  ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			driver.findElement(By.linkText("Log in")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Log in")).click();
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Shopp")).click();
			Thread.sleep(2000);
			
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
