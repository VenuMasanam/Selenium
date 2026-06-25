package waits;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitsspiders {
 public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.get("https://demoapps.qspiders.com/ui/link");
	List<WebElement> ele=driver.findElements(By.tagName("a"));
	for(WebElement elements:ele) {
		System.out.println(elements.getText());
		if(elements.getText().equals("Career")){
			elements.click();
			break;
		}
	}
}
}
