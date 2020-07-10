package IQ30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed_7
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
 		 WebDriver driver = new ChromeDriver() ;
 		 driver.get("http://www.google.com");
 		 boolean textbox = driver.findElement(By.xpath("//input[@name='q']")).isDisplayed();
 		 System.out.println( "Textbox is present: " + textbox );
 		 driver.close();
	}	  
}
