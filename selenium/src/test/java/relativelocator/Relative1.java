package relativelocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
 class Relative1 {
		// TODO Auto-generated method stub
		
	  void relative1() throws Exception{
		try {
			WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			driver.findElement(RelativeLocator.with(By.id("small-searchterms")).below(By.cssSelector("a[href='/register']")))
			.sendKeys("Books");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}
