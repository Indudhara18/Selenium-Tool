package xpath_by_text_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

public class Flipkart 
{
	static
	{
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException
	{	
		//open browser
		WebDriver driver = new ChromeDriver() ;
		//maximize browser
		driver.manage().window().maximize();
		//enter url
		driver.get("http://www.flipkart.com");
		//enter username
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("indudhara18@gmail.com");
		//enter password
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("1memy$elf");
		//click on login button
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click(); 
		//wait 3seconds
		Thread.sleep(3000);
		Object Keys;
		//enter in search text box 
		driver.findElement(By.xpath("//input [ @name='q' and @class='LM6RPg' ]")).sendKeys("shoes in men" ) ; //, Keys.ENTER );
		//click on search icon
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		Thread.sleep(3000);
		//sort by high to low
		driver.findElement(By.xpath("//div[contains ( text(),'High to Low')]")).click();
		Thread.sleep(3000);
		//select only woodland shoes
		driver.findElement(By.xpath("//div[@class='_1GEhLw' and text()='Woodland']")).click();
		driver.findElement(By.xpath("//div[@class='2aUbKa']")).click();
	//	driver.findElement(By.xpath("//input[@class='_3vKPvR' and @placeholder='Search Brand']")).sendKeys("Nike" , Keys.ENTER);
	}
	
}
