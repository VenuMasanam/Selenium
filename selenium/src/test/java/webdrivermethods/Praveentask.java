package webdrivermethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Praveentask {

	public static void main(String[] args) throws Exception  {
		WebDriver d = new ChromeDriver();
		Thread.sleep(2000);
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		
	}

}
