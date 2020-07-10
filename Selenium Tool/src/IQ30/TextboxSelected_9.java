package IQ30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextboxSelected_9 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		boolean textbox = driver.findElement(By.xpath("//input[@name='q']")).isSelected() ;
		System.out.println( "Text Book is Enabled :" + textbox);
		driver.close();
	}
	
}
