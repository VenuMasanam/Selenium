package day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Webdrivermethod {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		
		
//Navigate() :-
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().to("https://chatgpt.com/");
		Thread.sleep(3000);
		URL u = new URL("https://www.google.com");
		driver.navigate().to(u);
		driver.close();
		

		
//Manage():-
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//driver.manage().window().setSize(new Dimension(500,500));
		//driver.manage().window().setPosition(new Point(200,200));
//		driver.manage().window().minimize();
//		Thread.sleep(5000);
//		driver.quit();
		
		
		
	}

}
