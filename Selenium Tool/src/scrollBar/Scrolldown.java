package scrollBar;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scrolldown 
{
	static
	{
		System.setProperty("webdriver.chrome.driver" , "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://indudharagowdaacer/login.do");
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleContains("actiTIME - Login"));
		
		String pwh = driver.getWindowHandle() ;
		System.out.println("Parent window title is " + driver.getTitle());
		
		driver.findElement(By.id("licenseLink")).click();
		Thread.sleep(2000);
		
		Set<String> whr = driver.getWindowHandles() ;
		System.out.println("After removal no of windows present is :" + whr.size());
		// from collection of window reference remove parent window 
		whr.remove(pwh);
		System.out.println("After removal no of windows present is :" + whr.size() );
		
		System.out.println("Child window title is " + driver.getTitle());
		
		for (String windowreference : whr) 
		{
			driver.switchTo().window(windowreference);
			driver.manage().window().maximize();
			WebElement miscelanious = driver.findElement(By.xpath("//h2[text()='13. Miscellaneous']"));
			int yaxis = miscelanious.getRect().getY() ;
			System.out.println( yaxis );
			//type casting to JavascriptExecutor type
			JavascriptExecutor jse = (JavascriptExecutor) driver ;
			// scrolldown upto (miscelanious) yaxis
			jse.executeScript("window.scrollBy(0,"+yaxis+")");
			
			Thread.sleep(2000);
			
			// scrollup upto Upgrades 
			WebElement upgrades = driver.findElement(By.xpath("//h2[text()='4. Upgrades']")) ;
			int yaxisnew = upgrades.getLocation().getY() ;

			jse.executeScript("window.scrollBy(0,"+-yaxisnew+")");
		
		}
	}
	
}



