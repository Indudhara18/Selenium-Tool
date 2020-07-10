package uploadAnddownload_20;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DownloadFromSelenium 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		
	
		WebDriver driver = new FirefoxDriver();								// use firefox to get the download popup
						// if you use chrome browser you will not get download popup, it will just download directly 
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org");
	
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.titleContains("SeleniumHQ Browser Automation"));
		
		// identify download tab and click on it
		driver.findElement(By.xpath("//a[text()='Downloads']")).click();
		
		wait.until(ExpectedConditions.titleContains("Downloads"));
		WebElement Paragraph = driver.findElement(By.xpath("//h2[contains(text(),'Selenium Client & WebDriver Language Bindings')]"));
		int yaxis = Paragraph.getLocation().getY();
		
		// type cast inorder to inject Javascript
		JavascriptExecutor jse = ( JavascriptExecutor ) driver ;
		jse.executeScript("window.scrollBy(0,"+yaxis+")");
		
		// identify download of C# and click on it
		driver.findElement(By.xpath("//td[text()='C#']/../td[4]/a[1]")).click();	// click() also works
	
		Thread.sleep(1000);
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);		
	
	}
}
