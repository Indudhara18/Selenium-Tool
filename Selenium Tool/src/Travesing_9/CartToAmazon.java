package Travesing_9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartToAmazon 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("http:amazon.com");
		Thread.sleep(3000);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Thread.sleep(5000);
		searchbox.sendKeys("iphone 11" , Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Simple Mobile - Apple iPhone 11 Pro Max (64GB) - Silver']")).click(); ;
//		Thread.sleep(5000);
//		
//		WebElement price = driver.findElement(By.xpath("//a[text()='Apple Silicone Case (for iPhone 11 Pro) - Pomegranate']/../div[1]/span/span"));
//		Thread.sleep(3000);
//		System.out.println(price.getText());
//		
//		WebElement price$ = driver.findElement(By.xpath("//a[text()='Apple Silicone Case (for iPhone 11 Pro) - Pomegranate']/../div[1]/span/span/span[1]"));
//		Thread.sleep(3000);
//		System.out.println(price$.getText());
//	
//		WebElement price42 = driver.findElement(By.xpath("//a[text()='Apple Silicone Case (for iPhone 11 Pro) - Pomegranate']/../div[1]/span/span/span[2]"));
//		Thread.sleep(3000);
//		System.out.println(price42.getText());
//
//		WebElement pricedot = driver.findElement(By.xpath("//a[text()='Apple Silicone Case (for iPhone 11 Pro) - Pomegranate']/../div[1]/span/span/span[3]"));
//		Thread.sleep(3000);
//		System.out.println(pricedot.getText());
//
//		WebElement price68 = driver.findElement(By.xpath("//a[text()='Apple Silicone Case (for iPhone 11 Pro) - Pomegranate']/../div[1]/span/span/span[4]"));
//		Thread.sleep(3000);
//		System.out.println(price68.getText());
//
		
		//		driver.close();
		
	}
}
