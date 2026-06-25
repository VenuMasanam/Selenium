package webdrivermethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	public static void main(String args[]) {
		try {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
