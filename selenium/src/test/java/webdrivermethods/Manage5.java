package webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage5 {
	public static void main(String args[]){
		try {
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(2000);
			driver.manage().window().setPosition(new Point(300,300));
		System.out.println(driver.manage().window().getPosition());
		Point point=driver.manage().window().getPosition();
		int xaxis=point.getX();
		int yaxis=point.getY();
		System.out.println("Xais:"+xaxis);
		System.out.println("Width:"+yaxis);
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
