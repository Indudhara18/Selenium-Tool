package iframe_21;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFrame 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException  
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Manu/Desktop/html%20files/P1.html");
		
		WebElement unTB = driver.findElement(By.id("t1"));
		WebElement frame = driver.findElement(By.id("f1"));
		WebElement qsplink =  driver.findElement(By.xpath("//a[text()=' QSP ']"));
		
		unTB.sendKeys("Hamster");
		
		driver.switchTo().frame(0);				// switchTo() frame with the help of index
		WebElement pwTB = driver.findElement(By.id("t2"));
		pwTB.sendKeys("German Shepard");
		
		
		driver.switchTo().parentFrame();	// from current frame to its immediate parent frame

		qsplink.click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
//		driver.switchTo().defaultContent();
		unTB.clear();
		unTB.sendKeys("Tea Cup puppy");
		
		driver.switchTo().frame("f1");		// switchTo() frame with the help of String
		pwTB.clear();
		pwTB.sendKeys("Husky");
		
		driver.switchTo().defaultContent();	// from current frame to main frame
		unTB.clear();
		unTB.sendKeys("Belgian Malinois");
		
		driver.switchTo().frame( frame ) ;		// switchTo() frame with the help of WebElemnt
		pwTB.clear();
		pwTB.sendKeys("Doberman");
				
	}
}
