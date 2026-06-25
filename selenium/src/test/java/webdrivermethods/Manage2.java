package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage2 {
	public static void main(String args[]){
		try {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			driver.manage().window().minimize();
			
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
