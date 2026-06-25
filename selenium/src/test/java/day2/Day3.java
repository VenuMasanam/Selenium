package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3 {
	public static void main(String args[]) {
		 WebDriver driver=new ChromeDriver();
		 try {
			 //driver.get("https://www.amazon.in/");
			 //Thread.sleep(2000);
			 //driver.manage().window().minimize();
//			 WebElement ele=driver.findElement(By.id("twotabsearchtextbox"));
//			 Thread.sleep(2000);
//			 driver.manage().window().maximize();
			 String actualurl="https://www.amazon.in/";
			 driver.get(actualurl);
//			 if(driver.getCurrentUrl().equals(actualurl));
//			 {
//				 
//				 driver.manage().window().maximize();
//				 Thread.sleep(2000);
//				 if(driver.getTitle().contains("shopping"));
//				 {
//					 driver.manage().window().fullscreen();
//					 Thread.sleep(2000);
//				 }
//			 }
			 driver.manage().window().setSize(new Dimension(600, 600));
			 System.out.println( driver.manage().window().getPosition());
			 Thread.sleep(3000);
			 driver.manage().window().setPosition(new Point(200, 200));
			 Thread.sleep(2000);
			 driver.manage().window().setPosition(new Point(300, 500));
			 Thread.sleep(2000);
			 driver.manage().window().setPosition(new Point(500, 500));
			 Thread.sleep(2000);
		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 driver.quit();
	}

}
