package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Taskday29 {
public static void main(String[] args) {
	try {
	WebDriver driver=new ChromeDriver();
	driver.get("https://chat.qspiders.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("9121498105");
	driver.findElement(By.id("password")).sendKeys("Venu@123");
	driver.findElement(By.className("rs-btn")).click();
	Thread.sleep(9000);
	driver.findElement(By.cssSelector("input[name='search']")).sendKeys("Anand");
	Thread.sleep(6000);
      driver.findElement(By.cssSelector("div[class*=_chat_ConversationBlock]>div")).click();
   Thread.sleep(8000);
   driver.findElement(By.cssSelector("textarea[id='message']")).sendKeys("Hii Sir This is automated Message");
   Thread.sleep(6000);
   driver.findElement(By.cssSelector("button.chatSubmitButton[type='button']")).click();
   driver.findElement(By.xpath("//a[contains(text(),'Electronics')][1]")).click();
  
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	//driver.findElement(By.cssSelector(null))

	
}
}
