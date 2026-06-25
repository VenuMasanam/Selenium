package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getPageSource());
		}
		catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
