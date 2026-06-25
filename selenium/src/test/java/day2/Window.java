package day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
public static void main  (String args[]) {
	try {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Point p=driver.manage().window().getPosition();
	int xaxis=p.getX();
	int yaxis=p.getY();
	if(xaxis<1000 && yaxis<1000) {
		Dimension d=driver.manage().window().getSize();
		int width=d.getWidth();
		int height=d.getHeight();
		if(width < 800 && height <600) {
			driver.get("https://www.qspiders.com");
		}
		else {
			driver.manage().window().setSize(new Dimension(600, 550));
			driver.get("https://www.qspiders.com");
		}
	}
	else {
		driver.manage().window().setPosition(new Point(500,600));
		driver.get("https://www.facebook.com/");
	}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}
