package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1 {
       public void webdrivers() {
    	   try {
    		   WebDriver driver=new ChromeDriver();
    		   Thread.sleep(4000);
    		   WebDriver driver1=new EdgeDriver();
    		   Thread.sleep(4000);
    		   WebDriver driver2=new FirefoxDriver();
    		   Thread.sleep(4000);
    		   
    	   }
    	   catch(Exception e) {
    		   e.printStackTrace();
    	   }
       }
}
