package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Firsttestcase {
	public static void main(String args[]) throws InterruptedException {
	
	System.out.println("My first day");
	
	WebDriver driver=new ChromeDriver();//upcasting   
	
	//get method
	driver.get("https://www.facebook.com/");
	
	//get title method
	String act_title=driver.getTitle();
	
	System.out.println(act_title);
	if(act_title.equals("Facebook")) {
		System.out.println("TC pass");
	}
	else {
		System.out.println("TC fail");
		
	}
	Thread.sleep(10000);
	
	driver.close();
	}

}
