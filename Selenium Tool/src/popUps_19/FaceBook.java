package popUps_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FaceBook 
{
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeOptions options = new ChromeOptions() ;
	 	options.addArguments("--disable-notifications");		
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		WebDriverWait wait = new WebDriverWait(driver, 10);	
		wait.until(ExpectedConditions.titleContains("Facebook – log in or sign up"));	
		driver.findElement(By.id("email")).sendKeys("anushamysore1@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9663262353",Keys.ENTER);
		wait.until(ExpectedConditions.titleContains("Facebook"));
	 	driver.findElement(By.name("q")).sendKeys("pooja es gowda",Keys.ENTER);
		wait.until(ExpectedConditions.titleContains("(37) pooja es gowda – Facebook Search"));
		options.addArguments("--disable-notifications");
	 	driver.findElement(By.xpath("//a[text()='Pooja E S Gowda']/../../../div[2]/span/div/div/button[1]")).click();	
	}	
}
