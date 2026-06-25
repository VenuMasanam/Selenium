package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage4 {
	public static void main(String args[]){
		try {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			driver.manage().window().setSize(new Dimension(500, 500));
		System.out.println(driver.manage().window().getSize());
		Dimension dim=driver.manage().window().getSize();
		int width=dim.getWidth();
		int height=dim.getHeight();
		System.out.println("Width:"+width);
		System.out.println("Width:"+height);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
