package xpath_by_text_8;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class CartToFlipkart 
{		
	static
	{	
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException 
	{
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.flipkart.com");
			
			//ENTER THE EMAIL ID
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class = '_2zrpKA _1dBPDZ']")).sendKeys("nehaetagi@gmail.com");
			
			//ENTER THE PWD
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@class = '_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("murugesh987@");
			
			//CLICK ON LOGIN BUTTON
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class = '_2AkmmA _1LctnI _7UHT_c']")).click();
			
			//SEARCH FOR SHOES
			Thread.sleep(2000);
			driver.findElement(By.name("q")).sendKeys("television" , Keys.ENTER);
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[text()='Samsung Q Series 138cm (55 inch) Ultra HD (4K) Curved QLED Smart TV']")).click();
			
			Thread.sleep(5000);
			WebElement cart = driver.findElement(By.xpath("//button[@class = '_2AkmmA _2Npkh4 _2kuvG8 _7UHT_c']"));
			Thread.sleep(5000);
			cart.click();
			
			
			/*
			//CLICK ON SHOP NOW BUTTON
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[text() = 'Shop now']")).click();
			
			//NAVIGATE TO AMAZON PAGE
			driver.navigate().to("http:www.amazon.com");
			
			//flipkart
			Thread.sleep(1000);
			driver.navigate().back();
			
			//amazon
			Thread.sleep(1000);
			driver.navigate().forward();
			
			//back to flipkart
			Thread.sleep(5000);
			driver.navigate().back();
			
			//CLICK ON ELECTRONICS FEATURE
			driver.findElement(By.xpath("//span[@class= '_1QZ6fC _3Lgyp8' and text() = 'Electronics']")).click();
			
			//CLICK ON TV & APPLIANCES FEATURE
			Thread.sleep(5000);
			driver.findElement(By.xpath("//span[@class = '_1QZ6fC _3Lgyp8' and text() = 'TVs & Appliances']")).click();
			
			//CLICK ON TELEVISIONS IN TV & APPLIANCES FEATURE
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("a[title= 'Television']")).click();
			
			//SELECT ONE TV AND CLICK ON IT -- BAD LUCK NO ADD TO CART OPTION - SO BUY SOMETHING ELSE:p
			Thread.sleep(5000);
			driver.findElement(By.xpath("//div[@class = 'iUmrbN' and contains(text() , '4A Pro 108')]")).click();
			
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@class = '_2AkmmA _2Npkh4 _2MWPVK' and text() = 'ADD TO CART']")).click();
		*/}
}

