package popUps_19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NotificationPopup 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions() ;
	 	options.addArguments("--disable-notifications");
		
	 	WebDriver driver = new ChromeDriver(options) ;
	 	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
	 	driver.manage().window().maximize();
	 	driver.get("http://www.myntra.com");
	 	
	 	WebDriverWait wait = new WebDriverWait(driver, 10);
	 	wait.until(ExpectedConditions.titleContains("Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra"));
	 	
	 	
	}
}
