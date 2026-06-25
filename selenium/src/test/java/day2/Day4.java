//package day2;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Day4 {
//	public static void main(String[] args) {
//
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/");
//
//		Point p = driver.manage().window().getPosition();
//
//		int x = p.getX();
//		int y = p.getY();
//
//		if (x < 1000 && y < 1000) {
//
//			Dimension d = driver.manage().window().getSize();
//
//			int width = d.getWidth();
//			int height = d.getHeight();
//
//			if (width < 800 && height < 600) {
//
//				driver.get("https://www.qspiders.com");
//
//			} else {
//
//				driver.manage().window().setSize(new Dimension(600, 550));
//			}
//		}
//	}
//}
package day2;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            Point browserPosition = driver.manage().window().getPosition();

            if (browserPosition.getX()<1000 && browserPosition.getY()<1000)
            {
               Dimension browserDimension = driver.manage().window().getSize();

                if (browserDimension.getWidth()<800 && browserDimension.getHeight()<600)
                {
                    driver.get("https://qspiders.com/");
                }

                else{

                    driver.manage().window().setSize(new Dimension(600,550));

                    driver.get("https://chat.qspiders.com/");
                }
            }
            else
            {
               driver.manage().window().setPosition(new Point(500,600));

               driver.get("https://www.facebook.com/");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}