package class_Assignment_27;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver ;
	
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone 11 pro" , Keys.ENTER);
		WebElement emi = driver.findElement(By.xpath("//div[text()='Apple iPhone 11 Pro (Silver, 64 GB)']/../../div[2]/div[4]/div[2]"));
		String emiprice = emi.getText();
		System.out.println( "Phone emi price is :" + emiprice);
		
		
	}
}
