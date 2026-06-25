package webdrivermethods;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate1 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		try {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://lovable.dev/");
		Thread.sleep(2000);
		driver.navigate().to(new URL("https://www.flipkart.com/"));
	}
		catch(Exception e) {
			e.printStackTrace();
		}

}
	
}
