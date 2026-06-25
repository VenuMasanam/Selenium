package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managemethods {
	public void managemax() {
		try {
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().maximize();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void managemin() {
		try {
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().minimize();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void managefull() {
		try {
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().fullscreen();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void managesetposition() {
		try {
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().setSize(new Dimension(400, 400));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void setpostion() {
		try {
			WebDriver driver=new ChromeDriver();
			Thread.sleep(2000);
			driver.manage().window().setPosition(new Point(100, 100));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}