package IQ30;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDataInTextBox2 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
 		  WebDriver driver = new ChromeDriver() ;
 		  driver.get("http://www.google.com");
 		  driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("mike tyson" , Keys.ENTER);
 		  driver.findElement(By.xpath("//input[@name='q']")).clear();
	}
}
