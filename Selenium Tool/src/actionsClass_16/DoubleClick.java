package actionsClass_16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	
	public static void main(String[] args) throws InterruptedException 	
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://drive.google.com/drive/my-drive");
		
		driver.findElement(By.name("identifier")).sendKeys("indudharaqsp123@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		driver.findElement(By.name("password")).sendKeys("");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement javafolder = driver.findElement(By.xpath("//div[text()='java']"));
		
		Actions act = new Actions(driver) ;
		act.doubleClick(javafolder).perform();
		
	}
}
