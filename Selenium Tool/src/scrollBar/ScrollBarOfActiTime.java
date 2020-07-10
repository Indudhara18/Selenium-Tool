package scrollBar;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollBarOfActiTime 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe") ;
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 10) ;
		
		driver.get("http://indudharagowdaacer/login.do");
		String pwh = driver.getWindowHandle() ;
		// identify license link 
		WebElement license = driver.findElement(By.id("licenseLink"));
		// click on license link
		license.click();
	//	wait.until(ExpectedConditions.titleContains("actiTIME License Agreement")) ;
		Set<String> whr = driver.getWindowHandles() ;
		for (String sessionId : whr) 
		{
			driver.switchTo().window(sessionId) ;
			if( sessionId . equals( pwh ) )
			{
				String pTitle = driver.getTitle() ;
				System.out.println("Parent window title " + pTitle);
			}
			
			else
			{
				driver.manage().window().maximize();
				// identify Termination paragraph from ActiTIME License Agreement page
				WebElement termination = driver.findElement(By.xpath("//h2[text()='6. Termination']"));
				// identify the location of termination
				int yaxis = termination.getLocation().getY() ;
				// type casting to JavascriptExecutor type
				JavascriptExecutor jse = (JavascriptExecutor) driver ;
				Thread.sleep(2000);
				// injecting javascript at the run time, which will open console in the dom page and do actions given in the String
				jse.executeScript("window.scrollBy(0,"+yaxis+")") ;		
			}	
		}
		
	}
}
