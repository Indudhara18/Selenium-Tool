package popUps_19;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowser 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	
	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions() ;
		options.addArguments("--disable-notifications") ;
		
	//	WebDriver driver = new FirefoxDriver() ;
		WebDriver driver = new ChromeDriver(options) ;
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com");
		
		String ptab = driver.getWindowHandle() ;
		Set<String> whr = driver.getWindowHandles() ;	
		
		for (String tab : whr) 
		{
			driver.switchTo().window(tab);
			String title = driver.getTitle() ;
			if ( tab . equals(ptab) ) 
			{
				System.out.println("when parent tab is there Do nothing");
			}	
			else if( title .equals( "Tech Mahindra" ) ) 
			{
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//img[@alt='Tech Mahindra']")).click();
			 	int yaxis = driver.findElement(By.xpath("//h3[text()='Hiring For Front-end Engineer']")).getLocation().getY();
				
			 	JavascriptExecutor jse = (JavascriptExecutor) driver ;
			 	jse.executeScript("window.scrolBy(0,"+yaxis+")");
			 	
			}
		}	
		
	}		
}
