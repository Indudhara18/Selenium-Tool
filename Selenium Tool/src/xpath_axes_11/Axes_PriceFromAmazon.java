package xpath_axes_11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Axes_PriceFromAmazon 
{

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("MacBook" , Keys.ENTER); 
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("( //span[contains( text() , 'Apple MacBook Air (13-inch, Previous Model, 8GB RAM, 128GB Storage, 1.6GHz Intel Core i5) - Gold' ) ] ) // ancestor :: div[@class='sg-col-inner'][3]/descendant::span[@class='a-price-whole']")) ;
		System.out.println(price.getText());
		Thread.sleep(3000);
		WebElement originalprice = driver.findElement(By.xpath("//span[contains(text() , 'Apple MacBook Air (13-inch, Previous Model, 8GB RAM, 128GB Storage, 1.6GHz Intel Core i5) - Gold')] // ancestor :: div[@class='sg-col-inner'][3] // descendant :: span[@aria-hidden='true'][2]"));
		System.out.println( originalprice.getText());
	
		
		WebElement savings = driver.findElement(By.xpath("//span[contains(text() , 'Apple MacBook Air (13-inch, Previous Model, 8GB RAM, 128GB Storage, 1.6GHz Intel Core i5) - Gold')] // ancestor :: div[@class='sg-col-inner'][3] // descendant :: span[@class='a-letter-space'][1]"));
		System.out.println( savings.getText());
		//driver.close();
	}
}
