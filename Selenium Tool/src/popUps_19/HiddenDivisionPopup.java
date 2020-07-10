package popUps_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiddenDivisionPopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		driver.get("http://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.get("http://www.irctc.co.in");
	
		wait.until(ExpectedConditions.titleContains("IRCTC Next Generation eTicketing System")) ;
		driver.findElement(By.id("loginText")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='fa fa-window-close pull-right']")).click();
		
		
	}
	
}
