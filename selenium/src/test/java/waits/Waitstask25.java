package waits;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitstask25 {
	public static void main(String[] args) {
		try {
			  ArrayList<String> desireElement=new ArrayList<String>();
			  desireElement.add("Vivo x200 pro");
			  desireElement.add("Samsung s26 Ultra");
			  desireElement.add("oneplus 15r");
			  desireElement.add("nothing 4a pro");

	          WebDriver driver = new ChromeDriver();

	          driver.manage().window().maximize();

	          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	          driver.get("https://www.amazon.in/");
	          
	          for(String ele:desireElement) {
	        	  	WebElement searchField = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	        	  		searchField.clear();
	        	  		searchField.sendKeys(ele);
	        	  		Thread.sleep(2000);
	        	  		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
	                  .click();
	        	  		String actualAttributeValue = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).getAttribute("value");

	        	  		if (actualAttributeValue.equals(ele)) {
	        	  			System.out.println("The Desired Product is sent to backend");
	        	  		}
	        	  		else{
	        	  			System.out.println("the Desired Product is not sent to backend");
	                 }
	          }
	      }
	      catch (Exception e)
	      {
	          e.printStackTrace();
			
		 }
		
		}	
		
	}


